FROM ubuntu:latest
RUN apt-get update && \
    apt-get install -y openjdk-11-jdk ant
RUN apt install -y git
WORKDIR /APP
RUN git clone https://github.com/nastya1989db/project_hm1.git APP
RUN cd APP
RUN ant
RUN cp build/jar/src/*.jar /build/jar/src/*.jar
CMD ["java", "-jar", "TaskNew1.jar"]

