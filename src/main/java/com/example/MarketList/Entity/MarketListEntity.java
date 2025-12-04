package com.example.MarketList.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

//Modelo do banco de dados que não deve ser exposto.
@Entity
public class MarketListEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Getter
    private long id;

    @Setter
    @Getter
    private String productName;

    @Setter
    @Getter
    private long productValue;
}
