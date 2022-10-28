package com.mertosi.hexagonalarchitecture.adapter.in.web.dto.request;

import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.NotBlank;

@Getter
@Setter
public class CreateLogRequest {
    @NotBlank
    private String message;
}
