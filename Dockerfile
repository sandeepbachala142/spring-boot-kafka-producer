FROM openjdk:14
ADD target/spring-boot-kafka-producer.jar spring-boot-kafka-producer.jar
EXPOSE 8081
ENTRYPOINT ["java","-jar","spring-boot-kafka-producer.jar"]