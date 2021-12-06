package com.example.work.repository;

import com.example.work.entity.Worker;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface WorkerRepo extends JpaRepository<Worker, Long> {


    Worker findByWorkerId(Long workerId);
}
