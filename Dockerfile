FROM ubuntu:latest
FROM openjdk:17-jdk-slim
RUN apt update
RUN apt install -y git
RUN apt install -y vim
RUN git clone https://github.com/nastya1989db/project_hm1.git test_tasknew1
CMD ["bash"]


