# ElevateLabRepo
# Java Console-Based Calculator App

This is a simple Java console application that performs basic arithmetic operations (Addition, Subtraction, Multiplication, Division, Modulo) on two numbers entered by the user. The program is written using standard Java utilities and handles exceptions like divide-by-zero gracefully.

## 📁 Package
`orgElevate.techhub`

## 📌 Features

- Accepts two integer inputs from the user.
- Displays a menu with the following operations:
  - Addition
  - Subtraction
  - Multiplication
  - Division (with divide-by-zero check)
  - Modulo (with modulo-by-zero check)
  - Exit
- Handles invalid input and unexpected errors using exception handling.

## 🧠 Concepts Used

- Scanner class for user input
- Control statements (`do-while`, `switch-case`)
- Exception handling (`try-catch`)
- Input validation


## 📄 Code Overview

- The program takes two numbers at the start and performs repeated operations based on user input until they choose to exit (`choice 0`).
- All logic is placed inside a `try-catch` block to handle unexpected input or runtime exceptions.

## 🚫 Exception Handling

- Division and Modulo operations are protected against divide-by-zero.
- General exceptions are caught and printed with a user-friendly message.

## 💡 To Run the Program

1. Open the project in any Java IDE (like Eclipse or IntelliJ).
2. Compile the program:

## 🛠 Requirements

- Java JDK 8 or later
- Any IDE or terminal that supports Java

## 🧑‍💻 Author

Pooja Waykar  
Project: Calculator Console App  
Language: Java

---

Feel free to customize or expand the calculator as needed!


