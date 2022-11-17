package com.gient.training2task2.model;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;


@Data
public class DateResponse implements Serializable {
    private static final long serialVersionUID = -8091879091924046844L;
    private final int infoCode;
    private final long time;
    private final Date date;
}
