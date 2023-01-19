package com.mandiri.todo;

import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Service
public class TodoService {

    private static List<Todo> todos = new ArrayList<>();
    static {
        todos.add(new Todo("1", "farhanmozart", "Learn Springboot", LocalDate.now().plusWeeks(2), "No"));
        todos.add(new Todo("2", "wahyumulya", "Learn ReactJs", LocalDate.now().plusMonths(2), "No"));
        todos.add(new Todo("3", "prayogipangersa", "Learn Springboot", LocalDate.now().plusYears(1), "No"));
        todos.add(new Todo("4", "refzakurniawan", "Documenting requirements", LocalDate.now().plusWeeks(3), "No"));
    }

    public List<Todo> findByUsername (String username){

        return todos;
    }

}
