package com.webtrak.user.service;

import com.webtrak.user.dto.UserResponse;
import com.webtrak.user.entity.User;
import com.webtrak.user.exception.UserNotFoundException;
import com.webtrak.user.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Service
@RequiredArgsConstructor
public class UserService {

    private final UserRepository userRepository;

    public UserResponse getUserByEmail(String email) {

        User user = userRepository.findByEmail(email)
                .orElseThrow(() ->
                        new UserNotFoundException("User not found with email: " + email));

        return new UserResponse(
                user.getId(),
                user.getEmployeeId(),
                user.getName(),
                user.getEmail(),
                user.getUserType(),
                user.getStatus()
        );
    }



}
