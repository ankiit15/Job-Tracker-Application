# 🚀 Jobify

A modern full-stack **Job Application Tracker** built using:

* ⚛️ React.js
* ☕ Spring Boot
* 🗄️ PostgreSQL/MySQL
* 🎨 Responsive SaaS UI
* 📊 Analytics Dashboard
* 🔐 Authentication Ready

Track job applications, interviews, offers, and manage your career pipeline efficiently.

---

# 📸 Features

✅ Responsive Dashboard
✅ Kanban Job Board
✅ Analytics Section
✅ Add / Delete Jobs
✅ Sidebar Navigation
✅ Modern Login UI
✅ Single-Port Deployment
✅ REST API Backend
✅ PostgreSQL Support
✅ Render Deployment Ready

---

# 🛠️ Tech Stack

## Frontend

* React.js
* React Router
* Axios
* CSS3
* React Icons
* Recharts

## Backend

* Spring Boot
* Spring Data JPA
* REST APIs
* Maven

## Database

* PostgreSQL / MySQL

## Deployment

* Render

---

# 📂 Project Structure

```bash
Job-Tracker-Application/
│
├── frontend/ (optional separate frontend)
│
├── src/main/java/
│   ├── controller/
│   ├── entity/
│   ├── repository/
│   ├── service/
│   └── config/
│
├── src/main/resources/
│   ├── static/
│   └── application.properties
│
├── pom.xml
└── README.md
```

---

# ⚙️ Prerequisites

Before running the project, install:

| Software   | Version |
| ---------- | ------- |
| Java       | 17+     |
| Node.js    | 18+     |
| Maven      | 3.9+    |
| Git        | Latest  |
| PostgreSQL | 14+     |

---

# 🔧 Installation & Setup

---

# 1️⃣ Clone Repository

```bash
git clone https://github.com/YOUR_USERNAME/Job-Tracker-Application.git
```

```bash
cd Job-Tracker-Application
```

---

# 2️⃣ Frontend Setup

```bash
npm install
```

Run React:

```bash
npm start
```

Frontend runs on:

```bash
http://localhost:3000
```

---

# 3️⃣ Backend Setup

## Configure Database

Update:

```properties
src/main/resources/application.properties
```

### PostgreSQL

```properties
spring.datasource.url=jdbc:postgresql://localhost:5432/jobtracker

spring.datasource.username=postgres
spring.datasource.password=yourpassword

spring.jpa.hibernate.ddl-auto=update
```

---

# Run Spring Boot

```bash
mvn spring-boot:run
```

Backend runs on:

```bash
http://localhost:8080
```

---

# 🚀 Single-Port Production Setup

Build React app:

```bash
npm run build
```

Copy:

```bash
build/
```

into:

```bash
src/main/resources/static
```

Now Spring Boot serves frontend + backend together.

---

# 🌐 API Endpoints

| Method | Endpoint                  | Description   |
| ------ | ------------------------- | ------------- |
| GET    | /api/v1/applications      | Get all jobs  |
| POST   | /api/v1/applications      | Add new job   |
| PUT    | /api/v1/applications/{id} | Update status |
| DELETE | /api/v1/applications/{id} | Delete job    |

---

# 📊 Dashboard Features

* Kanban Job Tracking
* Status Management
* Analytics Charts
* Responsive UI
* Sidebar Navigation

---

# 🔐 Authentication

Authentication UI includes:

* Google Login
* GitHub Login
* LinkedIn Login

OAuth backend integration can be added using Spring Security OAuth2.

---

# ☁️ Deployment on Render

---

# Create PostgreSQL Database

On Render:

* New → PostgreSQL
* Copy Internal Database URL

---

# Configure Environment Variables

```env
SPRING_DATASOURCE_URL=your_render_database_url
```

---

# Render Build Settings

## Environment

```text
Java
```

## Build Command

```bash
./mvnw clean install
```

## Start Command

```bash
java -jar target/jobtracker-0.0.1-SNAPSHOT.jar
```

---

# 🧪 Build Frontend Before Deployment

```bash
npm run build
```

Copy build folder into:

```bash
src/main/resources/static
```

Commit & Push:

```bash
git add .
git commit -m "deployment ready"
git push
```

---

# 📱 Responsive Design

Fully responsive for:

* Desktop
* Tablet
* Mobile devices

---

# 🔮 Future Improvements

* Drag & Drop Kanban
* JWT Authentication
* Dark Mode
* Notifications
* Resume Upload
* AI Job Recommendations

---

# 👨‍💻 Author

**Diksha Hawale**
**Ankit Jadhav**

GitHub:

```text
https://github.com/dikshah16
```
```text
https://github.com/ankiit15
```


---

# 📄 License

This project is licensed under the MIT License.
