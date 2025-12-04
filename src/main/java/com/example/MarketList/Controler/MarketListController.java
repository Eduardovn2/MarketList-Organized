package com.example.MarketList.Controler;




import com.example.MarketList.DTO.MarketListDTO;
import com.example.MarketList.Entity.MarketListEntity;
import com.example.MarketList.Repository.MarketListRepository;
import com.example.MarketList.Service.MarketListService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.yaml.snakeyaml.error.Mark;

@RestController
@RequestMapping("/MarketList")
public class MarketListController{

    @Autowired
    private MarketListService marketListService;

    //Adiciona um produto e criar seu ID sequencial.
    @PostMapping("/AddProduct")
    public MarketListEntity addProduct(
            @RequestBody MarketListDTO dto){

        return marketListService.saveProduct(dto);
    }

    //Update de produto ja existente apartir do seu id.
    @PutMapping("/UpdateProduct/{id}")
    public MarketListEntity updateProduct(
            @PathVariable long id,
            @RequestBody MarketListDTO dto){

        return marketListService.updateProduct(id, dto);

    }

}
