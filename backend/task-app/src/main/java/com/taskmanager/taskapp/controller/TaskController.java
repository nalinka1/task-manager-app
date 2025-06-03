package com.taskmanager.taskapp.controller;

import com.taskmanager.taskapp.entity.Task;
import com.taskmanager.taskapp.service.TaskService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin
@RestController
@RequestMapping("/api/tasks")
public class TaskController {

  @Autowired
  private TaskService taskService;

  @PostMapping
  public Task createTask(@RequestBody Task task) {
    return taskService.createTask(task);
  }

  @GetMapping
  public List<Task> getAllTasks() {
    return taskService.getAllTasks();
  }

  @GetMapping("/{id}")
  public Task getTaskById(@PathVariable String id) {
    return taskService.getTaskById(id);
  }

  @PutMapping("/{id}")
  public Task updateTask(@PathVariable String id, @RequestBody Task task) {
    return taskService.updateTask(id, task);
  }

  @DeleteMapping("/{id}")
  public void deleteTask(@PathVariable String id) {
    taskService.deleteTask(id);
  }
}
