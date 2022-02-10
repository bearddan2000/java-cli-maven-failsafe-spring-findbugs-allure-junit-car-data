# java-cli-maven-failsafe-spring-findbugs-allure-junit-car-data

## Description
Analyze source code for potential bugs.
A POC for maven app using junit5,
findbugs, and spring framework with
allure, failsafe and surefire plugins.

Serves allure report from link given
after the build.

## Tech stack
- java
- maven
	- findbugs
  - junit5
	- failsafe
  - surefire
  - springframework
	- allure

## Docker stack
- maven:3-openjdk-17

## To run
`sudo ./install.sh -u`
- findbugs report at bin/target/findbugs

## To stop
`sudo ./install.sh -d`

## For help
`sudo ./install.sh -h`

## Credit
- [Code concept](https://stackoverflow.com/questions/67847818/maven-junit-5-cucumber-not-running-tests)
