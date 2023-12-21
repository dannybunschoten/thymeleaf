package com.purelighters.purelighters.Controllers;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class myController {

    @GetMapping("/home")
    public String home() {
        return "redirect:/";
    }
    @GetMapping("/main")
    public String mainnn() {
        return "redirect:/";
    }

    @GetMapping("/")
    public String mainn() {
        return "main";
    }

    @GetMapping("/About-us")
    public String about() {
        return "About-us";
    }

    @GetMapping("/Contact")
    public String contact() {
        return "Contact";
    }

    @GetMapping("/checkout")
    public String checkout() {
    	return "checkout";
    }

    @GetMapping("/FAQ")
    public String faq() {
    	return "FAQ";
    }

    @GetMapping("/shopping-cart")
    public String shoppingcart() {
    	return "shopping-cart";
    }
}
