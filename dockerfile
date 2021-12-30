FROM openjdk:11
COPY ./app/build/libs/app-1.0.0.jar /home/program.jar
RUN java -jar /home/program.jar 
