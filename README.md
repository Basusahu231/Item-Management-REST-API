#  Item Management REST API

A simple Spring Boot REST API for managing items.  
This project was developed as a sample task for a Freelance Java Developer opportunity.

---

## 🚀 Tech Stack

- Java 17
- Spring Boot
- Maven
- REST API
- In-memory storage (ArrayList)

---

## ▶️ How to Run the Application

### 1️⃣ Clone the repository
git clone https://github.com/yourusername/item-management-api.git

---

### 2️⃣ Open in IDE

Open the project in:

- IntelliJ IDEA  
- Eclipse  
- VS Code  

---

### 3️⃣ Run the application

Run:
DeltaSigmaAventuresTaskApplication.java


## 📌 Base API URL
http://localhost:8080/api/items


---

# 📬 API Endpoints

---

## ➜ Add Item

 POST : http://localhost:8080/api/items

### Request Body

```json
{
  "id": 1,
  "name": "Laptop",
  "description": "Gaming laptop"
}


➜ Get Item by ID
GET /{id}

Example:

  GET :localhost:8080/api/items/103
  

Response
{
  "id": 1,
  "name": "Laptop",
  "description": "Gaming laptop"
}


### Validation

The following validations are applied:

ID must not be null

Name must not be empty

Description must not be empty

If validation fails, API returns:

400 Bad Request
