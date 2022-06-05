package com.example.demo.repository;

import com.example.demo.model.Employee;
import org.springframework.data.couchbase.repository.CouchbaseRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EmployeeRepository extends CouchbaseRepository<Employee, String> {

    List<Employee> findAllByFullName(String fullName);
}
