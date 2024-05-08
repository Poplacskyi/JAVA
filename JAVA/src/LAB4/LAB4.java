package LAB4;

import java.util.*;

public class LAB4 {
    // Метод перевірки, чи масив відсортований
    public static boolean isSorted(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] > array[i + 1]) {
                return false;
            }
        }
        return true;
    }

    // Метод для випадкового перемішування масиву
    public static void shuffleArray(int[] array) {
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            int index = random.nextInt(array.length);
            int temp = array[i];
            array[i] = array[index];
            array[index] = temp;
        }
    }

    // Метод сортування масиву за допомогою алгоритму BogoSort
    public static void bogoSort(int[] array) {
        while (!isSorted(array)) {
            shuffleArray(array);
        }
    }

    // Основний метод програми
    public static void main(String[] args) {
        int[] array = {5, 3, 2, 8, 1, 4};
        System.out.println("Невідсортований масив: " + Arrays.toString(array));

        bogoSort(array);
        System.out.println("Відсортований масив за допомогою BogoSort: " + Arrays.toString(array));
    }
}
