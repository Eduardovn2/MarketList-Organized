package com.example.MarketList.Service;

import Exceptions.IdNotFound;
import com.example.MarketList.DTO.MarketListDTO;
import com.example.MarketList.Entity.MarketListEntity;
import com.example.MarketList.MarketListApplication;
import com.example.MarketList.Repository.MarketListRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;
import java.util.Map;
import java.util.Optional;


@Service
public class MarketListService extends MarketListEntity {

    public MarketListRepository marketListRepository;

    public MarketListService(MarketListRepository marketListRepository){
        this.marketListRepository = marketListRepository;
    }

    public MarketListEntity saveProduct(@RequestBody MarketListDTO dto) {

        MarketListEntity newProduct = new MarketListEntity();
        newProduct.setProductName(dto.getProductName());
        newProduct.setProductValue(dto.getProductValue());

       return marketListRepository.save(newProduct);
   }

   public MarketListEntity updateProduct(@PathVariable long id
                                        ,@RequestBody MarketListDTO dto){

        //Procura um id requisitado. caso nao ache, dispara uma exception.
        MarketListEntity product= marketListRepository.findById(id)
                .orElseThrow(() -> new IdNotFound(id));

        //Seta novos nomes e valores.
       product.setProductName(dto.getProductName());
       product.setProductValue(dto.getProductValue());

       //Retorna o produto salva no repository.
       return marketListRepository.save(product);
    }

    //Procura tudo que contem em marketlistrepository.
    public List<MarketListEntity> getMarketListRepository() {
        return marketListRepository.findAll();
    }

    public List<MarketListEntity> deleteProductById(@PathVariable long id){
        marketListRepository.findById(id)
                .orElseThrow(() -> new IdNotFound(id));

        marketListRepository.deleteById(id);
        return getMarketListRepository();
    }
    /*
    * public List<MarketListEntity> deleteProductByName(@PathVariable String name){
        marketListRepository.find(name)
                .orElseThrow(() -> new IdNotFound(name));

        marketListRepository.deleteById(name);
        return getMarketListRepository();
    */


}
