package com.example.WEEK_7_TASK.DTO;

import com.example.WEEK_7_TASK.Entity.User;
import lombok.Data;

@Data
public class ResponseDTO {
    private String message;
    private User data;
    private boolean status;
}
