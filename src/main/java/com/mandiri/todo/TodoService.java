package com.mandiri.todo;

import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Service
public class TodoService {

    private static List<Todo> todos = new ArrayList<>();
    private static int todosCount = 0;
    static {
        todos.add(new Todo(++todosCount, "farhanmozart", "Learn Springboot", LocalDate.now().plusWeeks(4), "No"));
        todos.add(new Todo(++todosCount, "farhanmozart", "Learn SQL", LocalDate.now().plusWeeks(6), "No"));
        todos.add(new Todo(++todosCount, "farhanmozart", "Learn Query", LocalDate.now().plusWeeks(7), "No"));
        todos.add(new Todo(++todosCount, "farhanmozart", "Learn Maven", LocalDate.now().plusWeeks(8), "No"));
    }

    public List<Todo> findByUsername (String username){
        return todos;
    }

    public void addTodo(String username, String description, LocalDate targetDate, String isDone){
        Todo todo = new Todo(++todosCount, username, description, targetDate, isDone);
        todos.add(todo);
    }

}
