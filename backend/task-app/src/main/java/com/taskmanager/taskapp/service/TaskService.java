package com.taskmanager.taskapp.service;

import com.taskmanager.taskapp.entity.Task;
import java.util.List;

public interface TaskService {

  Task createTask(Task task);

  List<Task> getAllTasks();

  Task getTaskById(String id);

  Task updateTask(String id, Task task);

  void deleteTask(String id);
}
