package com.purelighters.purelighters.Controllers;


import com.purelighters.purelighters.domain.Order;
import com.purelighters.purelighters.repository.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class myController {
    @Autowired
    private OrderRepository orderRepository;

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
    public String checkout(Model model) {
        model.addAttribute("order", new Order());
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

    @PostMapping("/placeOrder")
    public String placeOrder(@ModelAttribute Order order, Model model) {
        orderRepository.save(order);
        System.out.println(order);
        return "orderSuccess"; // Redirect to a success page
    }
}
