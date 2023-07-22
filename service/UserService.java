package Homework.service;

import Homework.model.Analyst;
import Homework.model.Manager;
import Homework.model.Worker;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class UserService implements DataService {

    private List<Worker> workerList = new ArrayList<>();
    private List<Analyst> analystList = new ArrayList<>();
    private List<Manager> managerList = new ArrayList<>();

    @Override
    public void createAnalyst(String name, String surname, Integer salary) {
        Integer id = getFreeId();
        Analyst analyst = new Analyst(name, surname, salary, id);
        workerList.add(analyst);
        analystList.add(analyst);
    }

    @Override
    public void createManager(String name, String surname, Integer salary) {
        Integer id = getFreeId();
        Manager manager = new Manager(name, surname, salary, id);
        workerList.add(manager);
        managerList.add(manager);
    }

    @Override
    public int getFreeId() {
        Integer lastId = 0;
        for (Worker worker : workerList) {
            lastId++;
        }
        return ++lastId;
    }

    @Override
    public List<Worker> read() {
        System.out.println("Список всех сотрудников");
        return workerList;
    }

    @Override
    public List<Analyst> readOnlyAnalyst() {
        System.out.println("Список аналитиков");
        return analystList;
    }

    @Override
    public List<Manager> readOnlyManager() {
        System.out.println("Список менеджеров");
        return managerList;
    }

    @Override
    public List<Worker> searchSurname() {
        Scanner sc = new Scanner(System.in);
        List<Worker> filterWorker = new ArrayList<>();
        System.out.println("Введите фамилию сотрудника: ");
        String search = sc.nextLine().toLowerCase();
        for (int i = 0; i < workerList.size(); i++) {
            if (workerList.get(i).getSurname().toLowerCase().equals(search)) {
                filterWorker.add(workerList.get(i));
            }
        }
        System.out.println("Список найденных сотрудников");
        return filterWorker;
    }

    @Override
    public List<Worker> searchId() {
        Scanner sc = new Scanner(System.in);
        List<Worker> filterWorker = new ArrayList<>();
        System.out.println("Введите id сотрудника: ");
        Integer search = sc.nextInt();
        for (int i = 0; i < workerList.size(); i++) {
            if (workerList.get(i).getId() == search) {
                filterWorker.add(workerList.get(i));
            }
        }
        System.out.println("Найденный сотрудник");
        return filterWorker;
    }

    @Override
    public List<Worker> delWorker() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите id сотрудника, которого хотите удалить: ");
        Integer search = sc.nextInt();
        for (int i = 0; i < workerList.size(); i++) {
            if (workerList.get(i).getId() == search) {
                workerList.remove(i);
            }
        }
        System.out.println("Список сотрудников после удаления");
        return workerList;
    }
}