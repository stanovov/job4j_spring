FROM maven:3.6.3-openjdk-17

RUN mkdir job4j_spring

WORKDIR job4j_spring

COPY . .

RUN mvn install

CMD ["java", "-jar", "target/main.jar"]