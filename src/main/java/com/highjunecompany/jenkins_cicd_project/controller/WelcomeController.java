package com.highjunecompany.jenkins_cicd_project.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Date;

@Slf4j
@Controller
public class WelcomeController {

    @GetMapping("/")
    public String index(Model model) {
        log.debug("Welcome to highjune company.com...");

        model.addAttribute("msg", getMessage());
        model.addAttribute("today", new Date());
        System.out.println(model.getAttribute("today"));

        return "index";
    }

    private String getMessage() {
        return "Hi, there";
    }
}
