# Process Manager API

## 👨‍🏫 Installing Java

- It is a prerequisite to have a [java jdk](https://docs.aws.amazon.com/corretto/latest/corretto-17-ug/downloads-list.html) installed.

- Always check if JAVA_HOME and Path are correctly set for Corretto 17.

## 👨‍🏫 Installing Gradle

- You can use the Gradle available inside the project (recommended)

- In case you run in errors with the project's Gradle, try this:

- Download [Gradle](https://gradle.org/install/). Use version 8.5 distribution(Binary-only).

- Create a new directory `C:\Gradle` with File Explorer.

- Unpack the Gradle distribution ZIP into `C:\Gradle` using an archiver tool of your choice.

- Under System Variables select Path, then click Edit. Add an entry for `C:\Gradle\gradle-6.4\bin`. Click OK to save.

## 📃 Set Environment Variables

- In application.properties, for the mongodb uri, you can either use the connection string from docker (see below) or your own mongo database.

## ⚙️ Configure VS Code

- Download the following extension:

  - Lombok Annotations Support for VS Code
  - Spring Boot Extension Pack
  - Java Extension Pack

## 🗃 MongoDB + Docker

To configure and run MongoDB you need to have docker installed.

### 🕹 Startup for Docker

- First, create a .env file using the .env-sample in order to configure your system environment for docker.

To start the MongoDB container, use the command:

`docker-compose up -d`

### 🌐 Connection

The connection string:

`mongodb://root:root@127.0.0.1:27020/processdb?authSource=admin&readPreference=primary&appname=MongoDB%20Compass&directConnection=true&ssl=false`

### 🌀 Connect via mongo Shell

To access MongoDB via terminal, first enter the container:

`docker-compose exec mongodb bash`

Then log in into mongo:

`mongo -u root -p root`

List the databases:

`show dbs`

## 🏃‍♂️ Run the project

- If you have gradle, docker running and all variables set, you can:

```
./gradlew bootRun
```
