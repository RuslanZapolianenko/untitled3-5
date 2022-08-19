package Teather;


import java.util.ArrayList;
import java.util.Iterator;

public class Main {

    private static ArrayList<String> listTeachers = new ArrayList<>();
    public static ArrayList<String> listSubject = new ArrayList<>();
    private static ArrayList<String> listBall = new ArrayList<>();

    private static ArrayList<Integer> counter = new ArrayList<>();
    private static final String TITLE = "__________________________________";


    public static void main(String[] args) {
        // arrListAllData(); // Массив с листами

        // Вывести по порядку + индекс + топ по индексу
        editListTeachers(arrTeachers());
        listTeachersPrint();
    }

    // Массив данных Предмет / ФИО / оценка учеников
    public static String[][] arrTeachers() {
        //1-10
        String[] teachers_01 = new String[]{"Физика", "ФИО teachers_01 ", "10",};
        String[] teachers_02 = new String[]{"Математика", "ФИО teachers_02 ", "8",};
        String[] teachers_03 = new String[]{"Химия", "ФИО teachers_02 ", "7",};
        String[] teachersAll = new String[]{String.valueOf(teachers_01), String.valueOf(teachers_02), String.valueOf(teachers_03)};

        String[][] allTeachers = {
                {"Физика", "ФИО teachers_01 ", "10",},    // [0][0]
                {"Математика", "ФИО teachers_02 ", "8",}, // [1][0]
                {"Химия", "ФИО teachers_03 ", "7",},      // [2][0]
        };
        return allTeachers;
    }

    // Формируем листы
    public static void editListTeachers(String[][] allT) {
        for (int i = 0; i < allT.length; i++) {
            listSubject.add(allT[i][0]);
            listTeachers.add(allT[i][1]);
            listBall.add(allT[i][2]);
        }
    }

    // записать листы в массив // Массив с листами
    public static String[] arrListAllData() {
        String[] teachersAll = new String[3];
        teachersAll[0] = String.valueOf(listSubject);
        teachersAll[1] = String.valueOf(listTeachers);
        teachersAll[2] = String.valueOf(listBall);
        System.out.println(teachersAll);
        return teachersAll;
    }

    public static void counter(ArrayList<String> listForCounter ) {
        for (int i = 0; i < listForCounter.size(); i++){
            counter.add(i,i);
        }
    }


    public static void listTeachersPrint() {
        counter(listTeachers);
        // с помощью итератора можем бегать по нашему списку
        Iterator<String> iteratorTeachers = listTeachers.iterator();
        Iterator<String> iteratorSubject = listSubject.iterator();
        Iterator<String> iteratorBall = listBall.iterator();
        Iterator<Integer> iteratorCounter = counter.iterator();

        // спрашиваем есть ли следующий элемент в списке, если true, то будет реализовано тело while
        while (iteratorTeachers.hasNext() && iteratorSubject.hasNext() && iteratorBall.hasNext() && iteratorCounter.hasNext()) {
            // переходим к следующему элементу в списке и его выводим
            // для поиска индекса значения в листе можно использовать метод indexOf(), НО это будет не корректно если в листе есть повторы
            String integerTeachers = iteratorTeachers.next();
            String integerSubject = iteratorSubject.next();
            String integerBall = iteratorBall.next();
            int counterS = iteratorCounter.next();
            System.out.println("index [" + counterS + "] " + integerTeachers + " | Предмет: " + integerSubject + " | Оценка учеников: " + integerBall);
        }
        System.out.println(TITLE + "\nСамый высокий индекс[" + (listTeachers.size()-1) +"] в листе у " + listTeachers.get(listTeachers.size() - 1) + " Предмет : " + listSubject.get(listTeachers.size() - 1));
        System.out.println("Самый низкий индекс [0] в листе у " + listTeachers.get(0) + " Предмет : " + listSubject.get(0));
    }

}
//Используя Intelij IDEA создать проект, пакет. Создать class Main, в нем создать список, добавить учителей, которых
// вы только сможете вспомнить со школы. И получить индекс самого лучшего учителя и самого не очень.
// Вывести список в консоль.