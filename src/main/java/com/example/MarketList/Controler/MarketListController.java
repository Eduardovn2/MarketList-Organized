package com.example.MarketList.Controler;




import com.example.MarketList.Entity.MarketListEntity;
import com.example.MarketList.Repository.MarketListRepository;
import com.example.MarketList.Service.MarketListService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/MarketList")
public class MarketListController{

    @Autowired
    private MarketListService marketListService;

    @PostMapping("/AddProduct")
    public String addProduct(@RequestBody MarketListEntity productData){
        String message = "";
        MarketListEntity savedProduct = marketListService.saveProduct(
                productData.getProductName(),
                productData.getProductValue()
        );
        message = "O produto:" + savedProduct.getProductName() + " Com valor de R$" + savedProduct.getProductValue() + ", foi adicionado.";


        return  new String(message);
    }

    @PutMapping("/ReplaceProduct")
    public String replaceProduct(@RequestBody MarketListEntity productData){
        String message ="";
        MarketListEntity replaceProduct = marketListService.

    }

    @GetMapping("/HelloWorld")
    public String HelloWorld(){
        return "Hello world";
    }
}
