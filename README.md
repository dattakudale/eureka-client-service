# customservice app


## Build with maven 
mvn clean install

## Docker command

docker build -t customservice:v1 .

## Run with Docker

docker run customservice:v1


## Run with Kubernetes  using google cloud and use your porject.

## If you want run and validate

kubectl run customservice --image=customservice:v1


## Deploy spring boot using Kubernetes deployment file

kubectl create -f customservice-config.yaml	

## Update deployment with v2 version 

kubectl set image deployment/customservice customservice=customservice:v2


## Create multiple instances ( Replicas )   , below will create 3 instances of zuul proxy 

kubectl scale deployment customservice --replicas=2
