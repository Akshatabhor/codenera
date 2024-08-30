package Collection;

import java.util.ArrayList;
import java.util.Random;

public class ShuffleArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        shuffle(list);

        System.out.println("Shuffled ArrayList:");
        System.out.println(list);
    }

    public static void shuffle(ArrayList<Integer> list) {
        Random random = new Random();

        for (int i = list.size() - 1; i > 0; i--) {
            int j = random.nextInt(i + 1); 
            int temp = list.get(i);
            list.set(i, list.get(j));
            list.set(j, temp);
        }
    }
}
