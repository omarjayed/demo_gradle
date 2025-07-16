# demo_gradle

### Start postgres in docker with the following cmd
docker-compose up -d

### Run Spring Boot with Gradle
./gradlew bootRun

### Test the API via postman
1. POST at http://localhost:8080/api/posts with header "Content-Type: application/json" and body '{"title":"Test Title","body":"Test Body"}' to create a post
2. GET from http://localhost:8080/api/posts to see the list of posts

### Run test with gradle
./gradlew test

### Build JAR with gradle
./gradlew bootJar

### Run custom gradle tasks
#### To insert the profile to build the project with
./gradlew -Pprofile=insert_profile_name

#### To print the buildinfo
./gradlew printBuildInfo