package com.webtrak.user.dto;

import com.webtrak.user.enums.UserStatus;
import com.webtrak.user.enums.UserType;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class UserResponse {

    private Long id;
    private String employeeId;
    private String name;
    private String email;
    private UserType userType;
    private UserStatus status;
}
