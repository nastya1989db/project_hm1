FROM ubuntu:latest
RUN apt-get update && \
    apt-get install -y openjdk-11-jdk ant
RUN apt install -y git
WORKDIR /Test_ant
RUN git clone https://github.com/nastya1989db/project_hm1.git Test_ant
RUN ant
RUN cp build/jar/*.jar /build/jar/*.jar
CMD ["java", "-jar", "TaskNew1.jar"]

