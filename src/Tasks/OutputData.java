package Tasks;

public class OutputData {

    public static void ifNumberIsGreaterThanSeven() {
        System.out.println("Привет");
    }

    public static void ifNameIsVyacheslav(String name) {
        System.out.println("Привет, " + name);
    }

    public static void printNumbersMultiplesThree(int[] array) {
        System.out.println("Элементы массива, кратные 3: ");

        for (int i = 0; i < array.length; i++) {
            if (array[i] % 3 == 0) {
                System.out.println(array[i]);
            }
        }
    }
}