FROM openjdk:19-jdk-oracle
WORKDIR	 /home/customerservice
COPY target/customerservice.jar customerservice.jar

EXPOSE 8080
#ENV datasource.url=abc
#ENV datasource.username=abc
#ENV datasource.password=abc
#ENV server.port=80
#CMD ["java", "-Dserver.port=server.port", "-Ddatasource.url=datasource.url","-Ddatasource.username=datasource.username", "-jar","customerservice.jar"]
ENTRYPOINT ["java", "-jar", "customerservice.jar"]
