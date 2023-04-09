# DBMS-Lab-NoSQL

## Execution
```
git clone https://github.com/lomayd/DBMS-Lab-NoSQL.git

cd ./DBMS-Lab-NoSQL

[Write down "redis_password", "MONGO_INITDB_ROOT_PASSWORD" in docker-compose.yml]

docker-compose up -d

[Write down "spring.redis.password", "spring.data.mongodb.password" in /src/main/resources/application.yml]

sudo chmod 777 ./gradlew

./gradlew build

java -jar build/libs/DBMS-Lab-NoSQL-0.0.1-SNAPSHOT.jar 
```

## Contents
- NoSQL Installation Using Docker Image
- Springboot Application - NoSQL Connection
- Springboot CRUD API Implementation Using CRUD Repository, Mongo Repository, Elasticsearch Repository
