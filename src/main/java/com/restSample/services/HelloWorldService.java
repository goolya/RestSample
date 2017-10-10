package com.restSample.services;

import org.springframework.retry.annotation.Backoff;
import org.springframework.retry.annotation.Retryable;
import org.springframework.stereotype.Service;


@Service
public interface HelloWorldService {


    @Retryable(maxAttempts = 10,value={IllegalArgumentException.class},backoff = @Backoff(delay = 5000,multiplier=1.5))
    String getHello();


}
