FROM openjdk:11
EXPOSE 8090
ADD target/github-actions-cicd.jar github-actions-cicd.jar
ENTRYPOINT ["java","-jar","/github-actions-cicd.jar"]