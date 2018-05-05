# MultiDataSource
Demonstration for running spring boot application with multiple (two here) data sources.

**Prerequisites**

Java 8 or 9

Gradle 3.0 or newer

Docker 18 or newer

**Setting up the environment**

Setting up two Postgres databases.
```
$ docker-compose up -d
```
To Generate default schema and data.
```
$ gradle dbmigrate
```

**Running the application**

Running main method of MultiDSDemoApplication.java

To tear down databases.
```
$ docker-compose down
```
