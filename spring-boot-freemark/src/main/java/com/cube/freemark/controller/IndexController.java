package com.cube.freemark.controller;

import com.cube.freemark.model.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.text.ParseException;

/**
 * @Auther: 滕飞
 * @Date: 2018/8/13 17:52
 * @Description: freemark整合
 */
@Controller
public class IndexController {

    @GetMapping("/aboutMe")
    public String index(Model model) throws ParseException {
        User user = new User();
        user.setUsername("tengfei");
        user.setPassword("abc123");
        user.setAge(18);
        user.setSex(1);
        model.addAttribute("user", user);
        return "index";
    }

}
