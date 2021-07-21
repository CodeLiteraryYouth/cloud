FROM openjdk:8-jdk-alpine
VOLUME /tmp
ADD target/cloud-application-0.0.1-SNAPSHOT.jar cloud-application-0.0.1-SNAPSHOT.jar.jar
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/cloud-application-0.0.1-SNAPSHOT.jar"]
EXPOSE 9002
RUN /bin/cp /usr/share/zoneinfo/Asia/Shanghai /etc/localtime \&& echo 'Asia/Shanghai' >/etc/timezone
