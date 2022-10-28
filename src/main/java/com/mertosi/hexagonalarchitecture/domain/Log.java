package com.mertosi.hexagonalarchitecture.domain;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class Log {
    private String message;
    private LocalDateTime createdAt;

    public void addPrefix() {
        this.setMessage("Merdo ".concat(message));
    }
}
