package com.strategydesignpattern.factory;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.strategydesignpattern.encrypt.Encryption;
import com.strategydesignpattern.enums.EncodingPatternEnums;

@Component
public class EncryptionFactory {
    Map<EncodingPatternEnums, Encryption> map;
    
    @Autowired
    public EncryptionFactory(Set<Encryption> encryptionTypeSet) {
        createStrategy(encryptionTypeSet);    
    }

    private void createStrategy(Set<Encryption> encryptionTypeSet) {
        map = new HashMap<EncodingPatternEnums, Encryption>();
        encryptionTypeSet.stream().forEach(encryptionTypes -> map.put(encryptionTypes.getEncryptionType(), encryptionTypes));
    }

    public Encryption findEncryptionType(EncodingPatternEnums encodingPatternEnums) {
        return map.get(encodingPatternEnums);
    }
}
