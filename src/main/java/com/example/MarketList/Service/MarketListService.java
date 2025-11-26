package com.example.MarketList.Service;

import com.example.MarketList.Entity.MarketListEntity;
import com.example.MarketList.Repository.ListRepository;
import org.springframework.stereotype.Service;

@Service
public class MarketListService extends MarketListEntity {


    public void setProductName(String productName) {
        super.setProductName((productName));
    }

    public void setProductValue(Long productValue){
        super.setProductValue(productValue);
    }
}
