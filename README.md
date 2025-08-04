# 🚗 Parking Slot Management System

A backend system built with **Spring Boot** and **Spring Modulith** to manage vehicle parking entries using clean, modular architecture. This project explores how to structure a monolithic application into well-defined modules, simulating microservice-like behavior without the overhead of distributed systems.

---

## 🧩 Architectural Context

| Architecture Style     | Description |
|------------------------|-------------|
| **Monolithic**         | A single, tightly coupled codebase where all features are deployed together. Simple to start, but hard to scale and maintain. |
| **Microservices**      | Independent services for each domain, communicating via APIs. Highly scalable but complex to manage. |
| **Modular Monolith**   | A monolith with internal modular boundaries. Each module behaves like a mini-service, improving maintainability while keeping deployment simple. |

This project uses **Spring Modulith** to implement a **modular monolith**, combining the simplicity of monoliths with the clarity and scalability of microservices.

---

## 🔧 Tech Stack

- **Java 21**
- **Spring Boot **
- **Spring Modulith**
- **Spring Data JPA**
- **Postgres**
- **Lombok**
- **JUnit 5**
- **PlantUML (via Spring Modulith Documenter)**

---

## 📦 Features

- ✅ Track vehicle entry and exit times
- ✅ Store parking data using JPA entities
- ✅ Use domain events (`VehicleEnteredEvent`) for decoupled logic
- ✅ Modular structure with clear boundaries
- ✅ Unit tests to validate Spring context and module integrity

---

## 📁 Project Structure
