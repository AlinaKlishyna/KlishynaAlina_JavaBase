package com.gmail.alinakotova102.drafts.learn.ovveridetests;

public class BookRunner {
    public static void main(String[] args) {
        Book x = new Book("Harry Potter");
        Book y = new Book("Harry Potter");
        Book z = new Book("Harry Potter");

        /**
         * reflexive: for any non-null reference value x, x.equals(x) should return true
         * reflexive: для любого ненулевого ссылочного значения х, x.equals(x) должен возвратить true
         *
         * то есть то как мы переопределим equals - он всегда должен возвращать true*/
        System.out.println("reflexive: " + x.equals(x));

        /**
         * symmetric: for any non-null reference values x and y, x.equals(y) should return true if and only if
         * y.equals(x) returns true.
         * symmetric: для любого ненулевого ссылочного значения x и у, должен возвратить true и если  y.equals(x)
         * возвратить true
         *
         * то есть, для x.equals(y) и у.equals(х) должен быть true - одинаково true/true или false/false*/
        System.out.println("symmetric: " + x.equals(y) + " - " + y.equals(x));

        /**
         * transitive: for any non-null reference values x, y, and z, if x.equals(y) returns true and y.equals(z)
         * returns true, then x.equals(z) should return true.
         * transitive: для любого ненулевого ссылочного значения x, y, и z, если  x.equals(y) вернуть true и
         * y.equals(z) вернуть true, тогда x.equals(z) должен вернуть true
         *
         * то есть если x.equals(y)(true) и y.equals(z)(true), тогда x.equals(z) - true */
        System.out.println("transitive: " + x.equals(y) + " - " + y.equals(z) + " - " + x.equals(z));

        /**
         * consistent: for any non-null reference values x and y , multiple invocations of x.equals(y) consistently
         * return true or consistently return false, provided no information used in equals comparisons on the objects is modified.
         * consistent: для любых ненулевых ссылочных значений х и у, множественные вызовы на x.equals(y) последовательно возвращать
         * истину/ложь, при условии что информация(при сравнении) не изменяется
         *
         * то есть, сколько бы мы не вызывали, например, x.equals(у) - он не должен изменятся(всегда или true, или false)*/
        System.out.println("consistent:");
        System.out.println(x.equals(y));
        System.out.println(x.equals(y));
        System.out.println(x.equals(y));

        /**
         * For any non-null reference value x, x.equals(null) should return false.
         * Для ненулевых ссылочных значений х, x.equals(null) должен возвращаться false
         *
         * то есть x.equals(null) - всегда false */
        System.out.println("Not null: " + x.equals(null));
    }
}