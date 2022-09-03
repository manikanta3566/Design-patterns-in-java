# Design-patterns-in-java

* Factory Design Pattern(creational design pattern)

The factory method is a creational design pattern, i.e., related to object creation. In the Factory pattern, we create objects without exposing the creation logic to the client and the client uses the same common interface to create a new type of object. 

* Singleton Design Pattern(creational design pattern)

Singleton pattern is a design pattern which restricts a class to instantiate its multiple objects. It is nothing but a way of defining a class. Class is defined in such a way that only one instance of the class is created in the complete execution of a program or project. It is used where only a single instance of a class is required to control the action throughout the execution. A singleton class shouldn’t have multiple instances in any case and at any cost. Singleton classes are used for logging, driver objects, caching and thread pool, database connections.

![SINGLEton](https://user-images.githubusercontent.com/59594162/187072921-4ad8871f-93b2-4e11-8ad6-daa5fc455c44.png)


* Observer Design pattern(Behavioral Design Pattern)

The Observer Pattern defines a one to many dependency between objects so that one object changes state, all of its dependents are notified and updated automatically.

![ObserverPattern](https://user-images.githubusercontent.com/59594162/187072751-b8bfd915-3000-41df-aad5-985d818e8581.png)


* Decorator Design Pattern(Stuctural Design Pattern)

Decorator design pattern allows us to dynamically add functionality and behavior to an object without affecting the behavior of other existing objects within the same class. We use inheritance to extend the behavior of the class. This takes place at compile-time, and all the instances of that class get the extended behavior.

1.Decorator patterns allow a user to add new functionality to an existing object without altering its structure. So, there is no change to the original class.
2.The decorator design pattern is a structural pattern, which provides a wrapper to the existing class.

![Decoratordesignpattern4x](https://user-images.githubusercontent.com/59594162/188267190-3b38a40a-bbd1-4e90-b683-adbbfb5a5a61.png)


