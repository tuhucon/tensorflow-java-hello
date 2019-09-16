package com.example.tensoflowwhellow;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.tensorflow.Graph;
import org.tensorflow.Session;
import org.tensorflow.Tensor;
import org.tensorflow.TensorFlow;

import java.io.UnsupportedEncodingException;

@SpringBootApplication
public class TensoflowwHellowApplication {

    public static void main(String[] args) throws UnsupportedEncodingException {
        SpringApplication.run(TensoflowwHellowApplication.class, args);
    }
}
