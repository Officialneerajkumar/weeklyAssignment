package com.weeklyTest.EMS.controller;

import com.weeklyTest.EMS.model.Job;
import com.weeklyTest.EMS.service.Service;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "api/v1/ems")
public class controller {

    @Autowired
    private Service service;

    @PostMapping(value = "/add-job")
    public Long addJob(@Valid @RequestBody Job empData){
        return service.addEmployee(empData);
    }
    @GetMapping(value = "/get-all")
    public List<Job> getAll(){
        return service.getAll();
    }

    @GetMapping(value = "/get-by-empName")
    public List<Job> getByEmployerName(@RequestParam String empName){
        return service.getByEmpName(empName);
    }

    @PutMapping(value = "/update-location")
    public String updateEmp(@RequestParam Long id,@RequestParam String newLocation){
        service.updateInfo(id,newLocation);
        return "emp updated successfully !!";
    }

    @DeleteMapping(value = "/delete-emp")
    public String deleteEmp(@RequestParam Long id){
        service.deleteEmp(id);
        return "Emp deleted sccessfully !!";
    }

}
