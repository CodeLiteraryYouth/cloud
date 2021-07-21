FROM openjdk:8-jdk-alpine
VOLUME /tmp
ADD target/cloud-auth.jar cloud-auth.jar
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/cloud-auth.jar"]
EXPOSE 9001
RUN /bin/cp /usr/share/zoneinfo/Asia/Shanghai /etc/localtime \&& echo 'Asia/Shanghai' >/etc/timezone
