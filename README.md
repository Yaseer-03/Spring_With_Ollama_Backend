# Spring Boot with Ollama 3.2 Integration

This project demonstrates the integration of **Ollama 3.2** with a **Spring Boot** application, leveraging **reactive programming** to handle asynchronous responses. The application uses **Spring WebFlux** to stream responses from Ollama in real-time, providing a **non-blocking and efficient** way to interact with the AI model.

## Features

- **Ollama 3.2 Integration**: Seamlessly integrate Ollama 3.2 for AI-driven tasks like natural language processing and text generation.
- **Reactive Programming**: Use **Spring WebFlux** and **Project Reactor** to handle asynchronous, non-blocking responses.
- **Streaming Responses**: Stream responses from Ollama in real-time for a smooth user experience.
- **REST API**: Expose endpoints to interact with Ollama via HTTP requests.
- **Scalable and Efficient**: Designed to handle high concurrency with minimal resource usage.

## Prerequisites

Before running the project, ensure you have the following installed:

- **Java 17 or higher**
- **Maven** (for dependency management)
- **Ollama 3.2** (set up locally or remotely)
- **Postman** or any API testing tool (optional, for testing endpoints)

## Setup Instructions

### Clone the Repository:
```bash
git clone https://github.com/Yaseer-03/Spring_With_Ollama_Backend.git
cd Spring_With_Ollama_Backend
```

### Install Dependencies:
Run the following command to install all required dependencies:
```bash
mvn clean install
```

### Configure Ollama:
Ensure Ollama 3.2 is running locally or remotely.

Update the Ollama API endpoint in the `application.properties` file:
```properties
ollama.api.url=http://localhost:11434/api/generate
```

### Run the Application:
Start the Spring Boot application using:
```bash
mvn spring-boot:run
```

### Access the API:
The application will start on `http://localhost:8080`. You can use the following endpoints:

#### **POST /api/chat**
Send a prompt to Ollama and get a response.

**Request Body:**
```json
{
  "prompt": "Explain quantum computing in simple terms"
}
```

`Stream responses from Ollama in real-time.`


Feel free to contribute or extend the functionality of this project! 🚀

