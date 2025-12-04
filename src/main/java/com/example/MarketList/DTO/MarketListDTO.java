package com.example.MarketList.DTO;

//Objeto para enviar e receber dados JSON.
public class MarketListDTO {

    //Parametro JSON
    private String productName;

    //Parametro JSON
    private long productValue;

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public long getProductValue() {
        return productValue;
    }

    public void setProductValue(long productValue) {
        this.productValue = productValue;
    }
}
