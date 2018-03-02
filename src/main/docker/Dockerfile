FROM java:8
VOLUME /tmp
ADD springbootscaladocker-0.0.1-SNAPSHOT.war app.war
RUN sh -c 'touch /app.war'
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/app.war"]
