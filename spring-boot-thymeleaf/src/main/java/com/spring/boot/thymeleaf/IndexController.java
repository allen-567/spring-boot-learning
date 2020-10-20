package com.spring.boot.thymeleaf;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @Auther: 滕飞
 * @Date: 2019/8/13 13:58
 * @Description: SpringBoot集成thymeleaf
 */
@Controller
public class IndexController {

    @GetMapping("/hello")
    public String hello(@RequestParam(defaultValue = "world", required = false) String name, Model model) {
        model.addAttribute("name", name);
        return "index";
    }

}
