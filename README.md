# Cinema-service


### Overview
Here is the simple project to learn of implementation of basic hibernate annotation in jav project.

### Project description
In the project uses hibernate to create Entity, store and manipulate them. Shown all types of relations of Entity and DATA BASE. 

Project has structure:

Entity
- Movie
- Cinema
- MovieSession
- Ticket
- User
- Shopping cart
- Order

Services
- CRUD operations
- Find by parameters

Special services
- Authentication
- Adding 'Salt' to password
- Hashing password

### Project has 2-tier architecture

- Service layer
- Data access object layer

### Database structure
![diagram](Hibernate_Cinema_Uml.png)

### Technologies used in project

- Java v.11
- Hibernate v.5.4.21.Final
- MySQL v.8.0
- Maven v.3.8.5

### To run project you should

1. Install MySQL, Git, Maven, Java
2. Clone the project from GitHub
3. Initialise hibernate: configure file /src/resources/hibernate.cfg.xml
4. Set URL, USERNAME, PASSWORD, JDBC_DRIVER in /src/resources/hibernate.cfg.xml
5. Add schema "cinema" into DB;
6. Run project