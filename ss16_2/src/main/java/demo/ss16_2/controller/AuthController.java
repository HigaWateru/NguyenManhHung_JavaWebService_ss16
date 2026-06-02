package demo.ss16_2.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AuthController {
    @GetMapping("/api/v1/auth/login")
    public String login() {
        return "API Public hoạt động!";
    }
}