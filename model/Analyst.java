package Homework.model;

public class Analyst extends Worker {

    public Analyst(String name, String surname, Integer salary, Integer id) {
        super(name, surname, salary, id);
    }

    public Analyst() {
    }

    @Override
    public String toString() {
        return "Аналитик {" +
                "Имя: '" + name + '\'' +
                ", Фамилия: '" + surname + '\'' +
                ", Зарплата: " + salary +
                ", ID сотрудника: " + id +
                '}';
    }
}