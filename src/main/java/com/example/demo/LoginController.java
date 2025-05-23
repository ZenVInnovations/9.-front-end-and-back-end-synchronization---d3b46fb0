package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@Controller
public class LoginController {

    private Map<String, String> registeredUsers = new HashMap<>();

    @GetMapping("/register")
    public String showRegisterPage() {
        return "register"; // Serve register.html
    }

    @PostMapping("/register")
    public String handleRegister(@RequestParam String username,
                                 @RequestParam String email,
                                 @RequestParam String password,
                                 Model model) {
        if (registeredUsers.containsKey(username)) {
            model.addAttribute("error", "Username already exists.");
            return "register"; // Reload register.html with an error message
        }
        registeredUsers.put(username, password);
        model.addAttribute("message", "Registration successful! Please login.");
        return "login"; // Redirect to login.html
    }

    @GetMapping("/login")
    public String showLoginPage() {
        return "login"; // Serve login.html
    }

    @PostMapping("/login")
    public String handleLogin(@RequestParam String username,
                              @RequestParam String password,
                              Model model) {
        if (registeredUsers.containsKey(username) && registeredUsers.get(username).equals(password)) {
            return "main"; // Redirect to main.html
        } else {
            model.addAttribute("error", "Invalid username or password.");
            return "login"; // Reload login.html with an error message
        }
    }

    @GetMapping("/main")
    public String showMainPage() {
        return "main"; // Serve main.html
    }
}