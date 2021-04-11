Trabajo de referencia UNLP – BBDD2 Cursada 2021

### Setup del proyecto con Docker-Compose:
Este setup es totalmente opcional, y permite la definición de las dependencias necesarias para correr el proyecto sin depender de VMs.

Las dependencias definidas son las siguientes:
- OpenJDK-11
- Maven 3.6.3
- MySQL 8.0.23
- phpMyAdmin 5.0.1

1. Instalar [Docker](https://docs.docker.com/get-docker/) y [Docker-Compose](https://docs.docker.com/compose/install/).
2. Para buildear y levantar containers:
   ```
   docker-compose -f docker-compose-dev.yml up --build
   ```
3. Para finalizar y eliminar containers:
    ```
    # Manteniendo volumes:
    docker-compose -f docker-compose-dev.yml down
 
    # Wipeando volumes:
    docker-compose -f docker-compose-dev.yml down -v
    ```
4. Es posible que hibernate no pueda conectarse al container de la DB arrojando el siguiente error:   
   ```
    Exception in thread "main" java.sql.SQLNonTransientConnectionException: Public Key Retrieval is not allowed
   ```
   En tal caso, podemos modificar el archivo `main/java/bd2/config/HibernetConfiguration.java`, método DataSource:
   ```
        ...
        dataSource.setDriverClassName...
        // Linea a modificar:
        dataSource.setUrl("jdbc:mysql://db:3306/grupo" + this.getGroupNumber() + "?allowPublicKeyRetrieval=true&useSSL=false");
        ...
        ...
   ```
5. Usando IntelliJ podemos correr los containers usando el [remote runner](https://www.jetbrains.com/help/idea/docker.html#using-docker-compose), permitiendo compilar el proyecto como si lo estuvieramos corriendo nativamente.
6. phpMyAdmin es accesible de la siguiente forma:
````
 - Acceder a http://localhost:8000/
 - En el login, ingresar server: db
 - Username: root
 - Password: root 
````