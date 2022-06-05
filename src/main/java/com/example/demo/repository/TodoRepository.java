package com.example.demo.repository;

import com.example.demo.model.Todo;
import org.springframework.data.couchbase.repository.CouchbaseRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TodoRepository extends CouchbaseRepository<Todo, String> {

    List<Todo> findAllByTodo(String todo);
}

