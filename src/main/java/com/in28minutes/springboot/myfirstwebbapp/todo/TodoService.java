package com.in28minutes.springboot.myfirstwebbapp.todo;

import org.springframework.cglib.core.Local;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Service
public class TodoService {

    private static List<Todo> todos = new ArrayList<>();

    static {
        todos.add(new Todo(1, "in28minutes", "Learn AWS",
                LocalDateTime.now().plusYears(1), false));
        todos.add(new Todo(2, "in28minutes", "Learn DevOps",
                LocalDateTime.now().plusYears(2), false));
        todos.add(new Todo(3 , "in28minutes", "Learn Full Stack Development",
                LocalDateTime.now().plusYears(3), false));
    }

    public List<Todo> findByUsername(String username){
        return todos;
    }
}
