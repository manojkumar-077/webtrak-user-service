package com.webtrak.user.dto;

import com.webtrak.user.enums.UserType;
import lombok.Data;

@Data
public class RegisterRequest {
    private String name;
    private String email;
    private String password;
    private String employeeId;
    private UserType userType;
}
