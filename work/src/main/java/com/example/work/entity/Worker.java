package com.example.work.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Worker {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Long workerId;
    String name;
    Integer age;
    Integer experience;
    String specialization;
    String address;
    String mobileNumber;
    String aadharNumber;
    Long rateHourly;
    Long rateDaily;
    String availabilityDate;

}
