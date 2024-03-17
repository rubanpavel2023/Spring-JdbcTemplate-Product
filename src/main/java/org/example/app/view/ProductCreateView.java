package org.example.app.view;

import org.springframework.stereotype.Component;

import java.util.Scanner;

@Component
public class ProductCreateView {

    public String[] getData() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter product name:");
        String name = scanner.nextLine();
        System.out.println("Enter product quota:");
        int quota = scanner.nextInt();
        System.out.println("Enter product price:");
        double price = scanner.nextDouble();
        return new String[]{name, String.valueOf(quota), String.valueOf(price)};
    }

    public void getOutput(String message) {
        System.out.println(message);
    }
}

