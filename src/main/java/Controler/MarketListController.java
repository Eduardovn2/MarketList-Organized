package Controler;


import com.example.MarketList.Service.MarketListService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@org.springframework.stereotype.Controller
@RestController
@RequestMapping("/MarketList")
public class Controller extends MarketListService {

    public MarketListService marketListService;

    public Controller(MarketListService marketListService) {
        this.marketListService = marketListService;
    }

    @RequestMapping("a")
    @GetMapping("/EEduardo")
    public String setProductName(String productName){

    }
}
