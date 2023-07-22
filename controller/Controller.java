package Homework.controller;

import Homework.model.Analyst;
import Homework.model.Manager;
import Homework.model.Worker;
import Homework.service.UserService;
import Homework.view.View;

import java.util.List;

public class Controller {
    private final UserService service = new UserService();
    private final View view = new View();

    /**
     * @param name    имя
     * @param surname фамилия
     * @param salary  зарплата
     * @apiNote создает аналитика, используется метод из service
     */
    public void createAnalyst(String name, String surname, Integer salary) {
        service.createAnalyst(name, surname, salary);
    }

    /**
     * @param name    имя
     * @param surname фамилия
     * @param salary  зарплата
     * @apiNote создает менеджера, используется метод из service
     */
    public void createManager(String name, String surname, Integer salary) {
        service.createManager(name, surname, salary);
    }

    /**
     * @apiNote показывает список всех сотрудников, используется метод из service,
     * для отображения метод из view
     */
    public void read() {
        List<Worker> workerList = service.read();
        for (Worker worker : workerList) {
            view.printWorker(worker);
        }
    }

    /**
     * @apiNote показывает список аналитиков, используется метод из service,
     * для отображения метод из view
     */
    public void readOnlyAnalyst() {
        List<Analyst> analystList = service.readOnlyAnalyst();
        for (Analyst analyst : analystList) {
            view.printAnalyst(analyst);
        }
    }

    /**
     * @apiNote показывает список менеджеров, используется метод из service,
     * для отображения метод из view
     */
    public void readOnlyManager() {
        List<Manager> managerList = service.readOnlyManager();
        for (Manager manager : managerList) {
            view.printManager(manager);
        }
    }

    /**
     * @apiNote осуществляет поиск сотрудника по фамилии, используется метод из service,
     * для отображения метод из view
     */
    public void searchSurname() {
        List<Worker> filterWorker = service.searchSurname();
        for (Worker worker : filterWorker) {
            view.printWorker(worker);
        }
    }

    /**
     * @apiNote осуществляет поиск сотрудника по id, используется метод из service,
     * для отображения метод из view
     */
    public void searchId() {
        List<Worker> filterWorker = service.searchId();
        for (Worker worker : filterWorker) {
            view.printWorker(worker);
        }
    }

    /**
     * @apiNote осуществляет поиск сотрудника по id и его удаление, используется метод из service,
     * для отображения метод из view
     */
    public void delWorker() {
        List<Worker> workerList = service.delWorker();
        for (Worker worker : workerList) {
            view.printWorker(worker);
        }
    }
}
