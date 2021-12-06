package com.example.work.service;

import com.example.work.entity.Worker;
import com.example.work.repository.WorkerRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class WorkerService {
    @Autowired
    private WorkerRepo workerRepo;


    public Worker createUser(Worker worker) {
        return workerRepo.save(worker);
    }

    public List<Worker> findAllWorkers(){
        return workerRepo.findAll(Sort.by(Sort.Direction.ASC, "name"));
    }
    public Worker findWorkerById(Long workerId) {
        return  workerRepo.findByWorkerId(workerId);
    }
}
