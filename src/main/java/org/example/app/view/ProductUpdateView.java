package org.example.app.view;

import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

@Component
public class ProductUpdateView {

    public Map<String, String> getData() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter product id to update:");
        String id = scanner.nextLine();
        System.out.println("Enter new product name:");
        String name = scanner.nextLine();
        System.out.println("Enter new product quota:");
        String quota = scanner.nextLine();
        System.out.println("Enter new product price:");
        String price = scanner.nextLine();
        Map<String, String> data = new HashMap<>();
        data.put("id", id);
        data.put("name", name);
        data.put("quota", quota);
        data.put("price", price);
        return data;
    }

    public void getOutput(String message) {
        System.out.println(message);
    }
}
