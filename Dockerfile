FROM openjdk:16-jdk-alpine3.12

RUN apk add curl jq

# Workspace
WORKDIR /usr/share/talentTestAutomation

#ADD .jar under target from host
#into this image
ADD target/selenium-docker-PeakSoft.jar 		selenium-docker-PeakSoft.jar			
ADD target/selenium-docker-PeakSoft-tests.jar 	selenium-docker-PeakSoft-tests.jar
ADD target/libs									libs

# in case of any other dependency like .csv / .json / .xls please add as well
#ADD suite files
ADD FirstModule.xml	FirstModule.xml

#Add health check script
ADD healthcheck.sh  healthcheck.sh

ENTRYPOINT sh healthcheck.sh