package app;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Pattern;

public class DataRepository {

    private static final Pattern DIGIT_PATTERN = Pattern.compile("\\d");

    public List<String> getData() {
        Scanner scanner = new Scanner(System.in);
        List<String> names = new ArrayList<>();

        System.out.print("How many names: ");

        if (!scanner.hasNextInt()) {
            throw new InputValidationException("Amount must be a numeric value");
        }

        int count = scanner.nextInt();
        scanner.nextLine();

        if (count <= 0) {
            throw new InputValidationException("Amount must be a positive number");
        }

        for (int i = 0; i < count; i++) {
            System.out.print("Enter name: ");
            String name = scanner.nextLine();

            if (name.isBlank() || DIGIT_PATTERN.matcher(name).find()) {
                throw new InputValidationException("Invalid name: name cannot be empty or contain numbers");
            }

            names.add(name);
        }

        return names;
    }
}