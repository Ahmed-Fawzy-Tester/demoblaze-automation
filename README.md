# 🚀 Demoblaze Selenium Automation Project

## 📌 Overview

This project is an **End-to-End (E2E) Test Automation Framework** built using:

* Java
* Selenium WebDriver
* TestNG
* Maven
* Docker
* Jenkins (CI/CD)

It automates user flows on the **Demoblaze** website, simulating real user behavior such as login and purchasing products.

---

## 🧱 Project Structure

```
src/test/java
│
├── base
│     BaseTest.java
│
├── pages
│     LoginPage.java
│     HomePage.java
│
├── utils
│     WaitUtils.java
│
├── tests
│     EndToEndTest.java
```

---

## ⚙️ Tech Stack

| Tool     | Purpose                       |
| -------- | ----------------------------- |
| Selenium | Browser automation            |
| TestNG   | Test framework                |
| Maven    | Build & dependency management |
| Docker   | Containerization              |
| Jenkins  | Continuous Integration        |

---

## 🔥 Features

* ✅ Page Object Model (POM) design pattern
* ✅ Explicit waits for stability
* ✅ End-to-End test scenario (Login → Add to Cart → Checkout)
* ✅ Dockerized test execution
* ✅ CI/CD pipeline with Jenkins

---

## 🧪 Test Scenario

* Open Demoblaze website
* Login with valid credentials
* Select a product
* Add product to cart
* Place order

---

## ▶️ Run Tests Locally

```bash
mvn clean test
```

---

## 🐳 Run Tests with Docker

```bash
docker-compose up --build
```

---

## 🤖 Run with Jenkins

1. Create a Pipeline job
2. Connect to this repository
3. Run pipeline

---

## ⚠️ Common Issues & Fixes

### Stale Element Exception

* Use explicit waits (`WaitUtils`)
* Avoid storing elements before page reload

### Maven Dependency Issues

```bash
docker-compose build --no-cache
```

---

## 📈 Future Improvements

* 🔹 Add Allure Reports
* 🔹 Parallel test execution
* 🔹 Cross-browser testing (Selenium Grid)
* 🔹 GitHub Actions integration

---

## 👨‍💻 Author

**Ahmed Fawzy**
QA Automation Engineer | DevOps Enthusiast

---

## ⭐ If you like this project

Give it a star ⭐ on GitHub!
