package com.mertosi.hexagonalarchitecture.adapter.out.log;

import com.mertosi.hexagonalarchitecture.application.port.out.log.CreateLogPort;
import com.mertosi.hexagonalarchitecture.domain.Log;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;

@Component
@Slf4j
public class LogAdapter implements CreateLogPort {
    @Override
    public Log create(Log domain) {
        domain.setCreatedAt(LocalDateTime.now());
        log.info(String.valueOf(domain));
        return domain;
    }
}
