FROM openjdk:26-trixie
ADD target/docker-fundamentals.jar docker-fundamentals.jar
ENTRYPOINT ["java","-jar","/docker-fundamentals.jar"]


