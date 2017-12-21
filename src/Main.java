public class Main {

    public static void main(String[] args) {

        int count = 0;
        int batteryQuantity = 3;
        int temp;

        Battery[] batteriesArray = new Battery[batteryQuantity];

        for (temp = 0; temp < batteriesArray.length; temp++) {
            batteriesArray[temp] = new Battery();
        }



        do {
            InputData.inputData(batteriesArray[count]);
            if (count >= 1) {
                for (temp = 1; temp <= count; temp++) {
                    if (batteriesArray[count].getCapacity() == batteriesArray[count - 1].getCapacity() && batteriesArray[count]
                            .getManufacturer().equals(batteriesArray[count - 1].getManufacturer())) {
                        System.out.println("Znaleziono duplikat! Podaj jeszcze raz!");
                        InputData.inputData(batteriesArray[count]);
                    }
                }
            }
            count++;
        } while (count < batteriesArray.length);

        for (count = 0; count < batteriesArray.length; count++) {
            System.out.println("Producent: " + batteriesArray[count].getManufacturer() + ", Pojemność: " + batteriesArray[count]
                    .getCapacity
                            ());
        }
    }
}
