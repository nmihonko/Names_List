package app;

import java.util.List;

public class Main {

    public static void main(String[] args) {
        try {
            DataRepository repository = new DataRepository();
            DataHandler handler = new DataHandler();
            UIOperator uiOperator = new UIOperator();

            List<String> names = repository.getData();

            uiOperator.getOutput(handler.formListOutput(names));
            uiOperator.getOutput(handler.formOutput(names, 3));
        } catch (InputValidationException | IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}