FROM ubuntu:18.04
MAINTAINER iosid
LABEL "purpose"="practice"
RUN apt-get update
RUN apt-get install git maven default-jdk -y
RUN git clone https://github.com/Yoseob/docker_rest.git
WORKDIR /docker_rest
RUN mvn package
EXPOSE 8080
CMD java -jar target/demo-0.0.1-SNAPSHOT.jar
