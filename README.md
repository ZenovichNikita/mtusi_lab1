[![Build Status](https://travis-ci.org/ZenovichNikita/mtusi_lab1.svg?branch=master)](https://travis-ci.org/ZenovichNikita/mtusi_lab1)
# Технологии разработки программного обеспечения
## Лабораторная работа № 1: создание микросервиса на Spring Boot с базой данных
## Зенович Никита Евгеньевич ЗМБД2031
Цель лабораторной работы: Знакомство с разработкой веб-приложений, микро-сервисов используя Spring Boot, Maven, Docker.
## Сборка и запуск

### Клонировать репозиторий

`git clone https://github.com/ZenovichNikita/mtusi_lab1.git`

### Сборка проекта

Открыть проект с помощью IDE IntelliJ IDEA
По правой стороне GUI найти вкладку Maven и там запустить сборку проекта, либо открыть терминал в нижней части GUI и выполнить команду:

`mvn package -Dmaven.test.skip=true`
### Сборка Docker образа
В том же терминале выполнить команду сборки образа

`docker build . -t simpleapi:latest`
### Запуск Docker контейнера
Запуск контейнера осуществляется с указанием маппинга портов хоста и контейнера

`docker run -p 8080:8080 simpleapi:latest`

### Эндпоинты приложения для работы с таблицами
Дальше все адреса зависят от того, где развернуто наше приложение. На данный момент приложение настроено на запуск в Heroku, при необходимости можно изменить 
в файле src/main/resources/application.properties:

При запуске из IDE эндпоинты доступны по доменному имени http://localhost/

При запуске в докере - 172.17.0.1

При запуске в кубернетес - http://postgres.local

При запуске с помощью Хироку - http://mtusisimpleapi.herokuapp.com/



Получение конкретного экземпляра таблицы "products" по id : `curl GET {adress}/api/v1/products/{id}`

Получение всей таблицы "products":                          `curl GET {adress}/api/v1/products`

Сохранение элемента в таблицу "products":                   `curl POST {adress}/api/v1/products -d '{"name": "{имя}","brand": "{брэнд}","price": {цена},"quantity": {количество}}' -H "Content-Type: application/json"`

Удаление элемента из таблицы "products":                    `curl DELETE {adress}/api/v1/products/{id}`

### Эндпоинты приложения для получения hostname
curl GET {adress}/api/v1/status

## Лабораторная работа №3: CI/CD и деплой приложения в Heroku
Целью лабораторной работы является знакомство с CI/CD и его реализацией на примере Travis CI и Heroku.
### Ссылка на развернутое приложение на платформе Heroku
http://mtusisimpleapi.herokuapp.com/api/v1/status


