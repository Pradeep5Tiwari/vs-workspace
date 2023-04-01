package com.strategydesignpattern.encrypt;

import org.springframework.stereotype.Service;

import com.strategydesignpattern.enums.EncodingPatternEnums;

@Service
public class SHA2Encryption implements Encryption {

    @Override
    public void encrypt(String toBeEncrypted) {

        System.out.println("Encryption using SHA2");
    }

    @Override
    public EncodingPatternEnums getEncryptionType() {

        return EncodingPatternEnums.SHA2;
    }

}
