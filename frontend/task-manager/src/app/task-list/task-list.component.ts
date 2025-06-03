import { Component, OnInit } from '@angular/core';
import { Task } from '../tasks/models/task.model';
import { TaskService } from '../services/task.service';
import { Router } from '@angular/router';
import {FormsModule} from "@angular/forms";
import {NgForOf, CommonModule } from "@angular/common";
import { HttpClientModule } from '@angular/common/http';

@Component({
  selector: 'app-task-list',
  standalone: true,
  imports: [
    FormsModule,
    NgForOf,
    CommonModule,
    HttpClientModule
  ],
  templateUrl: './task-list.component.html',
  styleUrl: './task-list.component.css'
})
export class TaskListComponent implements OnInit {
  tasks: Task[] = [];
  filteredTasks: Task[] = [];
  selectedStatus = '';

  constructor(private taskService: TaskService, private router: Router) {}

  ngOnInit(): void {
    this.loadTasks();
  }

  loadTasks(): void {
    console.log('loading tasks!')
    this.taskService.getAll().subscribe(data => {
      this.tasks = data;
      console.log(this.tasks);
      this.filterByStatus();
    });
  }

  filterByStatus(): void {
    if (this.selectedStatus) {
      this.filteredTasks = this.tasks.filter(task => task.status === this.selectedStatus);
    } else {
      this.filteredTasks = [...this.tasks];
    }
  }

  onEdit(id: string): void {
    this.router.navigate(['/tasks', id, 'edit']);
  }

  onDelete(id: string): void {
    if (confirm('Are you sure?')) {
      this.taskService.delete(id).subscribe(() => this.loadTasks());
    }
  }

  onCreate(): void {
    this.router.navigate(['/tasks/new']);
  }
}
