package com.strategydesignpattern.encrypt;

import org.springframework.stereotype.Service;

import com.strategydesignpattern.enums.EncodingPatternEnums;

@Service
public class SHA1Encryption implements Encryption {

    @Override
    public void encrypt(String toBeEncrypted) {

        System.out.println("Encryption using SHA1");
    }

    @Override
    public EncodingPatternEnums getEncryptionType() {

        return EncodingPatternEnums.SHA1;
    }

}
