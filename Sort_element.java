import java.util.Arrays;

public class Sort_element{
    public static void main(String[] args) {
        int array[] = {10,50,40,60,5};

        Arrays.parallelSort(array);
        System.out.println("Array With Sorting"+Arrays.toString(array));
    }

}