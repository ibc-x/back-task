package com.fst.taskManager.dto;

import lombok.Data;

@Data
public class RegisterUserDTO {
    private String username;
    private String password;
    private String fullName;
}