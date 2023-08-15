# TuneJar Backend

Este es el repositorio del backend de TuneJar, una aplicación web para descubrir y gestionar canciones favoritas.

## Tecnologías Utilizadas

- Spring Boot
- Spring Data JPA
- Kotlin
- H2 Database (para pruebas; puedes cambiar a otra base de datos en producción)

## Instalación y Uso

1. Clona este repositorio: `git clone https://github.com/Irina-Ichim/PracticandSvelteConJaviBackend-Tunejar.git`
2. Ve al directorio del proyecto: `cd PracticandSvelteConJaviBackend-Tunejar`
3. Abre el proyecto en tu IDE favorito que soporte Kotlin (por ejemplo, IntelliJ IDEA).
4. Ejecuta la aplicación para iniciar el servidor backend.

La aplicación se ejecutará en el puerto 9000 por defecto. Puedes cambiar el puerto editando el archivo `application.properties`.

## Endpoints Disponibles

- `GET /api/songs`: Obtiene una lista de todas las canciones disponibles.
- `PUT /api/songs/{id}/like`: Marca una canción como favorita.
- `PUT /api/songs/{id}/dislike`: Marca una canción como no favorita.

## Datos de Prueba

El proyecto incluye un componente `DataLoader` que carga datos de prueba en la base de datos al iniciar la aplicación. Puedes modificar estos datos en `DataLoader.kt`.

## Contribución

¡Si deseas contribuir a este proyecto, eres bienvenida! Puedes crear un fork del repositorio, realizar tus cambios y enviar un pull request.

## Notas

- Este es el backend correspondiente a TuneJar. Asegúrate de conectarlo adecuadamente con el frontend.
- No olvides configurar las credenciales de la base de datos en el archivo `application.properties` si estás utilizando una base de datos diferente.

¡Disfruta trabajando en TuneJar Backend!
