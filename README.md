# Design-patterns-in-java

* Factory Design Pattern(creational design pattern)

The factory method is a creational design pattern, i.e., related to object creation. In the Factory pattern, we create objects without exposing the creation logic to the client and the client uses the same common interface to create a new type of object. 

* Singleton Design Pattern(creational design pattern)

Singleton pattern is a design pattern which restricts a class to instantiate its multiple objects. It is nothing but a way of defining a class. Class is defined in such a way that only one instance of the class is created in the complete execution of a program or project. It is used where only a single instance of a class is required to control the action throughout the execution. A singleton class shouldn’t have multiple instances in any case and at any cost. Singleton classes are used for logging, driver objects, caching and thread pool, database connections.

![SINGLEton](https://user-images.githubusercontent.com/59594162/187072921-4ad8871f-93b2-4e11-8ad6-daa5fc455c44.png)

* ProtoType Design Pattern(creational design pattern)

The prototype pattern is a creational design pattern. Prototype patterns are required, when object creation is time consuming, and costly operation, so we create objects with the existing object itself. One of the best available ways to create an object from existing objects is the clone() method. Clone is the simplest approach to implement a prototype pattern.

* Facade Design Pattern(creational design pattern)

A Facade Pattern says that just "just provide a unified and simplified interface to a set of interfaces in a subsystem, therefore it hides the complexities of the subsystem from the client".

In other words, Facade Pattern describes a higher-level interface that makes the sub-system easier to use.

Practically, every Abstract Factory is a type of Facade.

![facadeA](https://user-images.githubusercontent.com/59594162/192088906-f502a7bf-b1f4-45f4-b3b2-9159816fb057.png)


* Observer Design pattern(Behavioral Design Pattern)

The Observer Pattern defines a one to many dependency between objects so that one object changes state, all of its dependents are notified and updated automatically.

![ObserverPattern](https://user-images.githubusercontent.com/59594162/187072751-b8bfd915-3000-41df-aad5-985d818e8581.png)

* Template Design pattern(Behavioral Design Pattern)

Template Method is a behavioral design pattern that defines the skeleton of an algorithm in the superclass but lets subclasses override specific steps of the algorithm without changing its structure.

![claasDia](https://user-images.githubusercontent.com/59594162/193405971-99deb59d-635b-4a5f-be84-01a755d364cd.jpeg)

* Decorator Design Pattern(Stuctural Design Pattern)

Decorator design pattern allows us to dynamically add functionality and behavior to an object without affecting the behavior of other existing objects within the same class. We use inheritance to extend the behavior of the class. This takes place at compile-time, and all the instances of that class get the extended behavior.

1. Decorator patterns allow a user to add new functionality to an existing object without altering its structure. So, there is no change to the original class.

2. The decorator design pattern is a structural pattern, which provides a wrapper to the existing class.

![Decoratordesignpattern4x](https://user-images.githubusercontent.com/59594162/188267190-3b38a40a-bbd1-4e90-b683-adbbfb5a5a61.png)


 * Adapter Design Pattern(Stuctural Design Pattern)

An Adapter pattern acts as a connector between two incompatible interfaces that otherwise cannot be connected directly. An Adapter wraps an existing class with a new interface so that it becomes compatible with the client’s interface.

![classDiagram](https://user-images.githubusercontent.com/59594162/190853933-7104c9e5-2651-45c8-96c9-9b4685502e4a.jpeg)

 * Proxy Design Pattern(Stuctural Design Pattern)
 
 Proxy is a structural design pattern that provides an object that acts as a substitute for a real service object used by a client. A proxy receives client  requests, does some work (access control, caching, etc.) and then passes the request to a service object.
 
 ![proxy-pattern](https://user-images.githubusercontent.com/59594162/194700779-731ad7d2-0047-4b04-b08c-dd2729eb956d.png)
 

 * Bridge Design Pattern(Stuctural Design Pattern)
 
  The Bridge design pattern allows you to separate the abstraction from the implementation. It is a structural design pattern. 
  
  Without Bridge Design Pattern 
  
  ![im2](https://user-images.githubusercontent.com/59594162/196026101-ccbe85c0-b915-430c-9384-42a699bfa3fa.png)
  
  
  With Bridge Design Pattern 
  
  ![BridgeDesign3](https://user-images.githubusercontent.com/59594162/196026114-39115504-8706-4cd9-8581-87299cb21ac9.png)






