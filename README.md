# Inventory Management System

A simple **Inventory Management Web Application** built with **Java Spring Boot**, **MySQL**, and a basic **HTML/JS frontend**.  
The project allows users to manage product records — add, update, delete, and view inventory in real time.

---

## 🚀 Features
- Add new inventory items with product name, quantity, and price  
- View all products in a clean, responsive interface  
- Update or delete items easily  
- Connected to MySQL for persistent data storage  
- REST API backend built using Spring Boot  

---

## 🧠 Tech Stack
**Backend:** Java 17, Spring Boot, Maven  
**Database:** MySQL  
**Frontend:** HTML, CSS, JavaScript
**Tools:** IntelliJ IDEA , Git, GitHub  

---

## ⚙️ How to Run Locally

### Prerequisites
- Java 17+ installed  
- Maven installed or use IDE’s Maven support  
- MySQL running locally  

### Steps
1. Clone the repository:
   ```bash
   git clone https://github.com/<your-username>/<repo-name>.git
   cd <repo-name>
2. Configure `application.properties` in `src/main/resources`:
   ```bash
   spring.datasource.url=jdbc:mysql://localhost:3306/inventory_db
   spring.datasource.username=root
   spring.datasource.password=yourpassword
   spring.jpa.hibernate.ddl-auto=update
   ```
3. Run the application or simply click Run in your IDE. :
   ```bash
   mvn spring-boot:run
   ```
4. Open your browser and go to:
   ```bash
   http://localhost:8080
   ```
---

## 📦 Future Enhancements
+ Authentication and user roles
+ Dashboard with analytics
+ Search and filter features
+ React/Angular frontend

---

## 💡 What I Learned

This project helped me understand how a backend and frontend talk to each other through APIs.
I also learned how to handle database operations and set up an end-to-end Java-based web app.

   
