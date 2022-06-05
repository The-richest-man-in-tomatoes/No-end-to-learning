package demo03;

import java.util.ArrayList;
import java.util.Collections;
import java.util.function.Consumer;

public class Demo03_lamdbaForEach {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>();

        arrayList.add("A");
        arrayList.add("B");
        arrayList.add("M");
        arrayList.add("D");
        arrayList.add("G");

        arrayList.forEach(new Consumer<String>() {
            @Override
            public void accept(String s) {
                System.out.println(s);
            }
        });

        arrayList.forEach(s -> {
            int a = s.compareTo("A");
            System.out.println(a);
        });
    }
}
