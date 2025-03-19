FROM openjdk:17

ARG JAR_PATH=/build/libs/docker_0319_3-0.0.1-SNAPSHOT.jar

COPY ${JAR_PATH} /doc_ex2.jar

ENTRYPOINT [ "java","-jar","-Dspring.profiles.active=dev","doc_ex2.jar" ]