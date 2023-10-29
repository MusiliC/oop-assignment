# oop-assignment

### SOLID Principles
#### The Single Responsibility Principle
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
     - Add implementation
### Inheritance
    - Implemented inheritance between interfaces where:
    - BallGamesServiceI and MartialArtI class has inherited from RefereeServiceI
### Abstraction

