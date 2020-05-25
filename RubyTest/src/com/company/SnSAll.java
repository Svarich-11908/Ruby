package com.company;

public class SnSAll implements InfOut {
    private int d;

    public SnSAll(int d) {
        this.d = d;
    }

    @Override
    public void infOut() {
        if (d == 1) {
            System.out.println("1");
            System.out.println("11");
            System.out.println("21");
            System.out.println("1211");
            System.out.println("111221");
            System.out.println("312211");
            System.out.println("13112221");
            System.out.println("1113213211");
        } else {
            System.out.println(d);
            System.out.println("1" + d);
            System.out.println("111" + d);
            System.out.println("311" + d);
            System.out.println("13211" + d);
            System.out.println("111312211" + d);
            System.out.println("31131122211" + d);
        }
    }
}
