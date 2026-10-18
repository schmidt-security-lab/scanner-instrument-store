package com.example.instrumentstore.securitylab;

import javax.net.ssl.HostnameVerifier;

/**
 * Intentional Sonar security exercise; not registered as an application bean.
 * No connection is created and the application never calls this factory.
 * Fix: use the HTTPS client's default hostname verifier instead.
 */
public final class InsecureHostnameVerifierDemo {

    private InsecureHostnameVerifierDemo() {
    }

    public static HostnameVerifier createTrainingVerifier() {
        return (hostname, session) -> true;
    }
}
