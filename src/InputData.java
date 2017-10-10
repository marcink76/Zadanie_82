import java.util.InputMismatchException;
import java.util.Scanner;

public class InputData {

    public static Battery inputData(Battery battery) {
        boolean stop = false;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj producenta baterii: ");
        battery.setManufacturer(scanner.next());

        do {
            try {
                stop = false;
                System.out.println("Podaj pojemność baterii: ");
                battery.setCapacity(scanner.nextInt()); // W tym miejscu jest błąd po podaniu złej wartości
                // przeskakuje do catch. Przechodzi przez pętlę i nie czeka na ponowne podanie danych tylko od razu
                // przeskuakuje do catch i zapętla się. WTF??

            } catch (InputMismatchException e) {
                stop = true;
                System.out.println("Błąd! Niedozwolony znak! Wprowadź wartość liczbową!");
                battery.setCapacity(0);
            }
        } while (stop);
        return battery;
    }
}
