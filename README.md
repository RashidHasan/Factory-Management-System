# Factory Management System
## Overview

This Java project is an implementation of a Factory Management System for Space Dimensions Company. The system is designed to manage various aspects of the factory, including its details, products, employees, and customers. It employs an object-oriented approach to model and implement the system efficiently.
Features
Factory

    Factory Information: The factory has a name, address, invoice value, and a list of products.
    Products: Each product is defined by an ID, name, and price.
    Payment: The factory can make payments, which will deduct the invoice value.

Employees

    Employee Information: All employees share common attributes such as name, ID, email, salary, and phone.
    Manager: Managers have additional attributes, including their department, office number, and the project they are responsible for.
    Worker: Workers have a position, shift, and a flag indicating whether they are team leaders.
    Accountant: Accountants have a level and a list of responsibilities.
    Salary Calculation: The system calculates salaries based on the employee's profession as follows:
        Manager: Base salary + 25% of the base salary
        Worker: Base salary + 5% of the base salary
        Accountant: Base salary + 10% of the base salary

Customers

    Customer Information: Customers have an ID, name, address, and a list of purchase orders.
    Purchase Orders: Each purchase order is linked to a customer and includes an ID, invoice value, and a list of products. Customers can add products to their purchase orders, which increases the invoice value.
    Payment: Customers can make payments to pay off their invoice values.

Object-Oriented Design

The project employs a robust object-oriented design to ensure a clean and maintainable codebase. It features well-structured classes and relationships that reflect the real-world relationships between factory components, employees, and customers.
UML Class Diagram

UML Class Diagram

The UML class diagram illustrates the relationships between the key classes in the system. It showcases how classes like Factory, Employee, Manager, Worker, Accountant, Customer, and PurchaseOrder are organized and connected.
Design Patterns

This project demonstrates an awareness of various design patterns to enhance code modularity and reusability. These design patterns help in achieving a flexible and extensible codebase.
Conclusion

The Factory Management System implemented in Java for Space Dimensions Company is a comprehensive solution for managing factory operations, employees, and customers. It leverages object-oriented principles, a well-defined UML class diagram, and design patterns to create a robust and maintainable system. This project showcases the developer's excellent understanding of object-oriented programming and design principles, making it a commendable and inspiring achievement.
