cd accounts
mvn compile jib:dockerBuild
docker image push docker.io/dpereira97/accounts:$1
cd ..
cd loans
mvn compile jib:dockerBuild
docker image push docker.io/dpereira97/loans:$1
cd ..
cd cards
mvn compile jib:dockerBuild
docker image push docker.io/dpereira97/cards:$1
cd ..
cd configserver
mvn compile jib:dockerBuild
docker image push docker.io/dpereira97/configserver:$1
cd ..
cd eurekaserver
mvn compile jib:dockerBuild
docker image push docker.io/dpereira97/eurekaserver:$1
cd ..
cd gatewayserver
mvn compile jib:dockerBuild
docker image push docker.io/dpereira97/gatewayserver:$1
cd ..
cd message
mvn compile jib:dockerBuild
docker image push docker.io/dpereira97/message:$1