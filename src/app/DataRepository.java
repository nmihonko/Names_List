package app;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DataRepository {

    public List<String> getData() throws MyException {
        Scanner scanner = new Scanner(System.in);
        List<String> names = new ArrayList<>();
        System.out.print("How many names: ");
        String input = scanner.nextLine();
        if (!input.matches("\\d+")) {
            throw new MyException("Amount must be a positive number without text");
        }
        int amount = Integer.parseInt(input);
        if (amount <= 0) {
            throw new MyException("Amount must be a positive number");
        }

        for (int i = 0; i < amount; i++) {
            System.out.print("Enter name: ");
            String name = scanner.nextLine();
            if (name.isBlank() || name.matches(".*\\d.*")) {
                throw new MyException("Invalid name: name cannot be empty or contain numbers");
            }
            names.add(name);
        }

        return names;
    }
}