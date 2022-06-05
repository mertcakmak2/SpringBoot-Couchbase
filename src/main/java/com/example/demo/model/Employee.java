package com.example.demo.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.couchbase.core.mapping.Document;
import org.springframework.data.couchbase.core.mapping.Field;
import org.springframework.data.couchbase.core.mapping.id.GeneratedValue;
import org.springframework.data.couchbase.core.mapping.id.GenerationStrategy;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Document
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationStrategy.UNIQUE)
    String id;
    @Field(value = "full_name")
    String fullName;
    @Field
    int age;
    @Field(value = "phone_number")
    String phoneNumber;
    @Field
    String address;
    @Field(value = "work_department")
    String workDepartment;
}
