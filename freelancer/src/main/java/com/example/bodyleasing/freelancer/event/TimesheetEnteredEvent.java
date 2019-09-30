package com.example.bodyleasing.freelancer.event;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

@Data
public class TimesheetEnteredEvent implements Serializable {
    private Date timestamp;
}
