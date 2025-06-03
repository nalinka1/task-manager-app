import { Component, OnInit } from '@angular/core';
import {FormBuilder, FormGroup, ReactiveFormsModule, Validators} from '@angular/forms';
import { TaskService } from '../services/task.service';
import { ActivatedRoute, Router } from '@angular/router';
import { Task } from '../tasks/models/task.model';
import {NgClass, NgIf} from "@angular/common";

@Component({
  selector: 'app-task-form',
  standalone: true,
  imports: [
    ReactiveFormsModule,
    NgIf,
    NgClass
  ],
  templateUrl: './task-form.component.html',
  styleUrl: './task-form.component.css'
})
export class TaskFormComponent implements OnInit {
  taskForm: FormGroup;
  isEditMode = false;
  taskId!: string;

  constructor(
    private fb: FormBuilder,
    private taskService: TaskService,
    private route: ActivatedRoute,
    protected router: Router
  ) {
    this.taskForm = this.fb.group({
      title: ['', [Validators.required, Validators.maxLength(100)]],
      description: ['', Validators.maxLength(250)],
      status: ['TO_DO', Validators.required]
    });
  }

  ngOnInit(): void {
    this.taskId = this.route.snapshot.paramMap.get('id')!;
    if (this.taskId) {
      this.isEditMode = true;
      this.taskService.getById(this.taskId).subscribe(task => this.taskForm.patchValue(task));
    }
  }

  onSubmit(): void {
    if (this.taskForm.invalid) return;

    const task: Task = this.taskForm.value;

    if (this.isEditMode) {
      this.taskService.update(this.taskId, task).subscribe(() => this.router.navigate(['/tasks']));
    } else {
      this.taskService.create(task).subscribe(() => this.router.navigate(['/tasks']));
    }
  }
}
