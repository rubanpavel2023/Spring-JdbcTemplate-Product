package org.example.app.view;

import org.springframework.stereotype.Component;

@Component
public class ProductReadView {

    public void getOutput(String message) {
        System.out.println(message);
    }
}