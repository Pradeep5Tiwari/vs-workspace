package com.strategydesignpattern.encrypt;

import org.springframework.stereotype.Service;

import com.strategydesignpattern.enums.EncodingPatternEnums;

@Service
public class MD5Encryption implements Encryption {

    @Override
    public void encrypt(String toBeEncrypted) {

        System.out.println("Encryption using MD5");
    }

    @Override
    public EncodingPatternEnums getEncryptionType() {

        return EncodingPatternEnums.MD5;
    }

}
