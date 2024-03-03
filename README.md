  The Movie Management Application revolutionizes the way movie data is managed, providing a
centralized platform for efficient management of actors and movies. By automating tedious 
tasks and streamlining data operations, the application significantly enhances productivity 
and efficiency for users in the entertainment industry. 

  Designed and Built Scalable Architecture: Architected a scalable and modular system using 
Java and Spring Boot framework, ensuring high performance and flexibility to accommodate 
future enhancements.

  Implemented CRUD Operations: Developed RESTful APIs for CRUD operations on actors and movies,
allowing seamless interaction with the application's backend and enabling smooth data management.

  Established Database Integration: Integrated a relational database using JPA and Hibernate, 
facilitating data storage, retrieval, and manipulation with ease.

  Enhanced User Experience: Implemented user-friendly endpoints for adding, retrieving, and 
deleting actors and movies, enhancing user experience and satisfaction.

  Optimized Performance: Employed optimization techniques to enhance application performance, 
resulting in reduced latency and improved responsiveness.

  Resolved Complex Business Logic: Tackled intricate business logic challenges, such as handling
associations between actors and movies, ensuring data integrity and consistency.

  Reduced Deployment Complexity: Automated deployment processes using Docker, simplifying 
deployment and ensuring consistency across different environments.

  Technology Stack:
Java
Spring Boot
Hibernate
RESTful APIs
JPA
Docker
Alpine Linux
OpenJDK 17
Git


  Description of each REST API endpoint for all entity:

1. Actor Entity:
   
GET /api/actors/{id}
Description: Retrieves details of an actor by their unique identifier (id).
Usage: Clients can use this endpoint to fetch information about a specific actor.

GET /api/actors
Description: Retrieves a list of all actors.
Usage: Clients can use this endpoint to retrieve a comprehensive list of all actors available in the database.

POST /api/actors
Description: Creates a new actor record.
Usage: Clients can use this endpoint to add a new actor to the database by providing actor details in the request body.

DELETE /api/actors/{id}
Description: Deletes an existing actor by their unique identifier (id).
Usage: Clients can use this endpoint to remove an actor from the database based on their identifier.


2. Movie Entity:
   
GET /api/movies/{id}
Description: Retrieves details of a movie by its unique identifier (id).
Usage: Clients can use this endpoint to fetch information about a specific movie.

GET /api/movies
Description: Retrieves a list of all movies.
Usage: Clients can use this endpoint to retrieve a comprehensive list of all movies available in the database.

POST /api/movies
Description: Creates a new movie record.
Usage: Clients can use this endpoint to add a new movie to the database by providing movie details in the request body.

DELETE /api/movies/{id}
Description: Deletes an existing movie by its unique identifier (id).
Usage: Clients can use this endpoint to remove a movie from the database based on its identifier.


3. SignedActors Entity:

POST /api/signed-actors
Description: Associates an actor with a movie, creating a new signed actors record.
Usage: Clients can use this endpoint to establish a relationship between an actor and a movie by providing the actor's ID and the movie's ID in the request body.

GET /api/signed-actors/{id}
Description: Retrieves a list of actor names associated with a particular movie identified by its unique identifier (id).
Usage: Clients can use this endpoint to fetch the names of actors signed for a specific movie.
