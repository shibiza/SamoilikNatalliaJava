package Tasks;

public class Main {
    public static void main(String[] args) {
        int n = InputData.getNumber();
        if (n > 7) {
            OutputData.ifNumberIsGreaterThanSeven();
        }

        String name = InputData.getName();
        if (name.equals("Вячеслав")) {
            OutputData.ifNameIsVyacheslav(name);
        } else {
            System.out.println("Нет такого имени");
        }
        int[] array = InputData.getArray();
        OutputData.printNumbersMultiplesThree(array);
    }
}