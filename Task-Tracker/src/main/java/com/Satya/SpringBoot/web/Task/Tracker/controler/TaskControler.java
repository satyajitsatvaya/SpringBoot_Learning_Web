package com.Satya.SpringBoot.web.Task.Tracker.controler;

import com.Satya.SpringBoot.web.Task.Tracker.model.Tasks;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@Controller
public class TaskControler {

    private List<Tasks> taskList = new ArrayList<>();
    private int taskId = 1;


    // 1. Show all tasks on homepage
    @GetMapping("/")
    public String viewTasks(Model model) {
        model.addAttribute("tasks", taskList);
        return "index";
    }

    // 2. Show form to add a new task
    @GetMapping("/add")
    public String showForm(Model model) {
        model.addAttribute("task", new Tasks());
        return "addTask";
    }

    // 3. Handle form submission
    @PostMapping("/add")
    public String addTask(@ModelAttribute Tasks task) {
        task.setId(taskId++);
        task.setCompleted(false);
        taskList.add(task);
        return "redirect:/";
    }

    // 4. Mark a task as completed
    @GetMapping("/complete/{id}")
    public String completeTask(@PathVariable int id) {
        for (Tasks task : taskList) {
            if (task.getId() == id) {
                task.setCompleted(true);
                break;
            }
        }
        return "redirect:/";
    }

    // 5. Delete a task
    @GetMapping("/delete/{id}")
    public String deleteTask(@PathVariable int id) {
        taskList.removeIf(task -> task.getId() == id);
        return "redirect:/";
    }
}
