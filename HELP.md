## Table of Contents
1. [Question](#question)
2. [Solution](#solution)
3. [Technologies](#technologies)
4. [Installation](#installation)

### Question
***
Question can be found [here](https://github.com/ejperera/animalfamily/blob/master/doc/Code%2Bassignment%2BBackend%2BChapter.doc.pdf)

### Solution
***

Following interfaces have been used to mark models which they have behaviors such as.

* Walkable   - Mark that model has walking behaviour
* Flyable    - Mark that model has flying behaviour
* Singable   - Mark that model has singing behaviour
* Swimmable  - Mark that model has swimming behaviour

If any of the model requires to have specialised dynamic behaviors which is enforced by above mentioned behavioural types , then model will be injected with its own kind of dynamic behavior which will override default behavior that is implemented in contract level (interface).

### Class Diagrams

Question A: Model birds and its specialized types

![Image text](https://github.com/ejperera/demo/blob/master/doc/bird2.jpeg)

Question B: Model fish and its specialized types

![Image text](https://github.com/ejperera/demo/blob/master/doc/fish.jpeg)

Question C: Model butterfly and its states types

![Image text](https://github.com/ejperera/demo/blob/master/doc/butterfly.jpeg)


## Technologies
***
* [Spring Boot](https://spring.io/projects/spring-boot): Version 2.5.2 
* [Maven](https://maven.apache.org/): Version 3.6.3
* [Java](https://www.java.com/): Version 8

## Installation
***
 
```
$ git clone https://github.com/ejperera/animalfamily.git
$ cd ../path/to/the/file
$ mvn clean install
