package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ProdutoController {
    @GetMapping("/produtos")
    public String produtos(Model model) {
        // Lógica para a página de produtos
        return "produtos";
    }
}
