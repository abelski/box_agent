FROM adoptopenjdk/openjdk11:alpine-jre

WORKDIR /app
# ensure we copy an application.jar into the container
ADD build/libs/projector.war /app/projector.war

CMD [   "java", \
        "-jar", \
        "/app/projector.war" \
]
