# 📝 Task Manager App

A full-stack web application to manage tasks, built with:

- **Frontend**: Angular
- **Backend**: Spring Boot
- **Database**: MongoDB

---

## 📁 Project Structure

```
task-manager/
├── backend/        # Spring Boot application
├── frontend/       # Angular application
└── docker-compose.yml
```

---

## 🚀 Getting Started

### 📦 Prerequisites

- Node.js (v18+)
- Angular CLI (v17+)
- Java 17
- Maven or Gradle
- MongoDB
- Docker

---

## 🧠 Backend Setup (Spring Boot)

### 📂 Navigate to backend folder:

```bash
cd backend
```

### 🔨 Build & Run

```bash
./mvnw spring-boot:run
```

### 🛠️ API Endpoints

| Method | Endpoint            | Description          |
|--------|---------------------|----------------------|
| GET    | `/api/tasks`        | Get all tasks        |
| GET    | `/api/tasks/{id}`   | Get task by ID       |
| POST   | `/api/tasks`        | Create new task      |
| PUT    | `/api/tasks/{id}`   | Update existing task |
| DELETE | `/api/tasks/{id}`   | Delete task by ID    |

### ⚙️ MongoDB Configuration

Set in `application.properties`:
```properties
spring.data.mongodb.uri=mongodb://localhost:27017/taskdb
```

---

## 🎨 Frontend Setup (Angular)

### 📂 Navigate to frontend folder:

```bash
cd frontend
```

### 📦 Install dependencies

```bash
npm install
```

### ▶️ Run the Angular app

```bash
ng serve --open
```

---

## 🐳 Run with Docker

### ⚙️ Docker Setup

```bash
docker-compose up --build
```

### Includes:
- MongoDB
- Backend Spring Boot App
- Frontend Angular App

---

## 📸 Screenshots

### Login

![image](https://github.com/user-attachments/assets/f855f26c-1f94-483f-b6db-b07699779ab1)

### Landing page

![image](https://github.com/user-attachments/assets/3d17a9b4-98d2-4d3f-ad83-9123e70022f4)

### Create - Title Validation 

![image](https://github.com/user-attachments/assets/d5d4df02-5071-4308-9810-6e3bed89c4e4)

### Create - new Item
![image](https://github.com/user-attachments/assets/2cf5c3d2-2339-43c0-b0d4-0e1801af4602)
![image](https://github.com/user-attachments/assets/8ceb8180-cb9f-4316-99a4-cdf9d9e8664c)

### Filteration 

![image](https://github.com/user-attachments/assets/a16b83b2-6bde-494d-bb60-60bc28d3fa0e)

### Edit

![image](https://github.com/user-attachments/assets/6a1e32b9-1b4a-479b-a8ff-965d278bbb5a)
![image](https://github.com/user-attachments/assets/f066519b-1291-467c-b3d8-436427b86086)

### Delete

![image](https://github.com/user-attachments/assets/b0fa95ce-e868-46de-a1bd-dec5860ae45c)
![image](https://github.com/user-attachments/assets/a720ef45-7050-4c3b-af57-2924812e90ea)

### MongoDB
![image](https://github.com/user-attachments/assets/769301e4-1898-4c20-a97f-f1158caa0600)

### docker-compose.yml run

![image](https://github.com/user-attachments/assets/d8ae5546-3adb-41c1-b2b7-f9cd6dd54c4a)
![image](https://github.com/user-attachments/assets/6c222803-b6ed-4895-932f-eeb4eab9d2d6)













---

## 👨‍💻 Author

- Developed by Nalinka Heshan
