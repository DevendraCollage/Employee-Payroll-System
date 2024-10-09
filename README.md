### Java OOPs Project - Java Employee Payroll 💵 System | OOP Concepts & Implementation

## Overview

A Java-based employee management system for banks that allows adding employees, specifying their employment type (part-time or full-time), and calculating their pay.

## Features

- Add employees to the system
- Specify employee type (part-time or full-time)
- Calculate hourly pay for part-time employees
- Calculate yearly package for full-time employees
- Track the total number of employees

## Getting Started

### Prerequisites

- Java Development Kit (JDK) 8 or higher
- Any Java IDE (e.g., Eclipse, IntelliJ IDEA) or a text editor

### Installation

1. Clone the repository:
   ```
   git clone https://github.com/DevendraCollage/Employee-Payroll-System.git
   ```
2. Open the project in your preferred Java IDE or compile it using the command line.

## Usage

Run the `Main` class to start the application. You will be presented with a menu of options:

1. Add Employee
2. View All Employees
3. Calculate Pay
4. View Total Number of Employees
5. Exit

Follow the on-screen prompts to perform various employee management operations.

## Class Structure

- `Main`: The entry point of the application, handles user input and menu navigation.
- `Employee`: Base class for all employees with common attributes like name and ID.
- `FullTimeEmployee`: Extends `Employee`, includes attributes for yearly salary.
- `PartTimeEmployee`: Extends `Employee`, includes attributes for hourly rate and hours worked.
- `EmployeeManagementSystem`: Manages the collection of employees and provides methods for adding employees and calculating pay.

## Calculating Pay

- For part-time employees: Hourly pay is calculated by multiplying the hourly rate by the
