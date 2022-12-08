package com.gient.training3task1;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.messaging.Processor;

@SpringBootApplication
@EnableBinding(value = {Source.class, Sink.class})
@Slf4j
public class Training3task1Application {
    public static void main(String[] args) {
        SpringApplication.run(Training3task1Application.class, args);
    }
}
