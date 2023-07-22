package Homework.service;

import Homework.model.Analyst;
import Homework.model.Manager;
import Homework.model.Worker;

import java.util.List;

public interface DataService {

    void createAnalyst(String name, String surname, Integer salary);

    void createManager(String name, String surname, Integer salary);

    int getFreeId();

    List<Worker> read();

    List<Analyst> readOnlyAnalyst();

    List<Manager> readOnlyManager();

    List<Worker> searchSurname();

    List<Worker> searchId();

    List<Worker> delWorker();
}
