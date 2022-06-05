package com.example.demo.controller;

import com.example.demo.model.Todo;
import com.example.demo.repository.TodoRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/todos")
@RequiredArgsConstructor
public class TodoController {

    private final TodoRepository repository;

    @GetMapping("/todos")
    public List<Todo> getTodos() {
        return repository.findAll();
    }

    @PostMapping("/add/todo")
    public Todo saveTodo() {
        return repository.save(Todo.builder().todo("todo 1").build());
    }
}
