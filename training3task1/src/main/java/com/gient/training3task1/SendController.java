package com.gient.training3task1;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.messaging.support.MessageBuilder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@Slf4j
public class SendController {

    @Autowired
    private Source source;

    @GetMapping("/")
    public void send() {
        source.output().send(MessageBuilder.withPayload("HelloWorld...")
                .setHeader("routingKey", "login.user.succeed")
                .setHeader("version", "1.0")
                .setHeader("x-delay", 5000)
                .build());
    }

}
