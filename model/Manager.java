package Homework.model;

public class Manager extends Worker {

    public Manager(String name, String surname, Integer salary, Integer id) {
        super(name, surname, salary, id);
    }

    public Manager() {
    }

    @Override
    public String toString() {
        return "Менеджер {" +
                "Имя: '" + name + '\'' +
                ", Фамилия: '" + surname + '\'' +
                ", Зарплата: " + salary +
                ", ID сотрудника: " + id +
                '}';
    }
}