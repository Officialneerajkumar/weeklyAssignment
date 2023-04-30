package com.weeklyTest.EMS.model;

import jakarta.persistence.*;

import jakarta.validation.constraints.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "tbl_job")
public class Job {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private Long id;
    @Column(name = "title")
    @NotBlank(message = "title can't be null or empty or blank !!")
    private String title;
    @Column(name = "description")
    private String description;
    @NotBlank(message = "location can't be null or empty or blank !!")
    @Column(name = "location")
    private String location;
    @Column(name = "salary")
    private Double salary;
    @Column(name = "company_name")
    @NotBlank(message = "companyName can't be null or empty or blank !!")
    private String companyName;
    @NotBlank(message = "employerName can't be null or empty or blank !!")
    @Column(name = "employer_name")
    private String employerName;
    //    @Enumerated(EnumType.STRING)
//    private enum jobType{
//        IT,HR,SALES,MARKETING
//    }
    @Column(name = "applied_date")
    @Pattern(regexp = "^(1[0-2]|0[1-9])-(3[01]|[12][0-9]|0[1-9])-[0-9]{4}$", message = "Please enter the valid date and seperate with '-' !!")
    private String appliedDate;
}


//(JOB could be IT, HR , Sales, Marketing, etc...choose anything u want put the types should be in an enum)
 //optional if you can handle the date then put