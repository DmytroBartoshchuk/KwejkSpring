package pl.akademiakodu.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * Created by DmytroBartoshchuk on 31.03.2017.
 */
@Controller
public class GifController {

    @GetMapping("/")
    public String listGifs(){
        return "home";
    }
}
