package com.mertosi.hexagonalarchitecture.adapter.mapper;

import com.mertosi.hexagonalarchitecture.adapter.in.web.dto.request.CreateLogRequest;
import com.mertosi.hexagonalarchitecture.application.mapper.BaseMapper;
import com.mertosi.hexagonalarchitecture.application.port.in.command.CreateLogCommand;
import org.mapstruct.Mapper;

@Mapper
public interface CreateLogRequestToCommandMapper extends BaseMapper<CreateLogRequest, CreateLogCommand> {
}
