FROM 
ADD ./target/*.jar /
EXPOSE 8080/tcp
CMD java -jar -Xmx512m -jar calculator-service-0.0.1-SNAPSHOT.jar