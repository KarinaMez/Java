import java.util.Arrays;

public class MainOne {

    public static void main(String[] args) {
        System.out.println("Задание 1: ");
        printThreeWords();

        System.out.println("\nЗадание 2: ");
        checkSumSign();

        System.out.println("\nЗадание 3: ");
        printColor();

        System.out.println("\nЗадание 4: ");
        compareNumbers();

        System.out.println("\nЗадание 5: ");
        System.out.println(isSumInRange(5, 5));
        System.out.println(isSumInRange(10, 5));
        System.out.println(isSumInRange(15, 5));
        System.out.println(isSumInRange(10, 11));

        System.out.println("\nЗадание 6: ");
        checkNumberSign(10);
        checkNumberSign(-5);
        checkNumberSign(0);

        System.out.println("\nЗадание 7: ");
        System.out.println(isNegative(-5));
        System.out.println(isNegative(10));
        System.out.println(isNegative(0));

        System.out.println("\nЗадание 8: ");
        printStringMultipleRepet("Привет!", 3);

        System.out.println("\nЗадание 9: ");
        System.out.println(isLeapYear(2001));
        System.out.println(isLeapYear(2024));

        System.out.println("\nЗадание 10: ");
        int[] arr = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        invertArray(arr);
        System.out.println(Arrays.toString(arr));

        System.out.println("\nЗадание 11: ");
        int[] arr1 = new int[100];
        arrayTwo(arr1);
        System.out.println(Arrays.toString(arr1));

        System.out.println("\nЗадание 12: ");
        int[] arr3 = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        arrayThree(arr3);
        System.out.println(Arrays.toString(arr3));

        System.out.println("\nЗадание 13: ");
        diagonalM(10);

        System.out.println("\nЗадание 14: ");
        printArray(retLen(10, 5));
    }

    public static void printThreeWords() {
        System.out.println("Orange");
        System.out.println("Banana");
        System.out.println("Apple");
    }

    public static void checkSumSign() {
        int a = 35;
        int b = -10;
        int sum = a + b;

        if (sum >= 0) {
            System.out.println("Сумма положительная");
        } else {
            System.out.println("Сумма отрицательная");
        }
    }

    public static void printColor() {
        int value = 38;
        if (value <= 0) {
            System.out.println("Красный");
        } else if (value > 0 && value <= 100) {
            System.out.println("Желтый");
        } else {
            System.out.println("Зеленый");
        }
    }

    public static void compareNumbers() {
        int a = 100;
        int b = 20;
        if (a >= b) {
            System.out.println("a >= b");
        } else {
            System.out.println("a < b");
        }
    }

    public static boolean isSumInRange(int a, int b) {
        int sum = a + b;
        return sum >= 10 && sum <= 20;
    }

    public static void checkNumberSign(int number) {
        if (number >= 0) {
            System.out.println("Положительное");
        } else {
            System.out.println("Отрицательное");
        }
    }

    public static boolean isNegative(int number) {
        return number < 0;
    }

    public static void printStringMultipleRepet(String text, int repet) {
        if (repet < 0) {
            System.out.println("Количество повторений не может быть отрицательным.");
            return;
        }
        for (int i = 0; i < repet; i++) {
            System.out.println(text);
        }
    }

    public static boolean isLeapYear(int year) {
        if (year % 4 == 0) {
            if (year % 100 == 0) {
                return year % 400 == 0;
            }
            return true;
        } else {
            return false;
        }
    }

    public static void invertArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = arr[i] == 0 ? 1 : 0;
        }
    }

    public static void arrayTwo(int[] arr1) {
        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = i + 1;
        }
    }

    public static void arrayThree(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 6) {
                arr[i] *= 2;
            }
        }
    }

    public static void diagonalM(int size) {
        int[][] arr = new int[size][size];
        for (int i = 0; i < size; i++) {
            arr[i][i] = 1;
            arr[i][size - 1 - i] = 1;
        }

        for (int[] row : arr) {
            System.out.println(Arrays.toString(row));
        }
    }

    public static void printArray(int[] inputArray) {
        for (int value : inputArray) {
            System.out.print(value + " ");
        }
        System.out.println();
    }

    public static int[] retLen(int len, int initialValue) {
        int[] arr = new int[len];
        for (int i = 0; i < len; i++) {
            arr[i] = initialValue;
        }
        return arr;
    }
}
