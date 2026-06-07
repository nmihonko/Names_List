package app;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DataRepository {

    public List<String> getData() {
        Scanner scanner = new Scanner(System.in);
        List<String> names = new ArrayList<>();

        System.out.print("How many names: ");
        int amount = scanner.nextInt();
        scanner.nextLine();

        for (int i = 0; i < amount; i++) {
            System.out.print("Enter name: ");
            String name = scanner.nextLine();
            names.add(name);
        }

        return names;
    }
}