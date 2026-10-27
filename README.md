# 🎨 portfolio-backend
A Spring Boot REST API powering the Artist Portfolio application.

This project showcases backend development skills using **Java**, **Spring Boot**, **PostgreSQL**, **Docker**, and 
**AWS** cloud deployment. The application manages artist and artwork data through a RESTful API and is designed to
integrate with a modern React frontend.
This is the backend module of the application.

## 🛠️ Technologies Used
* **Language:** Java21
* **Framework:** Spring Boot
* **Database:** PostgreSQL
* **Containerization:** Docker
* **Build Tool:** Gradle
* **Cloud Deployment:** AWS 

## Prerequisites
Before running the application, ensure you have the following installed on your machine:
* **Java Development Kit (JDK) 21**
* **Database:** Configured and running PostgreSQL instance
* **Docker:** For containerization (optional but recommended)

## 🚀 Getting Started

### 1. Clone the repository (If downloaded separately)
```bash
git clone <BACKEND_REPOSITORY_URL>
cd <BACKEND_FOLDER_NAME>
```

### 2. Configure Environment Variables
Modify the `src/main/resources/application.properties` (or `.yml`) file with your local database credentials:
```properties
spring.datasource.url=jdbc:postgresql://localhost:5432/your_db_name
spring.datasource.username=your_username
spring.datasource.password=your_password
```

### 3. Run the Application
```bash
./gradlew bootRun
```
*Alternatively, you can just click the **Run button (Green Arrow)** in the top right corner of IntelliJ IDEA.*


