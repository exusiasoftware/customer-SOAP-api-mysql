FROM java:8
RUN mkdir -p /opt/javapp
COPY target/customer-api-SOAP-mysql-1.0.0.jar /opt/javapp/
ENV MYSQL_DB_HOST="127.0.0.1"
WORKDIR /opt/javapp
EXPOSE 8080
ENTRYPOINT ["java","-jar","customer-api-SOAP-mysql-1.0.0.jar"]

#push to docker hub
#create the image docker build -t customer-api-soap-mysql:xxx .
#docker images command and take note of the image id
#docker login --username YOUR_USER_NAME
#docker tag imageid docker-account/customer-api-soap-mysql
#docker push docker-account/customer-api-soap-mysql
