package com.gient.training3task1;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.messaging.support.MessageBuilder;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Component
@Slf4j
public class ReceiveLog {

    @StreamListener(value = Sink.INPUT, condition = "headers['version']=='1.0'")
    public void receive(@Payload String message) {
        String msg = "Stream Receiver:" + message;
        log.error(msg);
    }

}
