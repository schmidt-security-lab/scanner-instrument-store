package com.example.instrumentstore.securitylab;

import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSession;

/**
 * Intentional Sonar security exercise; not registered as an application bean.
 * No connection is created and the application never uses this verifier.
 * Fix: use the HTTPS client's default hostname verifier instead.
 */
public final class InsecureHostnameVerifierDemo implements HostnameVerifier {

    @Override
    public boolean verify(String hostname, SSLSession session) {
        return true;
    }
}
