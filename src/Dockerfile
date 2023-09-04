ADD openjdk:17
ADD target/register.jar register.jar
LABEL authors="skaznika"

ENTRYPOINT["java", "-jar", "register.jar"]
EXPOSE 8080