# SaveUP

**SaveUP** is a web-based **personal finance management system** designed to help users understand where their money is going and make more conscious decisions in their daily lives.

The idea is simple: each month, users record **notes** for income (money earned) or expenses (money spent). For expenses, users can indicate whether the spending was necessary or not, which helps identify where there is room to save. At the end of each month, users can also leave a comment with their thoughts and reflections on their own finances.

> 🚧 **Work in progress.** SaveUP is under development and a lot is still going to change along the way.

---

## Features

* **User Management:** Create and manage user accounts.
* **Authentication:** Secure login so each person can only access their own information.
* **Monthly Notes:** Record income and expenses organized by month, including name, amount, and description.
* **Expense Classification:** Mark expenses as necessary or unnecessary.
* **Monthly Comment:** A space to write observations and reflections about each month.
* **Period Control:** View financial transactions month by month.
* **Chart Visualization:** Visualize monthly data through charts.
* **Database Integration:** Data persistence with PostgreSQL, with database versioning through migrations.

---

## Technology Stack

* **Backend:** Spring Boot, Java 17, Spring MVC, Spring Data JPA (Hibernate), Lombok
* **Database:** PostgreSQL
* **Migrations:** Flyway
* **Containerization:** Docker
* **Build Tool:** Maven

---

## Project Structure

```
src/
├── main/
│   ├── java/
│   │   └── com.example.saveUP/
│   │       ├── controller/     
│   │       ├── dto/            
│   │       ├── entities/        
│   │       ├── repositories/    
│   │       └── service/         
│   └── resources/
│       ├── db/migration/        
│       └── application.properties  
└── test/                        
```

---

## Status

Under development. If you like the idea behind the project, a star is very welcome!

