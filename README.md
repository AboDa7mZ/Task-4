# Task 4 - Java Project with Tests and Jenkins Pipeline

This is a complete Java project demonstrating:
1. Simple Java code with multiple functions
2. Comprehensive unit tests using JUnit 5
3. Maven build configuration
4. Jenkins CI/CD pipeline for automated testing

## Project Structure

```
task-4-project/
├── src/
│   ├── main/
│   │   └── java/
│   │       └── com/
│   │           └── example/
│   │               └── App.java
│   └── test/
│       └── java/
│           └── com/
│               └── example/
│                   └── AppTest.java
├── pom.xml
├── Jenkinsfile
└── README.md
```

## Java Code

The `App.java` class provides basic arithmetic operations:
- `greet()` - Returns a greeting message
- `add(int a, int b)` - Adds two numbers
- `subtract(int a, int b)` - Subtracts two numbers
- `multiply(int a, int b)` - Multiplies two numbers
- `divide(int a, int b)` - Divides two numbers (with zero check)

## Unit Tests

`AppTest.java` includes 6 comprehensive test cases:
- `testGreet()` - Tests the greeting function
- `testAdd()` - Tests addition with various inputs
- `testSubtract()` - Tests subtraction with various inputs
- `testMultiply()` - Tests multiplication with various inputs
- `testDivide()` - Tests division functionality
- `testDivideByZero()` - Tests exception handling

## Building Locally

### Prerequisites
- Java 21 or higher
- Maven 3.8.1 or higher

### Build Commands

```bash
# Compile the project
mvn clean compile

# Run tests
mvn test

# Build JAR
mvn clean package

# Run the application
java -cp target/task-4-project-1.0-SNAPSHOT.jar com.example.App
```

## Jenkins Pipeline

The `Jenkinsfile` defines a complete CI/CD pipeline with the following stages:

1. **Checkout** - Clones the repository from GitHub
2. **Build** - Compiles the code using Maven (skipping tests)
3. **Test** - Executes all unit tests
4. **Test Report** - Publishes test results in Jenkins

## Running in Jenkins

1. Create a new Pipeline job in Jenkins
2. Point it to this GitHub repository
3. Configure the pipeline to use the `Jenkinsfile`
4. Build the job to trigger the pipeline

## Test Results

All tests should pass:
- ✅ 6 test cases
- ✅ 0 failures
- ✅ 100% success rate

## Technology Stack

- **Language**: Java 21 (LTS)
- **Testing Framework**: JUnit 5 (Jupiter)
- **Build Tool**: Maven 3.8.1+
- **CI/CD**: Jenkins
- **Version Control**: Git/GitHub
