package com.mertosi.hexagonalarchitecture.adapter.in.web;

import com.mertosi.hexagonalarchitecture.adapter.in.web.dto.request.CreateLogRequest;
import com.mertosi.hexagonalarchitecture.adapter.in.web.dto.response.LogResponse;
import com.mertosi.hexagonalarchitecture.adapter.mapper.CreateLogRequestToCommandMapper;
import com.mertosi.hexagonalarchitecture.adapter.mapper.LogDomainToResponseMapper;
import com.mertosi.hexagonalarchitecture.application.port.in.command.CreateLogCommand;
import com.mertosi.hexagonalarchitecture.application.port.in.usecase.CreateLogUseCase;
import com.mertosi.hexagonalarchitecture.domain.Log;
import lombok.RequiredArgsConstructor;
import org.mapstruct.factory.Mappers;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1/log")
public class LogController {
    private final CreateLogUseCase createLogUseCase;
    private static final CreateLogRequestToCommandMapper requestMapper = Mappers.getMapper(CreateLogRequestToCommandMapper.class);
    private static final LogDomainToResponseMapper domainMapper = Mappers.getMapper(LogDomainToResponseMapper.class);

    @PostMapping
    public LogResponse create(@RequestBody @Valid CreateLogRequest request) {
        CreateLogCommand command = requestMapper.map(request);
        Log domain = createLogUseCase.create(command);
        return domainMapper.map(domain);
    }
}
