# Required packages
PostgreSQL 9.6
Java 7 or 8
Maven 3
Spring Framework
Node Package Manager
Angular JS

# Database settings
Database: edm
User: edm
Password: n/a

After creating the database, import the dumped data located in data/edm.sql

# To run the tasks module:
1. Change directory to tasks.
2. Execute command mvn clean install -Prun-tomcat -DskipTests
3. Visit http://localhost:8808/tasks

# To run the webservices module:
1. Change directory to webservices.
2. Execute command mvn clean install -Prun-tomcat -DskipTests
3. Visit http://localhost:8880/api

# To run the frontend module (spring mvc):
1. Change directory to frontend.
2. Execute command mvn clean install -Prun-tomcat -DskipTests
3. Visit http://localhost:8088

# To run the frontend (angular js):
1. Node Package Manager and Angular CLI must be installed.
2. Execute command npm install (first time only)
3. npm start
4. Visit http://localhost:4200

