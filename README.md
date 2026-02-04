# Item Management REST API

A simple Spring Boot REST API for managing items.  
This project was built as a sample task for a Freelance Java Developer opportunity.

---

## 🚀 Tech Stack

- Java 17+
- Spring Boot
- Maven
- In-memory storage (ArrayList)

---

## ▶️ How to Run the Application

1. Clone the repository:

2. Open project in IDE (Eclipse/IntelliJ)

3. Run:


## 📌 API Endpoints

### ➜ Add Item

POST `/items`

Request Body:

```json
{
  "id": 1,
  "name": "Laptop",
  "description": "Gaming laptop"
}



➜ Get Item by ID

GET /items/{id}

Example:

GET /items/1
