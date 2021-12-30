FROM openjdk:11
COPY /app/build/libs/app-1.0.0-all.jar /home/program.jar
RUN chmod 775 /home/program.jar
CMD ["java", "-jar", "/home/program.jar"]
