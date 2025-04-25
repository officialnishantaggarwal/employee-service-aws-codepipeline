package com.luv2code.TestingApp.services.impl;

import com.luv2code.TestingApp.services.DataService;
import org.springframework.stereotype.Service;

@Service
//@Profile("dev")
public class DataServiceImplDev implements DataService {

    @Override
    public String getData() {
        return "Dev Data";
    }
}
