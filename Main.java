package Homework;

import Homework.controller.Controller;

public class Main {
    public static void main(String[] args) {
        Controller controller = new Controller();
        controller.createAnalyst("Данил", "Лихачев", 60000);
        controller.createAnalyst("Екатерина", "Полякова", 50000);
        controller.createManager("Сергей", "Овчинников", 120000);
        controller.createManager("Елена", "Пекина", 40000);
        controller.read();
        controller.readOnlyAnalyst();
        controller.readOnlyManager();
        controller.searchSurname();
        controller.searchId();
        controller.delWorker();
    }
}