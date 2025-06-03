package com.taskmanager.taskapp.repository;

import com.taskmanager.taskapp.entity.Task;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface TaskRepository extends MongoRepository<Task, String> {
}
