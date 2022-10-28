package com.mertosi.hexagonalarchitecture.application.service;

import com.mertosi.hexagonalarchitecture.application.mapper.CreateLogCommandToDomainMapper;
import com.mertosi.hexagonalarchitecture.application.port.in.command.CreateLogCommand;
import com.mertosi.hexagonalarchitecture.application.port.in.usecase.CreateLogUseCase;
import com.mertosi.hexagonalarchitecture.application.port.out.log.CreateLogPort;
import com.mertosi.hexagonalarchitecture.domain.Log;
import lombok.RequiredArgsConstructor;
import org.mapstruct.factory.Mappers;
import org.springframework.stereotype.Service;
import org.springframework.validation.annotation.Validated;

@Service
@RequiredArgsConstructor
@Validated
public class LogService implements CreateLogUseCase {
    private final CreateLogPort createLogPort;

    private static final CreateLogCommandToDomainMapper mapper = Mappers.getMapper(CreateLogCommandToDomainMapper.class);

    @Override
    public Log create(CreateLogCommand command) {
        Log domain = mapper.map(command);
        domain.addPrefix();
        return createLogPort.create(domain);
    }
}
