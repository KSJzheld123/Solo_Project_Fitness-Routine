package org.koreait.fitness_routine.main;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Main {

    @RequestMapping("/main")
    public String mainHomepage() {

        return "main.html";
    }

    @RequestMapping("/login")
    public String login() {

        return "login.html";
    }
}
