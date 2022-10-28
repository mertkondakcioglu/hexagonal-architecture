package com.mertosi.hexagonalarchitecture.application.port.in.command;

import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.NotBlank;

@Getter
@Setter
public class CreateLogCommand {
    @NotBlank
    private String message;
}
