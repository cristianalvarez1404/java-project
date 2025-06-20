package com.dailycodework.dreamshops.response;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@Data
public class ApiResponse {
    private String message;
    private Object data;
}