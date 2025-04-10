FROM openjdk:8-jdk-alpine

#RUN apt-get update && apt-get upgrade -y

RUN apk add --no-cache git
RUN apk add --update vim

# Скачиваем и устанавливаем Apache Ant
RUN wget https://archive.apache.org/dist/ant/binaries/apache-ant-1.10.12-bin.tar.gz \
    && tar xzf apache-ant-1.10.12-bin.tar.gz \
    && mv apache-ant-1.10.12 /usr/local/ant \
    && ln -s /usr/local/ant/bin/ant /usr/bin/ant

# Добавляем переменную окружения PATH
ENV ANT_HOME=/usr/local/ant
ENV PATH=${ANT_HOME}/bin:${PATH}

RUN git clone https://github.com/nastya1989db/project_hm1.git clone2

#для локального использования
#COPY build.xml ./clone2/
#COPY ./src/* ./clone2/src/

WORKDIR /clone2

RUN ant

CMD ["java", "-jar", "/clone2/build/jar/TaskNew1.jar"]