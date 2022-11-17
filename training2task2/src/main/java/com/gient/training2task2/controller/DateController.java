package com.gient.training2task2.controller;

import com.gient.training2task2.model.DateResponse;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import java.util.Date;


@Slf4j
@RestController
@CrossOrigin
public class DateController {

    @RequestMapping(path = "/xml/date", method = RequestMethod.GET, produces = "application/xml")
    public ResponseEntity<?> getXmlDate() {
        log.info("API xml/date");
        return ResponseEntity.ok(getDateResponse());
    }

    @RequestMapping(value = "/json/date", method = RequestMethod.GET)
    public ResponseEntity<?> getJsonDate() {
        log.info("API json/date");
        return ResponseEntity.ok(getDateResponse());
    }

    private DateResponse getDateResponse(){
        long time = System.currentTimeMillis();
        return new DateResponse(0, time, new Date(time));
    }

}
