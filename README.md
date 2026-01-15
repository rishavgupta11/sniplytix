# 🚀 SnipLytix – High-Performance URL Shortener

SnipLytix is a high-performance URL shortener designed for **fast, secure, and scalable link management**.  
It enables users to generate short URLs, track real-time analytics, and manage links efficiently through a modern dashboard.

The platform is built with **Spring Boot (backend)** and **React (frontend)**, secured using **JWT authentication**, and powered by **PostgreSQL (Neon DB)**.

---

## ✨ Features

- 🔗 **URL Shortening**  
  Instantly shorten long URLs with clean, shareable short links.

- 📊 **Analytics & Tracking**  
  Track total clicks, time-based usage, and link performance through interactive graphs.

- 🔒 **Secure Authentication**  
  JWT-based authentication with role-based access control (RBAC) to protect APIs.

- 🧑‍💻 **User Dashboard**  
  Create, manage, and analyze shortened links from a responsive dashboard.

- ⚡ **Fast Redirects**  
  Optimized backend ensures low-latency redirects and reliable performance.

---

## 🧐 Problem Statement

Managing long URLs is inefficient and makes tracking engagement difficult, especially for marketing campaigns and content sharing.  
SnipLytix solves this by providing a **simple, secure, and analytics-driven** URL shortening platform that helps users monitor link performance and user engagement effectively.

---

## 🛠️ Tech Stack

### Backend
- Java 17+
- Spring Boot
- Spring Security (JWT)
- RESTful APIs
- PostgreSQL (Neon DB)

### Frontend
- React (Vite)
- JavaScript
- Tailwind CSS
- Chart.js (Analytics Visualization)

### Security
- JWT Authentication
- Role-Based Access Control (RBAC)
- Input Validation

### Deployment
- Backend: Render
- Frontend: Netlify
- Database: Neon (PostgreSQL)

---

## 📸 Application Screenshots


### 🏠 Landing Page






---

## 🚩 Getting Started

### ✅ Prerequisites

Make sure you have the following installed:

- Java 17+
- Node.js 18+
- PostgreSQL (or Neon DB account)
- Git

---

## ⚙️ Backend Setup (Spring Boot)

```bash
cd backend
mvn clean package
mvn spring-boot:run
