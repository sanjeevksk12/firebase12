package com.gw.hrconnect.service.api;

public class CountryNotFoundException extends RuntimeException {

    private static final long serialVersionUID = -3891534644498426670L;

    public CountryNotFoundException(String countryId) {
        super("No such country with id: " + countryId);
    }
}

