FROM openjdk:17-alpine

ARG JAR_FILE=build/libs/docker_0319_2-0.0.1-SNAPSHOT.jar

COPY ${JAR_FILE} /doc_0319_2.jar

ENTRYPOINT [ "java","-jar","doc_0319_2.jar" ]