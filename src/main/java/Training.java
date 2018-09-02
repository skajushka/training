import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Training {

    public static void main(String[] args) {
        int[] array = {25, 65, 48, 3, 76, 22, 14, 55, 84, 49};
        List<Integer> list = new ArrayList<Integer>(Arrays.asList(25, 65, 48, 3, 76, 22, 14, 55, 84, 49));
        sortListWithBubbleSort(list);
        //printArray(sortArrayWithBubbleSort(array));
    }

    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }

    public static int[] selectOnlyEven(int[] array) {
        int[] arrayOfEvens = new int[array.length];
        int nextIndex = 0;

        for (int i = 0; i < array.length; i++) {

            if ((array[i] % 2) == 0) {
                arrayOfEvens[nextIndex] = array[i];
                nextIndex++;
            }
        }

        return arrayOfEvens;
    }

    public static void selectOnlyEven(List<Integer> list) {
        list.stream().filter(value -> (value % 2) == 0).forEach(System.out::println);
    }

    public static int[] sortArrayWithBubbleSort(int[] array) {
        int temp;
        int length = array.length;

        for (int i = 0; i < length; i++) {
            for(int j = 1; j < length - i; j++) {
                if (array[j - 1] > array[j]) {
                    temp = array[j - 1];
                    array[j - 1] = array[j];
                    array[j] = temp;
                }
            }
        }

        return array;
    }

    public static void sortListWithBubbleSort(List<Integer> list) {
        int temp;

        for (int i = 0; i < list.size(); i++) {
            for (int j = 1; j < list.size() - i; j++) {
                if (list.get(j - 1) > list.get(j)) {
                    temp = list.get(j - 1);
                    list.remove(j - 1);
                    list.add(j, temp);
                }
            }
        }

        list.forEach(System.out::println);
    }
}
