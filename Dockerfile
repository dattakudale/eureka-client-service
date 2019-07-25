FROM openjdk:8
VOLUME /tmp

ENV APP_HOME=/app/springboot/

ADD ./target/eureka-client-service-1.0.0.jar ${APP_HOME}/app.jar

RUN chmod -R u+x ${APP_HOME} && \
    chgrp -R 0 ${APP_HOME} && \
    chmod -R g=u ${APP_HOME} /etc/passwd

USER 10001

ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/app/springboot/app.jar"]
EXPOSE 8765 