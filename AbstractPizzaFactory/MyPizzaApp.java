import java.util.Scanner; 

public class MyPizzaApp {
    public static void main(String[] args) {
        Scanner inputScanner = new Scanner(System.in);
        String[] inputs;
        
        do {
            System.out.println("MyPizzaApp <franchise> <pizzaKind>");
            String input = inputScanner.nextLine();
            inputs = input.split(" ");
        }
        while (inputs.length != 3);

        if (inputs[1].equals("NYPizzaStore")) {
            var store = new NYPizzaStore();
            try {
                store.orderPizza(inputs[2]);
            }
            catch (Exception e) {
                System.err.println("Error: Invalid pizza name");
            }
        }

        else if (inputs[1].equals("ChicagoPizzaStore")) {
            var store = new ChicagoPizzaStore();
            try {
                store.orderPizza(inputs[2]);
            }
            catch (Exception e) {
                System.err.println("Error: Invalid pizza name");
            }
        }
        inputScanner.close();
    }
}
