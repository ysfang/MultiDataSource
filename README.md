# MyBatisSpringDemo
Demonstration of running MyBatis-Spring based application with multiple data sources (two here).

## **Prerequisites**

Java 8 or 9

Gradle 3.0 or newer

Docker 18 or newer

## **Setting up the environment**

Setting up two Postgres databases.
```
$ docker-compose up -d
```
To Generate default schema and data.
```
$ gradle dbmigrate
```

## **Running the application**

Running main method of Application.java

To tear down databases.
```
$ docker-compose down
```

## **Reference**

[Multi DataSource discussion chain](https://github.com/mybatis/spring-boot-starter/issues/78)