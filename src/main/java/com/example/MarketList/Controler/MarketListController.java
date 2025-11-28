package com.example.MarketList.Controler;




import com.example.MarketList.Repository.MarketListRepository;
import com.example.MarketList.Service.MarketListService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/MarketList")
public class MarketListController{

    @Autowired
    private MarketListService marketListService;

    @PostMapping("/AddProduct")
    public String addProduct(){
        return "O produto com o nome: " + marketListService.getProductName() + "\bcom o valor: " + marketListService.getProductValue() + "Foi adicionado";
    }

    @GetMapping("/HelloWorld")
    public String HelloWorld(){
        return "Hello world";
    }
}
