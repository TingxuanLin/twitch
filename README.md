# Twitch Search & Recommendation Platform

A backend-focused, learning-oriented project that simulates core features of a Twitch-like platform, including search, favorites, and personalized recommendations. The project emphasizes clean API design, relational data modeling, cloud deployment, and CI/CD automation.

---

## Overview

This project was built to practice **end-to-end backend development** and **production-style engineering workflows**. It exposes RESTful APIs for searching content, managing user preferences, and generating basic recommendations based on user interactions. The application is deployed on AWS and includes automated build and deployment pipelines.

---

## Tech Stack

- **Backend:** Java, Spring Boot  
- **Database:** MySQL (AWS RDS)  
- **Cloud & Deployment:** AWS EC2, Route 53  
- **DevOps:** Docker, GitHub Actions, Bash  
- **Architecture:** RESTful APIs, layered architecture (Controller / Service / Repository)

---

## Features

- Search APIs for retrieving content with filtering and sorting  
- Favorites management for user-selected content  
- Rule-based recommendation engine using user search history and preferences  
- Relational data modeling with indexed queries for improved performance  
- Automated CI/CD pipeline for build, test, and deployment  
- Cloud deployment with security groups, health checks, and DNS configuration  

---

## System Architecture

The application follows a **layered architecture**:

- **Controller Layer:** Handles HTTP requests and responses  
- **Service Layer:** Contains business logic and recommendation rules  
- **Repository Layer:** Manages database access and query execution  

This separation improves maintainability, testability, and clarity of responsibilities.

---

## Recommendation Logic (High Level)

The recommendation engine is rule-based and learning-focused. It generates recommendations by analyzing:

- User search history  
- Favorite content categories  
- Recent interaction patterns  

This approach was chosen to focus on **data modeling, query optimization, and system design**, rather than machine learning complexity.

---

## Database Design

- Normalized relational schema designed for search and filtering use cases  
- Indexed frequently queried columns to reduce query latency  
- Hosted on AWS RDS for managed backups and scalability  

---

## CI/CD & Deployment

- GitHub Actions pipeline automates:
  - Code checkout  
  - Build and test steps  
  - Docker image creation  
  - Deployment to AWS EC2  
- Bash scripts are used to standardize environment setup and deployment steps  
- Route 53 is configured for DNS management and stable access  

---

## Running Locally

### Prerequisites
- Java 17+
- MySQL
- Docker (optional)
- AWS CLI (for deployment-related tasks)

### Steps

```bash
# Clone the repository
git clone https://github.com/your-username/your-repo-name.git
cd your-repo-name

# Configure database credentials
# (application.properties or environment variables)

# Run the application
./mvnw spring-boot:run
