package com.project.santanderDevWeek.exceptions;

import com.project.santanderDevWeek.util.MessageUtils;

public class NotFoundException extends RuntimeException {

    public NotFoundException(){
        super(MessageUtils.NO_RECORDS_FOUND);
    }
}
