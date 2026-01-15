package com.url.shortner.snipLytix.controller;

import com.url.shortner.snipLytix.dto.LoginRequest;
import com.url.shortner.snipLytix.dto.RegisterRequest;
import com.url.shortner.snipLytix.security.jwt.JwtAuthenticationResponse;
import com.url.shortner.snipLytix.model.User;
import com.url.shortner.snipLytix.service.UserService;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@RequestMapping("/api/auth")
@AllArgsConstructor
public class AuthController {

    private final UserService userService;

    // LOGIN
    @PostMapping("/login")
    public ResponseEntity<?> loginUser(@RequestBody LoginRequest loginRequest) {
        try {
            JwtAuthenticationResponse response =
                    userService.authenticateUser(loginRequest);
            return ResponseEntity.ok(response);
        } catch (Exception e) {
            return ResponseEntity.status(401)
                    .body(Map.of("message", "Invalid email or password"));
        }
    }

    // REGISTER
    @PostMapping("/register")
    public ResponseEntity<?> registerUser(@RequestBody RegisterRequest registerRequest) {
        try {
            User user = new User();
            user.setUsername(registerRequest.getUsername());
            user.setEmail(registerRequest.getEmail());
            user.setPassword(registerRequest.getPassword()); // RAW password
            user.setRole("ROLE_USER");

            userService.registerUser(user);

            return ResponseEntity.ok(
                    Map.of("message", "User registered successfully")
            );

        } catch (Exception e) {
            e.printStackTrace();
            return ResponseEntity.status(401)
                    .body(Map.of(
                            "message", e.getClass().getSimpleName(),
                            "detail", e.getMessage()
                    ));
        }
    }
}
