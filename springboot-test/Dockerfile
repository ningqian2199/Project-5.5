FROM java:8
MAINTAINER 1182157267@qq.com
VOLUME /tmp
ARG JAR_FILE
COPY springboot-test-0.0.1-SNAPSHOT.jar app.jar
RUN bash -c 'touch /app.jar'
EXPOSE 8092
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","-Denv=DEV","/app.jar"]