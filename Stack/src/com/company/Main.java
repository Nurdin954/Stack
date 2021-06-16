package com.company;
 import java.util.*;
        public class Main {
            public static void main(String[] args) {
                Stack<String> mark = new Stack<>();

                mark.push("Audi");
                mark.push("Mersedes");
                mark.push("BMW");
                mark.push("Subaru");
                mark.push("Honda");
                System.out.println(mark);
                System.out.println("-------------------");
                mark.pop();
                System.out.println(mark);
                System.out.println("-------------------");
                mark.peek();
                System.out.println(mark.peek());
                System.out.println("-------------------");

                System.out.println(mark.search("Audi"));
            }
        }


