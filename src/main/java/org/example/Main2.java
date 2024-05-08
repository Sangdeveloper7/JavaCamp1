package org.example;

public class Main2 {
    public static void main(String[] args) {
        ListArray a = new ListArray();
        a.add("22000516");
        a.add("이상현");
        a.add("01028089757");
        a.add(21);

        a.get(1);
        System.out.println("\n\n remove 함수");
        a.remove(2);
        a.printAll();

    }
}
