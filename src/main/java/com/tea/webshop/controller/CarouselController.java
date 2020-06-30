package com.tea.webshop.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Map;
@Controller
public class CarouselController {

        @GetMapping("carousel")
        public String header(Map<String, Object> model) {
            // model.put("message", "Welcome to Our Shop!");
            return "carousel";
        }
}
