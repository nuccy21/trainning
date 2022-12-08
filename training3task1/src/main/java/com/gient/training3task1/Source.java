package com.gient.training3task1;

import org.springframework.cloud.stream.annotation.Output;
import org.springframework.messaging.MessageChannel;

public interface Source {
    String OUTPUT = "output";

    @Output("output")
    MessageChannel output();
}
