# CI Jenkins Multi-Build Demo

A small Java project for the Jenkins CI practical.

It supports:
- Maven: `mvn -B clean verify`
- Ant: `ant build`
- Gradle: `gradle clean build`

The same Java application and test are used by all three build tools.

## Expected test output

TEST PASSED: App.add(2, 3) returned 5.
