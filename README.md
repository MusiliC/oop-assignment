# OOP-Assignment

### SOLID Principles
#### The Single Responsibility Principle
    - Through encapsulation, and in models package achieved single responsibility principle
    - Each implementation is defined under each specific model.
#### The Liskov Substitution Principle
    - Subsituting base class with sub class and still running without an error
    - RefereeServiceI class is th base class for BallGamesServiceI and MartialArtI classes
#### The Interface Segregation Principle
    - Implemented it through having different interfaces to have unique methods for each kind of sport
    - There is the main interface (SportsServiceI) and then distributed to: BallGameServiceI, MartialArtI, RefereeServiceI and TrackGameServiceI


### Interface
    - From the service package, I have defined interfaces
    - I implemented the interfaces in service.impl package
### Polymorphism
#### Compile Time(Normal/Static) polymorphism
     - I have created different instances of classes 
     - From the app class, instances are taking different forms of base classes implementing polymorphism
#### Run time(Dynamic) polymorphism
     - Methods declared SportServiceI interface have been overriden in subclasses
     - Thus implementing run time polymorphism
### Inheritance
    - Implemented inheritance between interfaces: refereeServiceI extends sportServiceI
    - Implementation of all the interfaces are extending abstract class
### Abstraction
    - Created GoverningBody abstract class with two mwthods
    - An abstract method (WhichBody()) and a normal method 
    - The class is implemented in each specific sport because each sport has a different governing body.
### Encapsulation
    - In my model package, created classes for BallGameModel and TrackGameModel with private properties
    - I have setter methods implemented in TracServiceImpl class
    - Getter methods implemented in both TrackServiceImpl and BallGameServiceImpl

