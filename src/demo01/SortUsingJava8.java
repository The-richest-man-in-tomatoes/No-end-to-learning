package demo01;

import java.util.*;

public class SortUsingJava8 {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>();

        arrayList.add("U");
        arrayList.add("B");
        arrayList.add("M");
        arrayList.add("D");
        arrayList.add("G");

        ArrayList<String> arrayList1 = new ArrayList<>();

        arrayList1.add("A");
        arrayList1.add("G");
        arrayList1.add("L");
        arrayList1.add("B");
        arrayList1.add("P");


        SortUsingJava8 sortList = new SortUsingJava8();
        sortList.sortUsingJava7(arrayList);
        System.out.println(arrayList);

        sortList.sortUsingJava8(arrayList1);
        System.out.println(arrayList1);

    }

    /**
     * JAVA7 sort-list
     * @param stringList
     * @Author Beian27
     */
    private void sortUsingJava7(List<String> stringList){
        Collections.sort(stringList, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.compareTo(o2);
            }
        });
    }

    /**
     * JAVA8 sort——list
     * @param stringList
     * @Author Beian27
     */
    private void sortUsingJava8(List<String> stringList){
        Collections.sort(stringList,(s1, s2) -> s1.compareTo(s2));
    }

}
