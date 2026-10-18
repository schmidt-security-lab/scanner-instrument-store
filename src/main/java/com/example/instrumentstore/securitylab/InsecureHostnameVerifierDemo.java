package com.example.instrumentstore.securitylab;

import java.io.IOException;
import java.net.URI;
import javax.net.ssl.HttpsURLConnection;

/**
 * Intentional Sonar security exercise; not registered as an application bean.
 * The factory does not connect or send a request, and the app never calls it.
 * Fix: use the HTTPS client's default hostname verifier instead.
 */
public final class InsecureHostnameVerifierDemo {

    private InsecureHostnameVerifierDemo() {
    }

    public static HttpsURLConnection createTrainingConnection() throws IOException {
        HttpsURLConnection connection = (HttpsURLConnection)
                URI.create("https://example.invalid").toURL().openConnection();
        connection.setHostnameVerifier((hostname, session) -> true);
        return connection;
    }
}
