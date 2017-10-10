package com.restSample.services.impl;

import com.restSample.services.HelloWorldService;
import lombok.extern.slf4j.Slf4j;
import org.redisson.api.RLock;
import org.redisson.api.RedissonClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

import java.util.Random;


@Slf4j
@Service
public class HelloWorldServiceImpl implements HelloWorldService {


    @Override
    public String getHello()  {

        return "Hello World";
    }



}
