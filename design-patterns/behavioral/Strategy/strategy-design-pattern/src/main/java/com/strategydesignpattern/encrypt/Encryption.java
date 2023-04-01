package com.strategydesignpattern.encrypt;

import com.strategydesignpattern.enums.EncodingPatternEnums;

public interface Encryption {
    void encrypt(String toBeEncrypted);
    EncodingPatternEnums getEncryptionType();
}