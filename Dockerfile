FROM java:8
RUN mkdir -p /opt/javapp
COPY target/customer-api-SOAP-mysql-1.0.0.jar /opt/javapp/
ENV MYSQL_DB_HOST=$MYSQL_DB_HOST
WORKDIR /opt/javapp
EXPOSE 8080
ENTRYPOINT ["java","-jar","customer-api-SOAP-mysql-1.0.0.jar"]