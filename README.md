# Spring Boot Patient Discharge Event Handling Application

## Description

This project is a Spring Boot application that demonstrates event-driven architecture for handling patient discharge processes. When a patient is discharged through the API, a `PatientDischargeEvent` is published. This event is then handled by a listener component (`CheckOutHandler`) which simulates finalizing the patient's bill.

## Technologies Used

* Java 17
* Spring Boot 3.3.1
* Spring Web
* Spring Events
* Maven
* Lombok

## Setup and Installation

### Prerequisites

* Java Development Kit (JDK) 17 or later
* Apache Maven

### Building and Running the Application

1.  **Clone the repository:**
    ```bash
    git clone <repository-url>
    cd event
    ```
2.  **Build the project using Maven:**
    ```bash
    ./mvnw clean install
    ```
3.  **Run the application:**
    ```bash
    java -jar target/event-0.0.1-SNAPSHOT.jar
    ```
    The application will start on the default port `8080`.

## API Endpoints

### Discharge Patient

*   **HTTP Method:** `POST`
*   **URL Path:** `/discharge/process`
*   **Request Body Format:** JSON
    ```json
    {
        "patientId": "123",
        "patientName": "John Doe"
    }
    ```
*   **Example Request (using curl):**
    ```bash
    curl -X POST \
      http://localhost:8080/discharge/process \
      -H 'Content-Type: application/json' \
      -d '{
            "patientId": "123",
            "patientName": "John Doe"
          }'
    ```
*   **Example Response:**
    ```
    Patient John Doe with ID 123 discharged successfully!
    ```

## Event Handling

The application utilizes Spring's ApplicationEventPublisher/EventListener mechanism for handling events.

1.  **Event Publishing:**
    *   The `DischargeService` is responsible for publishing a `PatientDischargeEvent` when a patient discharge request is processed.
    *   It uses `ApplicationEventPublisher.publishEvent()` to send the event.

2.  **Event Listening:**
    *   The `CheckOutHandler` component listens for `PatientDischargeEvent`s using the `@EventListener` annotation on its `processBill` method.
    *   When a `PatientDischargeEvent` is published, the `processBill` method is automatically invoked.
    *   In this example, the handler simulates finalizing the bill by printing a message to the console, including the patient's ID and the name of the thread processing the event.

    ```java
    // Inside CheckOutHandler.java
    @EventListener
    public void processBill(PatientDischargeEvent patientDischargeEvent) {
        System.out.println("CheckOutHandler : Finalizing bill for patient "
                + patientDischargeEvent.getPatientId() + " : " + Thread.currentThread().getName());
    }
    ```

This event-driven approach decouples the discharge process from subsequent actions like billing, making the system more modular and extensible.
