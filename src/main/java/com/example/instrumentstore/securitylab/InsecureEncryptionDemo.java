package com.example.instrumentstore.securitylab;

import java.security.GeneralSecurityException;
import javax.crypto.Cipher;

/**
 * Intentional Sonar security exercise, never called by the application.
 * ECB reveals patterns in encrypted data. Use authenticated encryption such as
 * AES/GCM/NoPadding with a fresh nonce in real code.
 */
public final class InsecureEncryptionDemo {

    private InsecureEncryptionDemo() {
    }

    public static Cipher createTrainingCipher() throws GeneralSecurityException {
        return Cipher.getInstance("AES/ECB/PKCS5Padding");
    }
}
