package com.mertosi.hexagonalarchitecture.application.port.in.usecase;

import com.mertosi.hexagonalarchitecture.application.port.in.command.CreateLogCommand;
import com.mertosi.hexagonalarchitecture.domain.Log;

import javax.validation.Valid;

public interface CreateLogUseCase {
    Log create(@Valid CreateLogCommand command);
}
