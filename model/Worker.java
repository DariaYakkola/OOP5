package Homework.model;

public abstract class Worker {
    String name;
    String surname;
    Integer salary;
    Integer id;

    public Worker(String name, String surname, Integer salary, Integer id) {
        this.name = name;
        this.surname = surname;
        this.salary = salary;
        this.id = id;

    }

    public Worker() {
    }

    public String getSurname() {
        return surname;
    }

    public Integer getId() {
        return id;
    }
}