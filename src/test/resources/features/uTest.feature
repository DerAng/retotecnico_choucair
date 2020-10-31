# Author: DERLY ZULEY ANGEL MEDINA

@stories
Feature: uTest platform

  As a user unregistered, I want to register on the uTest platform

  @scenario1

  Scenario Outline: Registry on the uTest platform

    Given than Rose want to subscribe to the uTest platform

    When she fills out the registration form

    | firstName    |  lastName    |  email     |   dateOfBirth   |  city    | postalCode  | country   | computer   | version   | languague    | mobile   | model    | operatingSystem     |  password   | confirmPassword   |
    | <firstName>  |  <lastName>  |  <email>   |   <dateOfBirth> |  <city>  | <postalCode>| <country> | <computer> | <version> |  <languague> | <mobile> | <model>  |  <operatingSystem>  |  <password> | <confirmPassword> |


    Then she finds the message called The last step


    Examples:

    | firstName  |  lastName |  email                   |   dateOfBirth    |   city      | postalCode |  country  | computer | version | languague | mobile  | model    | operatingSystem  |  password                |  confirmPassword           |
    | Ana        | Medina    |  testChoucair3@gmail.com |   August-12-1994 |   Bogota    |   110111   |  Colombia | Linux    | Debian  |  Spanish  | Alcatel | MDO1     |  Android 2.0     |  Anamedinavillarreal9410 |   Anamedinavillarreal9410  |



