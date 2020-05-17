#!/usr/bin/env bash

#mvn clean package

echo 'Copy files...'

scp \
    target/EasyBarber-1.0-SNAPSHOT.jar \
    root@45.12.18.176:/root/

echo 'Restart server...'

ssh root@45.12.18.176

nohup java -jar EasyBarber-1.0-SNAPSHOT.jar


echo 'Bye'