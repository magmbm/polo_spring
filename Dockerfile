FROM eclipse-temurin:21

WORKDIR /mascotas

COPY /build/libs/*.jar app.jar

RUN useradd -m usuario_spring && chown -R usuario_spring /mascotas
USER usuario_spring

EXPOSE 8080

ENTRYPOINT [ "java", "-jar", "app.jar" ]