package zoo;
import java.util.ArrayList;
import java.util.ListIterator;

public class Zoo {


    private static ArrayList<String> listZoo = new ArrayList<>();

    public static void main(String[] args) {
        String[] arrZoo = new String[]{"Тигр - Эл_1_Index_0", "Медведь - Эл_2_Index_1", "Волк Эл_3_Index_2", "Лиса Эл_4_Index_3", "Борсук Эл_5_Index_4", "Леопард Эл_6_Index_5", "Верблюд Эл_7_Index_6", "Шипанзе Эл_8_Index_7"};
        System.out.println("task_02__________________________________");
        for (int i = 0; i < 8; i++) {
            listZoo.add(i, arrZoo[i]);
        }
        iteratorZooPrint();

        System.out.println("task_03__________________________________");


        listZoo.remove(2);
        listZoo.remove(4-1);
        listZoo.remove(6-2);

        iteratorZooPrint();

        System.out.println("__________________________________Размер листа = " + listZoo.size());
    }

    private static void iteratorZooPrint(){

        // через оптимизированный итератор под cписки
        ListIterator<String> listIt = listZoo.listIterator();
        while (listIt.hasNext()) {
            String integer = listIt.next();
            System.out.println(integer);
        }
    }
}
