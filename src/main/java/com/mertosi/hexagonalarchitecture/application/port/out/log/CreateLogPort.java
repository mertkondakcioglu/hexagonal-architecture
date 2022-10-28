package com.mertosi.hexagonalarchitecture.application.port.out.log;

import com.mertosi.hexagonalarchitecture.domain.Log;

public interface CreateLogPort {
    Log create(Log domain);
}
