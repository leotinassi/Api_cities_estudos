# Cities API

## Requirements

* Windows
* Git
* Java 11
* Docker
* IntelliJ Community
* Heroku CLI
* Travis CLI

## DataBase

### Mysql

* [Mysql Docker Hub](https://hub.docker.com/_/mysql)

```shell script
docker run --name some-mysql -e MYSQL_ROOT_PASSWORD=my-secret-pw -d mysql:tag
```

```shell script

```

### Query Earth Distance

Point
```roomsql
select ((select lat_lon from cidade where id = 4929) <@> (select lat_lon from cidade where id=5254)) as distance;
```

Cube
```roomsql
select earth_distance(
    ll_to_earth(-21.95840072631836,-47.98820114135742), 
    ll_to_earth(-22.01740074157715,-47.88600158691406)
) as distance;
```

## Spring Boot

* [https://start.spring.io/](https://start.spring.io/)

+ Java 11
+ Maven Project
+ Jar
+ Spring Web
+ Spring Data JPA
+ Mysql Driver

### Spring Data

* [jpa.query-methods](https://docs.spring.io/spring-data/jpa/docs/current/reference/html/#jpa.query-methods)

### Properties

* [appendix-application-properties](https://docs.spring.io/spring-boot/docs/current/reference/html/appendix-application-properties.html)
* [jdbc-database-connectio](https://www.codejava.net/java-se/jdbc/jdbc-database-connection-url-for-common-databases)

### Types

* [JsonTypes](https://github.com/vladmihalcea/hibernate-types)
* [UserType](https://docs.jboss.org/hibernate/orm/3.5/api/org/hibernate/usertype/UserType.html)

## Heroku

* [DevCenter](https://devcenter.heroku.com/articles/getting-started-with-gradle-on-heroku)

```shell script
Create a heroko account to deploy and then host on the clouds
https://id.heroku.com/login
```

## Code Quality

### PMD

+ https://pmd.github.io/pmd-6.8.0/index.html

### Checkstyle

+ https://checkstyle.org/

+ https://checkstyle.org/google_style.html

+ http://google.github.io/styleguide/javaguide.html

```shell script
wget https://raw.githubusercontent.com/checkstyle/checkstyle/master/src/main/resources/google_checks.xml
```

## InMemory Database Testing

+ http://www.h2database.com/html/features.html


## Migrations

+ https://flywaydb.org/

## CI

### Travis

Data to use in the bank:

+ https://github.com/travis-ci/travis.rb#readme

+ https://docs.travis-ci.com/user/tutorial/

#### extra

+ https://docs.travis-ci.com/user/conditional-builds-stages-jobs/
+ https://docs.travis-ci.com/user/deployment-v2/conditional

+ [Heroku Deployment](https://docs.travis-ci.com/user/deployment/heroku/)
