package app;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DataRepository {

    public List<String> getData() throws MyException {
        Scanner scanner = new Scanner(System.in);
        List<String> names = new ArrayList<>();
        System.out.print("How many names: ");
        int amount = scanner.nextInt();
        scanner.nextLine();
        if (amount <= 0 ) {
            throw new MyException("Amount must be greater than 0");
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