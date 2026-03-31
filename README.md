# CAT-1 Section B - Java OOP Exercise

Java programming assessment demonstrating object-oriented programming concepts including inheritance, polymorphism, and encapsulation.

## Description

This repository contains solutions to CAT-1 Section B programming exercises, implementing a vehicle management system with:

- **Vehicle hierarchy** (base class with inheritance)
- **Car class** extending Vehicle with additional properties
- **Showroom application** with user input validation
- **StudentRecord** class for academic record management

## 🏗️ Structure

```
CAT-1--Section-B/
├── Vehicle.java       # Base class for vehicles
├── Car.java           # Car subclass with fuel type
├── Showroom.java      # Main application with user input
└── StudentRecord.java # Student data management
```

## Running the Code

### Prerequisites
- Java Development Kit (JDK) 8 or higher

### Compile and Run

```bash
# Compile all Java files
javac *.java

# Run the Showroom application
java Showroom

# Run the StudentRecord application
java StudentRecord
```

## Features

### Vehicle Management System
- **Inheritance**: `Car` extends `Vehicle` base class
- **Polymorphism**: Overridden `displayDetails()` method
- **Encapsulation**: Private fields with proper constructors
- **Input Validation**: Error handling for invalid numeric input

### Student Record System
- Student data management
- Academic record tracking

## 💻 Example Usage

### Showroom Application

```
Enter brand: Toyota
Enter model: Corolla
Enter year: 2024
Enter fuel type: Hybrid

Car Details:
Brand: Toyota
Model: Corolla
Year: 2024
Fuel Type: Hybrid
```

## Concepts Demonstrated

1. **Object-Oriented Programming**
   - Class inheritance
   - Method overriding
   - Constructor chaining (`super()`)

2. **Exception Handling**
   - Try-catch blocks for `NumberFormatException`
   - Input validation loops

3. **User Input**
   - Scanner class usage
   - Multi-type input handling
   - Resource cleanup (`sc.close()`)

## Learning Objectives

- Understand inheritance and `extends` keyword
- Implement method overriding with `@Override`
- Handle user input validation
- Demonstrate polymorphic behavior
- Apply encapsulation principles

## 🔧 Code Quality

- Clean, readable code structure
- Proper naming conventions (camelCase)
- Input validation and error handling
- Resource management

## License

Educational project - MIT License

## Author

Fredrick Mbithi

---

**Academic Context:** CAT-1 (Continuous Assessment Test) Programming Exercise  
**Language:** Java  
**Focus:** Object-Oriented Programming Fundamentals
