package com.mertosi.hexagonalarchitecture.adapter.in.web.dto.response;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class LogResponse {
    private String message;
    private LocalDateTime createdAt;
}
