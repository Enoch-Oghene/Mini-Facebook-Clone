package com.example.WEEK_7_TASK.Service;

import com.example.WEEK_7_TASK.DTO.ResponseDTO;
import com.example.WEEK_7_TASK.Entity.User;

public interface UserService {
    ResponseDTO addUser(User user);

    ResponseDTO logInUser(User user);
}
