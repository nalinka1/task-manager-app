import { Component } from '@angular/core';
import { RouterOutlet } from '@angular/router';
import {HttpClientModule} from "@angular/common/http";
import {TaskService} from "./services/task.service";

@Component({
  selector: 'app-root',
  standalone: true,
  imports: [RouterOutlet, HttpClientModule],
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css'],
  providers: [TaskService]
})
export class AppComponent {
  title = 'task-manager';
}
