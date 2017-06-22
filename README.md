# Assignment 

This is a take-home programming assignment that was given at an interview for a back-end intern position. 
The program is loading transaction's data from an input text file, creating object model from it, 
calculating transaction's reduced shipment price with discount (based on information from providers) 
and outputting results to the screen.
 


## Info

The <code>input.txt</code> file with data about transactions is located in:

<code>src/resource/input.txt</code>

Providers are hardcoded in class <code>ProviderService</code>.

Transaction's reduced shipment price and discount are calculated by <code>RuleService</code>. Each rule has its own 
implementation (<code>FreeMontlyLPShipmentRule</code>, <code>LowestSPackagePriceRule</code>, 
<code>MonthlyDiscountLimitRule</code>) that can be changed. Also, you can easily add new rules by implementing 
<code>Rule</code> interface.

## Building and running

### Prerequisites

All you need is <code>Java 8</code> and <code>Maven</code> installed in your system.

### Installing

To build the program you need to run:

<code>mvn package -DskipTests</code>

### Running

To run the program execute:

<code>mvn exec:java</code>

To run the program without maven <code>[INFO]</code> messages (only results are shown) execute:

<code>mvn exec:java -q</code>


### Running the tests

To run the tests execute:

<code>mvn test</code>

## Built With

* [Java 8](http://www.oracle.com/technetwork/java/javase/downloads/jdk8-downloads-2133151.html) - Programming language used
* [Maven](https://maven.apache.org/) - Dependency Management
* [JUnit](http://junit.org/junit4/) - Testing
