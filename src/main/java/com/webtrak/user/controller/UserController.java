package com.webtrak.user.controller;

import com.webtrak.user.dto.RegisterRequest;
import com.webtrak.user.entity.User;
import com.webtrak.user.enums.UserStatus;
import com.webtrak.user.repository.UserRepository;
import com.webtrak.user.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/users")
@RequiredArgsConstructor
public class UserController {

    private final UserRepository userRepository;
    private final PasswordEncoder passwordEncoder;

    @PostMapping("/create")
    public User createUser(@RequestBody RegisterRequest request) {

        User user = new User();
        user.setName(request.getName());
        user.setEmail(request.getEmail());
        user.setEmployeeId(request.getEmployeeId());
        user.setUserType(request.getUserType());
        user.setStatus(UserStatus.ACTIVE);

        user.setPassword(passwordEncoder.encode(request.getPassword()));

        return userRepository.save(user);
    }


}
