# Sports Matching API

Academic Spring Boot backend prototype for organizing sports matches, users, sports, match states, matching strategies, and notifications.

This repository was built for a Software Development Process course. It is intended to show backend structure, domain modeling, REST controllers, persistence with JPA, and selected design patterns. It is not a production-ready application.

## Project Overview

The API models a simple sports match coordination system where users can register, sports can be created, and matches can be created with an initial state. The codebase follows a typical Spring Boot structure with controllers, services, repositories, DTOs, JPA entities, and prototype implementations for state, strategy, observer, and adapter patterns.

## Academic Context

The goal of the project is to demonstrate backend design decisions and object-oriented design patterns in a realistic domain. Some flows are intentionally incomplete because they were scoped as future work for the course project.

## Main Features

- User registration endpoint with password omitted from API responses.
- Sport creation endpoint with required player count.
- Match creation endpoint with initial state set to `Necesitamos jugadores`.
- JPA entities for users, sports, matches, locations, and notifiers.
- Repository layer using Spring Data JPA.
- Prototype matching strategies for skill level, proximity, and match history.
- Prototype match state classes for arranged, confirmed, in-progress, finished, and cancelled states.
- Prototype notification classes for email and push notifications.

## Tech Stack

- Java 17
- Spring Boot 3.5.3
- Spring Web
- Spring Data JPA
- PostgreSQL
- Maven Wrapper
- JUnit 5
- H2 in-memory database for tests

## Architecture

The project is organized under `tp/src/main/java/com/g4/tp`:

- `controller`: REST endpoints for users, sports, and matches.
- `service`: business service layer.
- `repository`: Spring Data JPA repositories.
- `model/entities`: JPA entities and notification domain classes.
- `model/state`: prototype State pattern classes for match lifecycle rules.
- `model/strategy`: prototype Strategy pattern classes for player matching.
- `model/observer`: Observer pattern interfaces.
- `model/adapter`: Adapter pattern classes for simulated email notifications.
- `DTOs`: request and response DTOs used by controllers.

## Design Patterns Used

- State: match lifecycle states such as need players, arranged, confirmed, in progress, finished, and cancelled.
- Strategy: interchangeable matching strategies by skill level, proximity, or history.
- Observer: interfaces prepared for notification updates when match events occur.
- Adapter: notification adapter classes that simulate adapting an external email library.

## API Endpoints

Base URL for local development: `http://localhost:8080`

| Method | Endpoint | Description |
| --- | --- | --- |
| `GET` | `/user/hello` | Health/demo endpoint for the user controller. |
| `POST` | `/user/create` | Creates a user. The request accepts a password, but the response does not include it. |
| `GET` | `/sport/hello` | Health/demo endpoint for the sport controller. |
| `POST` | `/sport/create` | Creates a sport. |
| `GET` | `/match/hello` | Health/demo endpoint for the match controller. |
| `POST` | `/match/create` | Creates a match with the initial state `Necesitamos jugadores`. |

### Example Requests

Create a user:

```json
{
  "name": "John Doe",
  "email": "john.doe@example.com",
  "password": "change-me"
}
```

Create a sport:

```json
{
  "name": "Football",
  "description": "Five-a-side football match",
  "requiredPlayers": 10
}
```

Create a match:

```json
{
  "sport": "Football",
  "duration": 90,
  "date": "2026-06-20T18:00:00",
  "time": "2026-06-20T18:00:00"
}
```

## Local Setup

From the repository root:

```bash
cd tp
./mvnw test
./mvnw spring-boot:run
```

On Windows PowerShell:

```powershell
cd tp
.\mvnw.cmd test
.\mvnw.cmd spring-boot:run
```

The application expects a PostgreSQL database for local runtime. Tests use H2 in memory and do not require PostgreSQL.

## Database Configuration

Runtime database values are read from environment variables in `tp/src/main/resources/application.properties`:

| Environment variable | Default |
| --- | --- |
| `DB_URL` | `jdbc:postgresql://localhost:5432/tp` |
| `DB_USERNAME` | `postgres` |
| `DB_PASSWORD` | empty |
| `JPA_DDL_AUTO` | `update` |
| `JPA_SHOW_SQL` | `false` |

PowerShell example:

```powershell
$env:DB_URL="jdbc:postgresql://localhost:5432/tp"
$env:DB_USERNAME="postgres"
$env:DB_PASSWORD="your_database_password"
.\mvnw.cmd spring-boot:run
```

An example configuration file is available at `tp/src/main/resources/application-example.properties`.

## Notes on Security

This is an academic backend prototype. Passwords are no longer printed to the console or returned by the user creation endpoint, but password hashing and authentication are not implemented yet.
