# Use the httpd-parent image as base
FROM openjdk:8u302-jdk

EXPOSE 8034

USER 0
RUN mkdir /usr/myapp

COPY target/rest-jpa-0.0.1.jar /usr/myapp

CMD java -jar /usr/myapp/rest-jpa-0.0.1.jar
