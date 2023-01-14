package com.dailycodebuffer.Springboot.tutorial.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.query.sql.internal.ParameterRecognizerImpl;
import org.hibernate.validator.constraints.Length;

@Entity
//for use lombok use Data, No argconstrucure,all arg, builder
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Department {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long department;
    @NotBlank(message = "Please add the Department Name")
//    @Length(max = 5, min =1)
//    @Size(max =10, min =1)
//    @Email
//    @Positive
//    @Negative
    private String departmentName;
    private String departmentAddress;
    private String departmentCode;





    // use of lombok can remove all the boiler plates like getter-setter , constructure, etc..
//    public Department(Long department, String departmentName, String departmentAddress, String departmentCode) {
//        this.department = department;
//        this.departmentName = departmentName;
//        this.departmentAddress = departmentAddress;
//        this.departmentCode = departmentCode;
//    }
//
//    public Department() {
//    }
//
//    @Override
//    public String toString() {
//        return "Department{" +
//                "department=" + department +
//                ", departmentName='" + departmentName + '\'' +
//                ", departmentAddress='" + departmentAddress + '\'' +
//                ", departmentCode='" + departmentCode + '\'' +
//                '}';
//    }
//
//    public Long getDepartment() {
//        return department;
//    }
//
//    public void setDepartment(Long department) {
//        this.department = department;
//    }
//
//    public String getDepartmentName() {
//        return departmentName;
//    }
//
//    public void setDepartmentName(String departmentName) {
//        this.departmentName = departmentName;
//    }
//
//    public String getDepartmentAddress() {
//        return departmentAddress;
//    }
//
//    public void setDepartmentAddress(String departmentAddress) {
//        this.departmentAddress = departmentAddress;
//    }
//
//    public String getDepartmentCode() {
//        return departmentCode;
//    }
//
//    public void setDepartmentCode(String departmentCode) {
//        this.departmentCode = departmentCode;
//    }
}
