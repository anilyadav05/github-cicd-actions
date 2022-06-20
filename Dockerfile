FROM openjdk:11
EXPOSE 8080
ADD target/springboot-cicd-example-image.jar springboot-cicd-example-image.jar
ENTRYPOINT ["java","jar","/springboot-cicd-example-image.jar"]