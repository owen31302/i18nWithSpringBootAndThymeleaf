package com.owen.i18nWithSpringBootAndThymeleaf.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author yuchlin on 3/27/20
 */
@Controller
public class HomeController {

    @GetMapping("/")
    String home() {
        return "home";
    }
}
