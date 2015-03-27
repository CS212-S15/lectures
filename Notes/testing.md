Testing Overview
================

#Roles in Software#

First, a few words about jobs in the software industry and where the responsibility for testing lies.

### Developer/Software Development Engineer (SDE)
This is the role many of you will desire when you complete your degree. In the beginning, you'll probably spend much of your time writing (and testing!) code. Software developers, however, spend much of their time discussing requirements with others in their organizations, communicating progress and problems, and performing other responsibilities such as interviewing possible new team mates. In most cases, in a short amount of time you'll go from mostly programming to more meetings and other interactions where you will be expected to define system architecture, identify new features, and so on. 

These links provide an interesting perspective:

- [Day in the Life of a Googler](http://matt-welsh.blogspot.com/2010/12/day-in-life-of-googler.html)
- [Day in the Life of a Google Manager](http://matt-welsh.blogspot.com/2015/01/day-in-life-of-google-manager.html)

Developers are expected to test code! The level of responsibility, however, depends on a variety of factors, including the size of the company. The smaller the company, the larger the burden on the developer.

### Quality Assurance Engineer (QA)

A more traditional "test" job is QA engineer. The QA engineer may or may not write much code, but is responsible for testing the end product. This may include using tools to facilitate automation, and may also require some domain-specific knowledge (e.g., understanding whether the product is giving the correct results or not). Generally, the software development team delivers the product to the QA team, who then identifies bugs that must be fixed before delivery.

### Software Development Engineer in Test (SDET)

Many larger companies also have SDETs. The goal of this role is to write the code to test the product. SDETs do write code, however their goal is to automate the process of identifying bugs.

#Software Development Methodologies#

### Waterfall

This is the traditional method for software development that defines a lengthy and sequential design process. All of the requirements are defined up front and each stage of the process is completed before moving on to the next. If requirements change the process essentially needs to be restarted from the beginning. There is no flexibility. (see [Waterfall versus agile](https://www.atlassian.com/agile/program))

### Agile

Many (maybe most) companies these days use some flavor of agile development. In its purest form, agile is a methodology that conforms to the [agile manifesto](http://agilemanifesto.org/). In reality, this is often implemented by using a iterative approach. A single iteration (i.e., a *sprint*) is a fairly short time period during which the team works on some new feature or functionality. There is a daily meeting to discuss plans for the day and anything that is blocking progress.  At the end of the sprint, the goal is to have a fully functional version of the system, but perhaps without all of the necessary functionality.  


### Test-Driven Development

Not to be confused with agile, TDD in its purest form proposes that tests be written first, and the code developed to in order to meet the requirements of the tests. 

#Testing#

### Unit Testing

[Unit tests](http://en.wikipedia.org/wiki/Unit_testing) examine individual components, for example methods. Many of your Project 1 tests were unit tests, calling individual methods and checking that the expected output was produced. In this strategy, knowledge of the code and logic is exploited, which means that it falls under the category of [white-box testing](http://en.wikipedia.org/wiki/White-box_testing).

### Integration Testing

[Integration testing](http://en.wikipedia.org/wiki/Integration_testing) also falls under the category of white-box testing. Integration tests examines how modules integrate with each other. An integration test may test parameter passing between modules, or consider a specific workflow through the application. Many of the project tests are integration tests.

### System Testing

[System testing](http://en.wikipedia.org/wiki/System_testing) tests the entire, end-to-end system. System testing falls under the category of [black-box testing](http://en.wikipedia.org/wiki/Black-box_testing). Black-box testing advocates testing of the system without accessing the internal compoents. In other words, the system is treated like a black box and the tests explore whether the correct outputs are produced given appropriate inputs. No knowledge of the code or logic is exploited.

#Implementing Software Tests#

[JUnit](http://junit.org/) is the framework we have used for automated unit and integration testing this semester, but it is certainly not the only testing framework.



Writing good tests



