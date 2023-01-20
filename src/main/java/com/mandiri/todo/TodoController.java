package com.mandiri.todo;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;

import java.time.LocalDate;
import java.util.List;

@Controller
@SessionAttributes("name")
public class TodoController {

    private TodoService todoService;

    public TodoController(TodoService todoService) {
        this.todoService = todoService;
    }

    @RequestMapping("/list-todos")
    public String listAllTodos(ModelMap modelMap) {
        List<Todo> todos = todoService.findByUsername("farhanmozart");
        modelMap.addAttribute("todos", todos);
        return "list-todos";
    }

    @RequestMapping(value = "/add-todos", method = RequestMethod.GET)
    public String showNewTodo() {
        return "add-todos";
    }

    @RequestMapping(value = "/add-todos", method = RequestMethod.POST)
    public String addNewTodo(@RequestParam String description,
                             @RequestParam @DateTimeFormat(pattern = "yyyy-MM-dd") LocalDate targetDate,
                             @RequestParam String isDone, ModelMap modelMap) {
        String username = (String)modelMap.get("name");
        todoService.addTodo(username, description, targetDate, isDone);
        return "redirect:list-todos";
    }
}
