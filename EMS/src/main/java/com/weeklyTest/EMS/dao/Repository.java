package com.weeklyTest.EMS.dao;

import com.weeklyTest.EMS.model.Job;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import java.util.List;
@org.springframework.stereotype.Repository
public interface Repository extends JpaRepository<Job,Long> {
    List<Job> findByemployerName(String empName);
    @Modifying
    @Transactional
    @Query(value = "update tbl_job set location = :newLocation where id = :Id",nativeQuery = true)
    void updateEmp(Long Id, String newLocation);

    @Modifying
    @Transactional
    @Query(value = "delete from tbl_job where id = :Id",nativeQuery = true)
    void deleteEmpById(Long Id);
}
