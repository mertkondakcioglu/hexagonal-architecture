package com.mertosi.hexagonalarchitecture.application.mapper;

public interface BaseMapper<S, T> {
    T map(S source);
}
