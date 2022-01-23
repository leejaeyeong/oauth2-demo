package com.example.googlelogin.controller;

import com.example.googlelogin.dto.UserToken;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@Controller
@RequestMapping("/login")
@Slf4j
public class LoginController {

    @GetMapping
    public void login(HttpServletResponse httpServletResponse) throws IOException {

        httpServletResponse.sendRedirect("https://naver.com");
    }

    @GetMapping("/oauth2/code/google")
    public String auth(@RequestParam String code) {
        System.out.println(code);
//        System.out.println(userToken);
        return code;
    }

    @GetMapping("/oauth2/token/google")
    public String auth(UserToken userToken) {
        System.out.println(userToken);
        return null;
    }

}
