Maven Project for beginners

[![Build Status](https://travis-ci.com/IliadisVictor/LearningMaven.svg?token=qTw9aSMTzz4uyBZD81jx&branch=main)](https://travis-ci.com/github/IliadisVictor/LearningMaven)
---

A fully working maven project created for learning purposes in software engineering  class of 2021.

The project is created with the latest version of Maven 3.8.1 and jdk 1.8.0_271.

The project uses the  latest JFreeChart charting Java library from the central Maven Repository.

Project Structure
---
The repository consists of a parent Maven project and one child module called gradeshistogram.
1) [Histogram Generator](gradeshistogram) - given a text with student's grades creates a histogram. 

Maven Commands
---
Basic Maven commands to handle the project.
* `mvn compile`: It will compile your code , and show errors if they exist.   
* `mvn package`: It will generate a jar file in each's module target directory.
* `mvn test`: It will compile the code of your application and your tests. It will then run your tests (if you wrote any) if something fail.s
* `mvn validate`: It will check if all necessary info are available
* `mvn verify`: It will check results of integration tests to ensure quality criteria are met.
* `mvn verify`: It will install package into the local repository for local use.
* `mvn deploy`: It will copy package to the remote repository for community use (optional).
 
 
Tips
---
* Suggested IDE [Intellij](https://www.jetbrains.com/idea/).
* Maven download website [source](https://maven.apache.org/download.cgi).
* Maven guide website [source](https://maven.apache.org/guides/getting-started/index.html).
* Java download website [source](https://www.oracle.com/java/technologies/javase-downloads.html).