import java.util.*;
abstract class Sort {
    List<Integer> unsorted;
    Sort() {
    }

    public void print(String message) {
        System.out.println(message);
        for(int i=0;i<unsorted.size();i++)
            System.out.print(unsorted.get(i) + " ");
        System.out.println();
    }

    abstract void sortArray();
}
