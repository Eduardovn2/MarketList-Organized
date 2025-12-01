package com.example.MarketList.Service;

import com.example.MarketList.Entity.MarketListEntity;
import com.example.MarketList.Repository.MarketListRepository;
import org.springframework.stereotype.Service;


@Service
public class MarketListService extends MarketListEntity {

    public MarketListRepository marketListRepository;

    public MarketListService(MarketListRepository marketListRepository){
        this.marketListRepository = marketListRepository;
    }

    public MarketListEntity saveProduct(String productName, int productValue) {

        MarketListEntity newProduct = new MarketListEntity();
        newProduct.setProductName(productName);
        newProduct.setProductValue(productValue);

       return this.marketListRepository.save(newProduct);
   }
}
