FROM docker.io/tomcat:10-jdk17

COPY /target/sb-war-docker.war /usr/local/tomcat/webapps/samplewarapp.war

RUN addgroup  springboot && adduser tomcat
RUN usermod -G springboot tomcat
RUN chown -R tomcat /usr/local/tomcat
USER tomcat

EXPOSE 8080