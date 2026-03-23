# DemoBlaze E2E Test Automation 🛒🚀

A robust, End-to-End (E2E) web automation testing project for [DemoBlaze.com](https://www.demoblaze.com/), an e-commerce demo application. Built using Java, Selenium WebDriver 4, TestNG, and the Page Object Model (POM) design pattern.

## 📌 Project Overview
The goal of this project is to automate the user shopping flow on DemoBlaze. It specifically handles complex UI interactions, such as dynamic JavaScript alerts that appear during the "Add to Cart" process, ensuring a stable and reliable automated test suite.

### 🌟 Key Features
- **Page Object Model (POM):** Clean separation of test logic from page actions for high maintainability.
- **Selenium Manager:** Native driver management using Selenium 4.27.0 (no external `WebDriverManager` needed).
- **Explicit Waits:** Smart synchronization using `WebDriverWait` to handle dynamic elements and JavaScript alerts smoothly.
- **TestNG Integration:** Structured test execution, assertions, and reporting.

---

## 🛠️ Technology Stack
- **Language:** Java 24
- **Automation Tool:** Selenium WebDriver (v4.27.0)
- **Testing Framework:** TestNG (v7.10.2)
- **Build Tool:** Maven
- **Design Pattern:** Page Object Model (POM)

## 🐳 Docker + Selenium Grid
docker-compose up -d && mvn test -Dgrid=true

## 🔄 Jenkins CI/CD
See Jenkinsfile for complete pipeline

---

## 📂 Project Structure
```text
src/
├── main/java/utils/
│   └── DriverManager.java       # Centralized browser & driver setup
├── test/java/pages/
│   ├── HomePage.java            # Home page actions & locators
│   ├── ProductPage.java         # Product details & Alert handling
│   └── CartPage.java            # Cart verification logic
├── test/java/tests/
│   └── EndToEndTest.java        # Main test execution flow
└── test/resources/
    └── testng.xml               # TestNG suite configuration
