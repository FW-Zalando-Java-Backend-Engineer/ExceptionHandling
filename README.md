# ☕ Java Exception Handling – Coffee Shop Example

Welcome to today's Java lesson on **Exception Handling** – one of the most critical tools for writing robust and user-friendly applications!

In this session, we explored how to gracefully manage errors that occur during program execution using Java's exception handling mechanism.

---

## 🎯 Learning Objectives

By the end of this exercise, you should be able to:

- Understand the difference between **checked**, **unchecked**, and **custom exceptions**
- Use `try`, `catch`, `finally`, `throw`, and `throws` effectively
- Handle multiple types of exceptions in a clean, maintainable way
- Simulate real-world errors and respond to them programmatically

---

## 🧪 Exercise: Coffee Shop Ordering System

You’ll build a simple program that simulates a coffee ordering system. Through it, you'll implement different types of exception handling techniques.

### 💻 Requirements:

- ✅ Use `IllegalArgumentException` to catch null or empty inputs
- ✅ Create and use a `CoffeeNotAvailableException` for unavailable menu items
- ✅ Use `FileNotFoundException` to simulate missing recipe data
- ✅ Properly structure your code using multiple `try-catch` blocks
- ✅ Always print a closing message using a `finally` block

---

## 📝 Features Demonstrated

| Feature                      | Description                                                  |
|-----------------------------|--------------------------------------------------------------|
| `try-catch` block           | To handle risky operations like user input and file access   |
| `finally` block             | To execute cleanup code no matter what                      |
| `throw` keyword             | Manually trigger an exception                               |
| `throws` keyword            | Declare that a method might throw a checked exception       |
| Custom Exception Class      | Defined `CoffeeNotAvailableException` for domain-specific error handling |
| Multiple catch blocks       | To handle different types of exceptions separately          |

---

## 🔨 How to Run

1. Open the Java project in your favorite IDE (e.g., IntelliJ, Eclipse)
2. Run `CoffeeShop.java`
3. Observe how each block behaves and how the output changes if you:
   - Use valid vs. invalid coffee names
   - Simulate a missing file
   - Pass null as a coffee type

---

## 🧠 Extension Ideas

Want to level up? Try this:

- ✅ Load the coffee menu from a real file
- ✅ Add user input using `Scanner`
- ✅ Extend the system to simulate multiple orders and use loops
- ✅ Create a similar system for booking movie tickets (see Bonus Exercise)

---

## 📦 Bonus Exercise: 🎬 Movie Ticket Booking System

Students can try building a console-based Movie Ticket Booking System using the same exception handling techniques:

- Unavailable movie? → Custom Exception!
- Missing schedule file? → Checked Exception!
- Null movie name? → Unchecked Exception!

---

## 🧃 Fun Fact

Java’s `Exception` hierarchy prevents chaos in the runtime world. Without it, our programs would crash faster than a PHP script on production 😄

---

## 🙌 Thanks & Happy Coding!
