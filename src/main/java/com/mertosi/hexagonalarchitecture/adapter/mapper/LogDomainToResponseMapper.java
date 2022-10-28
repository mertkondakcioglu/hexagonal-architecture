package com.mertosi.hexagonalarchitecture.adapter.mapper;

import com.mertosi.hexagonalarchitecture.adapter.in.web.dto.response.LogResponse;
import com.mertosi.hexagonalarchitecture.application.mapper.BaseMapper;
import com.mertosi.hexagonalarchitecture.domain.Log;
import org.mapstruct.Mapper;

@Mapper
public interface LogDomainToResponseMapper extends BaseMapper<Log, LogResponse> {
}
