package com.mertosi.hexagonalarchitecture.application.mapper;

import com.mertosi.hexagonalarchitecture.application.port.in.command.CreateLogCommand;
import com.mertosi.hexagonalarchitecture.domain.Log;
import org.mapstruct.Mapper;

@Mapper
public interface CreateLogCommandToDomainMapper extends BaseMapper<CreateLogCommand, Log> {
}
