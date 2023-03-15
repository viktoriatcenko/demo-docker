* Docker

* Образ - это "слепок" инфраструктуры, который включает в себя
определенную версию Linux с настроенным и предустановленным ПО

* Контейнер - конкретный экземпляр образа , который может работать изолированно от 
других контейнеров

* Образ создается и запускается на основе инструкций , которые мы указываем
в Dockerfile

* Образы могут наследоваться друг от друга, незачем собрать свой собственный
образ, если уже есть готовый

* Volume - отсек памяти Образа для хранения в нем данных из БД




docker build -t spring-boot-image .

docker run --name postgres-container -v pgdata:/var/lib/postgresql/data -p 5433:5432 -e POSTGRES_PASSWORD=postgres postgres

docker pull postgres

docker run --name spring-boot-container-1 -p 80:8080 spring-boot-image

docker build -t spring-boot-image .

docker run --name person-application-container-1 -e SPRING_DATASOURCE_URL=jdbc:postgresql://172.17.0.2:5432/postgres -e SPRING_DATASOURCE_USERNAME=postgres -e SPRING_DATASOURCE_PASSWORD=postgres -p 80:8080 spring-boot-image