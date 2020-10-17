package com.MuhammadFajarAhadi.Modul2.Polimorfisme;

public class DemoOverRiding {
    public static void main(String[] args) {
        X superClass = new X();
        Y subClass = new Y();

        superClass.getValue("Tidur");
        subClass.getValue("Makan");
    }
}
