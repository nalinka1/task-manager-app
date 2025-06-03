package com.taskmanager.taskapp.service;

import com.taskmanager.taskapp.entity.Task;
import com.taskmanager.taskapp.repository.TaskRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TaskServiceImpl implements TaskService {

  @Autowired
  private TaskRepository taskRepository;

  @Override
  public Task createTask(Task task) {
    return taskRepository.save(task);
  }

  @Override
  public List<Task> getAllTasks() {
    return taskRepository.findAll();
  }

  @Override
  public Task getTaskById(String id) {
    return taskRepository.findById(id).orElse(null);
  }

  @Override
  public Task updateTask(String id, Task task) {
    Task existing = taskRepository.findById(id).orElse(null);
    if (existing == null) {
      return null;
    }
    existing.setTitle(task.getTitle());
    existing.setDescription(task.getDescription());
    existing.setStatus(task.getStatus());
    return taskRepository.save(existing);
  }

  @Override
  public void deleteTask(String id) {
    taskRepository.deleteById(id);
  }
}
