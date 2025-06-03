package com.taskmanager.taskapp.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.validation.constraints.NotBlank;
import java.time.LocalDateTime;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "tasks")
@Getter
@Setter
public class Task {

  @Id
  private String id;
  @NotBlank(message = "Title is required")
  private String title;
  private String description;
  private String status;
  @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
  private LocalDateTime createdAt;


  public Task() {
    this.createdAt = LocalDateTime.now();
  }

  public Task(String title, String description, String status) {
    this.title = title;
    this.description = description;
    this.status = status;
    this.createdAt = LocalDateTime.now();
  }
}
