package com.example.work.controller;

import com.example.work.entity.Worker;
import com.example.work.service.WorkerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/work")
public class WorkerController {

    @Autowired
    private WorkerService workerService;

    @CrossOrigin(origins = "http://localhost:4200")
    @PostMapping("/")
    public Worker createUser(@RequestBody Worker worker){
        return workerService.createUser(worker);
    }

    @CrossOrigin(origins = "http://localhost:4200")
    @GetMapping("/all")
    public List<Worker> findAllDepartment(){
        return workerService.findAllWorkers();
    }

    //@CrossOrigin(origins = "http://localhost:4200")
    @GetMapping("/{id}")
    public Worker findWorkerById(@PathVariable("id") Long workerId ){
        return workerService.findWorkerById(workerId);
    }
}
