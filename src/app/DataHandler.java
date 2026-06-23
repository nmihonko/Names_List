package app;

import java.util.List;

public class DataHandler {

    public String formOutput(List<String> list, int index) {
        if (list == null || list.isEmpty()) {
            throw new InputValidationException("List cannot be null or empty");
        }
        if (index < 0 || index >= list.size()) {
            throw new InputValidationException("Index is out of bounds, index = %s, size = %s".formatted(index, list.size()));
        }
        String name = list.get(index);
        return "Name: " + name + " is in index " + index;
    }

    public String formListOutput(List<String> list) {
        if (list == null || list.isEmpty()) {
            throw new InputValidationException("List cannot be null or empty");
        }

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < list.size(); i++) {
            sb.append(String.format("%d) %s%n", i + 1, list.get(i)));
        }

        return "\nNames:\n" + sb;
    }
}