package com.example.RentasCuarto.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {
    public MainController() {

    }

    @GetMapping("/")
    public String index() {
        return "index"; // Devuelve el nombre del archivo HTML sin extensión (por ejemplo, "index" si es HTML estático).
    }
}
