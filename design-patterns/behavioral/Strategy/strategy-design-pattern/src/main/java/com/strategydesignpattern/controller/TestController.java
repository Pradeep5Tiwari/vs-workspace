package com.strategydesignpattern.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.strategydesignpattern.enums.EncodingPatternEnums;
import com.strategydesignpattern.factory.EncryptionFactory;

@RestController
public class TestController { // This controller is just for testing and in actual project we don't need.

    @Autowired
    EncryptionFactory encryptionFactory;

    @GetMapping("/encrypt")
    public void encryptWithEncoder(@RequestParam EncodingPatternEnums encodingPatternEnums) {
        encryptionFactory.findEncryptionType(encodingPatternEnums).encrypt("Pradeep Tiwari");
    }

}
