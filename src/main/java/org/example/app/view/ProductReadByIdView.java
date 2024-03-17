package org.example.app.view;

import org.springframework.stereotype.Component;

import java.util.Scanner;

@Component
public class ProductReadByIdView {

    public String getData() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter product id to view:");
        return scanner.nextLine();
    }

    public void getOutput(String message) {
        System.out.println(message);
    }
}