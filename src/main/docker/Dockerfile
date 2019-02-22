FROM java:8
VOLUME /tmp
ADD sb_02-0.0.1-SNAPSHOT.jar app.jar
RUN bash -c 'touch /app.jar'
ENV EXAM 123
ENTRYPOINT ["java", "-jar", "/app.jar"]