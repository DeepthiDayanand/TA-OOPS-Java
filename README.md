# Coursework for Object Oriented Analysis and Design with Java

This repository contains the courework I made as a Teaching Assistant for the 6th-semester course _Object-Oriented Analysis and Design with Java_ (UE21CS352B) in PES University.

## Course Structure:

<!-- TOC start -->

   * [Use-case Modeling](#lab-1-use-case-modeling)
   * [Class Diagrams](#lab-2-class-diagrams)
   * [Activity and State Diagrams](#lab-3-activity-and-state-diagrams)
   * [Method Overloading, Constructor Overloading, Composition, and Aggregation](#lab-5-method-overloading-constructor-overloading-composition-and-aggregation)
   * [Inheritance and Interfaces](#lab-6-inheritance-and-interfaces)
   * [Abstract Classes, ArrayLists, Linked Lists, and Stacks](#lab-7-abstract-classes-arraylists-linked-lists-and-stacks)
   * [Multithreading and Serialization](#lab-8-multithreading-and-serialization)
   * [MVC Architecture](#lab-9-mvc-architecture)

<!-- TOC end -->

<!-- TOC --><a name="oops-java-ta"></a>

<!-- TOC --><a name="lab-1-use-case-modeling"></a>
## Use case Modeling

Use case modeling in Java is a technique used to capture and define the functional requirements of a system from the perspective of its users (actors). It describes the interactions between external entities (such as users or other systems) and the system to achieve a specific goal.
Use case diagrams, which often accompany this modeling, visually represent these interactions using actors, use cases (actions performed by the system), and the relationships between them. This process helps guide the system design and development phases in Java applications by ensuring a clear understanding of user needs and system behaviors.

> **Problem statement and solution for use case modeling can be found [here](/https://github.com/DeepthiDayanand/OOADJ_TA_Coursework/blob/master/MVC%20Assignment.docx)**

<!-- TOC --><a name="lab-2-class-diagrams"></a>
## Class Diagrams

Class diagrams in Java are a type of UML (Unified Modeling Language) diagram that visually represent the structure of a Java application by illustrating the classes, their attributes, methods, and the relationships between them. They help in the design and organization of object-oriented systems by providing a blueprint of how the system's classes are structured and how they interact.

**Problem statement and solution for class diagram can be found [here](https://github.com/DeepthiDayanand/OOADJ_TA_Coursework/tree/master/Lab%202)**


<!-- TOC --><a name="lab-3-activity-and-state-diagrams"></a>
## Activity and State Diagrams

<!-- TOC --><a name="activity-diagram"></a>
### Activity Diagram

Activity diagrams in Java are a type of UML (Unified Modeling Language) diagram that visually represent the flow of control or data within a system, specifically focusing on the sequence of activities or steps in a process. They are particularly useful for modeling the dynamic aspects of a Java application, such as workflows, algorithms, or business processes. Activity diagrams are useful for both high-level system design and detailed algorithmic behavior in Java applications, allowing developers to better understand and communicate the flow of activities.

<!-- TOC --><a name="state-diagram-problem-statement"></a>
### State Diagrams 

State diagrams in Java are a type of UML (Unified Modeling Language) diagram used to represent the states and transitions of an object within a Java application. They visually depict how an object behaves in response to events and how it transitions from one state to another. State diagrams are particularly useful for modeling the lifecycle of objects or components that have distinct states, such as a connection, process, or user session.

**Problem statements and solutions for activity and state diagrams can be found [here](/Lab 3)**

<!-- TOC --><a name="lab-5-method-overloading-constructor-overloading-composition-and-aggregation"></a>
## Method Overloading, Constructor Overloading, Composition, and Aggregation

<!-- TOC --><a name="method-overloading-problem-statement"></a>
### Method Overloading 

Method overloading in Java allows multiple methods with the same name but different parameter lists (number, type, or order of parameters) to coexist within the same class. It provides flexibility by enabling different ways to call the same method depending on the argument types.

**The problem statement for method overloading in java can be found [here](https://www.hackerrank.com/contests/ooadj-lab-5-section-b/challenges/method-overloading-in-java)**

<!-- TOC --><a name="constructor-overloading-problem-statement"></a>
### Constructor Overloading 

Constructor overloading allows a class to have more than one constructor, each with different parameters. This lets you create objects with different initializations based on the parameters provided when calling the constructor.

**The problem statement for constructor overloading in java can be found [here](https://www.hackerrank.com/contests/ooadj-lab-5-section-b/challenges/constructor-overloading-in-java)**

<!-- TOC --><a name="composition-and-aggregation-problem-statement"></a>
### Aggregation and Composition

- Composition: Composition is a design principle where one class contains objects of another class, indicating a "has-a" relationship. In Java, the lifetime of the composed object is bound to the lifetime of the containing object, meaning the contained object cannot exist independently.
- Aggregation: Aggregation is a "has-a" relationship where one class contains a reference to objects of another class, but the contained objects can exist independently. In Java, aggregation represents a weaker relationship compared to composition, as the contained objects can outlive the containing object.

**The problem statement for aggregation and composition in java can be found [here](https://www.hackerrank.com/contests/ooadj-lab-5-section-b/challenges/composition-aggregation)**

<!-- TOC --><a name="lab-6-inheritance-and-interfaces"></a>
## Inheritance and Interfaces

<!-- TOC --><a name="inheritance-problem-statement"></a>
### Inheritance 

Inheritance in Java allows a class to inherit properties and methods from another class, promoting code reusability and establishing an "is-a" relationship. The subclass (child) extends the superclass (parent), gaining access to its fields and methods, while also being able to override or add new functionality.

**The problem statement for inheritance in java can be found [here](https://www.hackerrank.com/contests/ooadj-lab-6-set-1/challenges/inheritance-in-java-ooad-lab)**

<!-- TOC --><a name="interfaces-problem-statement"></a>
### Interfaces 

 An interface in Java defines a contract that a class can implement, specifying a set of abstract methods that must be provided by the implementing class. Interfaces enable multiple inheritance of behavior, allowing classes to implement multiple interfaces and adhere to different behaviors.

 **The problem statement for interfaces in java can be found [here](https://www.hackerrank.com/contests/ooadj-lab-6-set-1/challenges/interfaces-in-java)**

<!-- TOC --><a name="lab-7-abstract-classes-arraylists-linked-lists-and-stacks"></a>
## Abstract Classes, ArrayLists, Linked Lists, and Stacks

<!-- TOC --><a name="abstract-classes-problem-statement"></a>
### 1. Abstract Classes 

An abstract class in Java is a class that cannot be instantiated on its own and is meant to be subclassed. It can contain both abstract methods (without implementations) and concrete methods (with implementations), providing a common base for subclasses.

**The problem statement for abstract classes in java can be found [here](https://www.hackerrank.com/contests/ooadj-lab-week-7/challenges/abstract-class-ooadj)**

<!-- TOC --><a name="arraylists-problem-statement"></a>
### 2. ArrayLists 

ArrayList in Java is a resizable array implementation of the List interface that allows dynamic insertion, deletion, and access of elements. It stores elements in a contiguous block of memory and provides fast random access, but resizing can be costly.

**The problem statement for array lists in java can be found [here](https://www.hackerrank.com/contests/ooadj-lab-week-7/challenges/arraylist-ooadj)**

<!-- TOC --><a name="linked-lists-problem-statement"></a>
### 3. Linked Lists 

LinkedList in Java is a linear data structure that stores elements in nodes, where each node contains a reference to the next (and optionally previous) node. It allows efficient insertions and deletions at any position but slower random access compared to ArrayList.

**The problem statement for linked lists in java can be found [here](https://www.hackerrank.com/contests/ooadj-lab-week-7/challenges/linked-list-ooadj)**

<!-- TOC --><a name="stacks-problem-statement"></a>
### 4. Stacks 

A Stack in Java is a data structure that follows the Last-In-First-Out (LIFO) principle, where elements are added and removed from the top of the stack. Common operations include push (add), pop (remove), and peek (view the top element).

**The problem statement for stacks in java can be found [here](https://www.hackerrank.com/contests/ooadj-lab-week-7/challenges/stack-ooadj)**

<!-- TOC --><a name="lab-8-multithreading-and-serialization"></a>
## Lab 8: Multithreading and Serialization

<!-- TOC --><a name="multithreading-problem-statement"></a>
### 1. Multithreading
Multithreading in Java allows multiple threads to execute concurrently within a program, enabling parallelism and more efficient CPU utilization. It is commonly used to perform tasks like background processing, improving application responsiveness, and handling multiple tasks simultaneously.

<!-- TOC --><a name="serialization-problem-statement"></a>
### 2. Serialization 
Serialization in Java is the process of converting an object into a byte stream, so it can be easily saved to a file or transmitted over a network. The reverse process, deserialization, reconstructs the object from the byte stream, allowing persistence and communication of object states across platforms.

**The problem statement for multithreading and serialization in java can be found [here](https://github.com/DeepthiDayanand/OOADJ_TA_Coursework/tree/master/Lab%208)**

## MVC Architecture

MVC (Model-View-Controller) architecture is a design pattern commonly used in software development to separate concerns and organize code into three interconnected components:

1. **Model**: Represents the application's data and business logic. It manages the data, handles database interactions, and performs operations independent of the user interface. Changes in the Model often notify the View to update itself.

2. **View**: Responsible for the presentation layer. It displays data from the Model to the user and sends user inputs to the Controller. The View is concerned with how the data is represented but doesn't handle any business logic.

3. **Controller**: Acts as an intermediary between the Model and the View. It processes user inputs from the View, updates the Model accordingly, and may trigger changes in the View. The Controller directs the flow of the application based on user interactions.

In Java, the MVC pattern is widely used in frameworks like Spring MVC and JavaFX to build web and desktop applications. The key advantage of MVC is that it promotes a clear separation of concerns, which enhances maintainability, scalability, and testability of the code.

**The problem statement for the MVC mini project can be found [here](https://github.com/DeepthiDayanand/OOADJ_TA_Coursework/blob/master/MVC%20Assignment.docx)**
