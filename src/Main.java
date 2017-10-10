public class Main {

    public static void main(String[] args) {

        int count = 0;
        int batteryQuantity = 4;
        int temp;

        Battery[] batteries = new Battery[batteryQuantity];

        for (temp = 0; temp < batteries.length; temp++) {
            batteries[temp] = new Battery();
        }
        do {
            InputData.inputData(batteries[count]);
            if (count >= 1) {
                for (temp = 1; temp <= count; temp++) {
                    if (batteries[count].getCapacity() == batteries[count - 1].getCapacity() && batteries[count]
                            .getManufacturer().equals(batteries[count - 1].getManufacturer())) {
                        System.out.println("Znaleziono duplikat! Podaj jeszcze raz!");
                        InputData.inputData(batteries[count]);
                    }
                }
            }
            count++;
        } while (count < batteries.length);

        for (count = 0; count < batteries.length; count++) {
            System.out.println("Producent: " + batteries[count].getManufacturer() + ", Pojemność: " + batteries[count]
                    .getCapacity
                            ());
        }
    }
}
