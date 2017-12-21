import java.util.InputMismatchException;
import java.util.Scanner;

public class InputData {

    public static Battery inputData(Battery battery) {
        boolean stop;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj producenta baterii: ");
        battery.setManufacturer(scanner.next());

        do {
            try {
                stop = false;
                System.out.println("Podaj pojemność baterii: ");
                battery.setCapacity(scanner.nextInt());
                scanner.nextLine();

            } catch (InputMismatchException e) {
                stop = true;
                System.out.println("Błąd! Niedozwolony znak! Wprowadź wartość liczbową!");
                battery.setCapacity(0);
                scanner.nextLine();
            }
        } while (stop);
        return battery;
    }
}
