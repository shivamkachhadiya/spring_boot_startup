# 📘 Spring Boot Core Concepts – IoC Container & ApplicationContext

### 👨‍🎓 Author: Shivam Kachhadiya  
🎓 VIT Vellore, Tamil Nadu  
🎯 Goal: Placement in a Product-Based FinTech Company

---

## 📌 Topics Covered
- IoC (Inversion of Control)
- IoC Container in Spring
- Types of IoC Containers
- ApplicationContext Features
- BeanFactory vs ApplicationContext
- Interview Q&A

---

## 🔄 What is IoC (Inversion of Control)?

IoC is a design principle where the control of object creation and dependency injection is handed over to the Spring container instead of being managed manually by the developer.

### ✅ Example:

**Without Spring:**
```java```
Car car = new Car();

With Spring IoC:
@Autowired
Car car;

🧠 What is the IoC Container?
The IoC container is the core of the Spring Framework. It:
Creates and manages Java objects (called Beans)
Injects dependencies where required
Handles the complete lifecycle of beans

📁 What is ApplicationContext?
ApplicationContext is the most commonly used Spring IoC container. It is a sub-interface of BeanFactory and provides more features for enterprise-level applications.

🔧 Features:

Eager loading of beans
Dependency Injection support
Bean lifecycle management
Event publishing
Internationalization (i18n)
Resource loading from classpath, filesystem, etc.

✅ Example (Spring Boot):
@SpringBootApplication
public class MyApp {
    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(MyApp.class, args);
        Car car = context.getBean(Car.class);
    }
}

| Feature              | `BeanFactory`       | `ApplicationContext`        |
| -------------------- | ------------------- | --------------------------- |
| Bean Loading         | Lazy (when needed)  | Eager (at startup)          |
| Memory Efficient     | ✅ Yes               | ❌ Slightly less (initially) |
| AOP Support          | ❌ Limited           | ✅ Full                      |
| Internationalization | ❌ Not supported     | ✅ Supported                 |
| Event Handling       | ❌ No                | ✅ Yes                       |
| Use Case             | Simple apps/testing | Full Spring applications    |


📋 Interview Questions & Answers
1. What is IoC in Spring Framework?
Answer: Inversion of Control is a design pattern where Spring takes responsibility for creating objects and injecting dependencies automatically.

2. What is the IoC Container?
Answer: It's the core component in Spring that creates, wires, configures, and manages the lifecycle of application objects (beans).

3. What are the types of IoC Containers?
Answer:

BeanFactory – Basic, lazy loading

ApplicationContext – Advanced, eager loading

4. Difference between BeanFactory and ApplicationContext?
Answer:

BeanFactory is minimal and loads beans lazily.

ApplicationContext is full-featured, loads beans eagerly, and supports events, AOP, etc.

5. Why use ApplicationContext in Spring Boot?
Answer: It supports features like annotation scanning, autowiring, lifecycle callbacks, events, and is required for full-fledged enterprise applications.

6. How does Spring Boot create and manage beans?
Answer: Spring Boot scans the classpath for annotations like @Component, @Service, @Repository, creates beans automatically, and injects them using @Autowired.

7. What is the use of @Autowired?
Answer: It tells Spring to automatically inject a dependency (bean) into the marked field, constructor, or method.

8. Can we have multiple ApplicationContexts?
Answer: Yes, but it's rarely used. It's common in complex modular apps like Spring MVC with parent-child context.

| Annotation               | Purpose                                                                  |
| ------------------------ | ------------------------------------------------------------------------ |
| `@Component`             | Marks a class as a Spring-managed bean                                   |
| `@Autowired`             | Injects dependency automatically                                         |
| `@Configuration`         | Marks a class as a configuration class                                   |
| `@Bean`                  | Manually define a bean in config class                                   |
| `@SpringBootApplication` | Main entry point, enables auto config, component scan, and configuration |


✅ Summary
IoC: Spring manages object creation & wiring

IoC Container: Core engine that manages beans

BeanFactory: Lightweight, basic container

ApplicationContext: Powerful container with full support

Use ApplicationContext in all Spring Boot applications



---

✅ Just copy this entire content and paste it into your `README.md` file — everything is self-contained and structured for revision, GitHub portfolio, and interviews.

Would you like a similar crisp file for **Spring Bean Lifecycle** or **Spring Scopes** next?

