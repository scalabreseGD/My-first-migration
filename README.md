# COBOL to Java JSON Generation Migration

This project is a Java-based migration of a COBOL program that generates a JSON object. The original COBOL source code can be found [here](https://github.com/shamrice/COBOL-Examples/tree/main/json_generate).

## Description

The purpose of this project is to demonstrate how a simple COBOL program can be migrated to a modern Java application. The Java code uses the Jackson library to generate a JSON object from a simple `Record` object.

## Code Description

The project consists of two main Java classes:

*   `Record.java`: This class is a simple POJO (Plain Old Java Object) that defines the data structure for the JSON output. It contains three fields: `name` (String), `value` (String), and `enabled` (boolean). The `@JsonProperty` annotations are used by the Jackson library to map the Java fields to the JSON keys.

*   `JsonGenerateExample.java`: This is the main class of the application. It creates an instance of the `Record` class, populates it with sample data, and then uses the Jackson `ObjectMapper` to serialize the `Record` object into a pretty-printed JSON string. The resulting JSON is then printed to the console.

## Requirements

*   Java 11 or higher
*   Apache Maven 3.6.3 or higher

## How to Build and Run

1.  **Clone the repository:**
    ```bash
    git clone https://github.com/scalabreseGD/my-first-migration.git
    ```
2.  **Navigate to the project directory:**
    ```bash
    cd my-first-migration
    ```
3.  **Build the project using Maven:**
    ```bash
    mvn clean install
    ```
4.  **Run the application:**
    ```bash
    java -cp target/my-first-migration-1.0-SNAPSHOT.jar com.migration.JsonGenerateExample
    ```

## Example Output

```
JSON document successfully generated.
Generated JSON for record: Record{name='Test Name', value='Test Value', enabled=true}
----------------------------
{
  "name" : "Test Name",
  "value" : "Test Value",
  "enabled" : true
}
----------------------------
JSON output character count: 83
Done.
```
