FROM fabric8/java-centos-openjdk8-jre:latest
ADD ./target/*.jar /
EXPOSE 8080/tcp
CMD java -jar -Xmx512m -jar calculator-service-0.0.1-SNAPSHOT.jar