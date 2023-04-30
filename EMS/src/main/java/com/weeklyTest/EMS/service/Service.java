package com.weeklyTest.EMS.service;

import com.weeklyTest.EMS.dao.Repository;
import com.weeklyTest.EMS.model.Job;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.List;

@org.springframework.stereotype.Service
public class Service {
    @Autowired
    private Repository repository;

    public Long addEmployee(Job empData) {
        Job newEmp = repository.save(empData);
        return newEmp.getId();
    }

    public List<Job> getAll() {
        return repository.findAll();
    }

    public List<Job> getByEmpName(String empName) {
        return repository.findByemployerName(empName);
    }

    public void updateInfo(Long id, String newLocation) {
        repository.updateEmp(id,newLocation);
    }

    public void deleteEmp(Long id) {
        repository.deleteEmpById(id);
    }
}
