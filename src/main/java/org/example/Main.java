package org.example;

public class Main {
    public static void main(String[] args) {
        String name = "Игорь";
        System.out.println("КУ, " + name);

        Tester tester = new Tester("дУБ", "Арсеныч", 5, "Пройден", 5000);
        tester.printInfo();
        tester.printInfo("Сеньор");
        tester.printInfo("Лад", 700);
        AnotherClass.staticMethod();
    }
}