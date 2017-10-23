package com.example;

import java.util.Vector;

public class MyClass {
    public static void main(String[] args)
    {
        System.out.println("Hello, World");

        int total = 0;
        for (int i=0;i< pizza_array.size();i++) {
            Pizza temp = (pizza_array.elementAt(i));
            System.out.println (temp.size+" "+temp.type+": $"+(temp.price));
            total += temp.price;
        }
    }

    static Vector<Pizza> pizza_array = new Vector<Pizza>();
    class Pizza{
        int type;
        int price;
        int size=0;
        Pizza () {
        }
        Pizza (int t, int p, int s) {
            type = t;
            price = p;
            size = s;
        }
    }
}
