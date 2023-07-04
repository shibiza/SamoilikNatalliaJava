package Tasks;

import java.util.Scanner;

public class InputData {

    public static int getNumber() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter any number");
        return sc.nextInt();
    }

    public static String getName() {
        Scanner sc = new Scanner(System.in);
        System.out.println("What is your name?");
        return sc.nextLine();
    }

    public static int[] getArray() {
        Scanner sc = new Scanner(System.in);
        System.out.println("please enter the length of your array");
        int arrLength = sc.nextInt();
        int[] arr = new int[arrLength];
        System.out.println("Please enter all elements of your array");
        for (int i = 0; i < arrLength; i++) {
            System.out.print("Element " + (i + 1) + ": ");
            arr[i] = sc.nextInt();
        }
        return arr;
    }
}