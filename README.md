# spring-docker-demo
## Writing docker file for spring boot and running it in container using docker image, pushing and pulling to/from docker hub. 
-----------------------------------------------------------------------------------

#### For detail explanation of how to dockerize simple spring boot Java application, you can follow my website at [Coding Guides ](https://guidestocode.com/java/how-to-dockerize-java-spring-boot-application/#Overview_and_Introduction_to_Docker)
## Explanation
----------------------
- First make sure that docker is installed on your machine, depending on the OS you're using, it can be downloaded from official documentation of Docker at [Docker Website](https://docs.docker.com/get-docker/)

- Now write docker file with what each instruction tells about in **[```Dockerfile```](https://github.com/badripaudel77/spring-docker-demo/blob/main/Dockerfile)** located at the **root directory** of the project.

- Now build the docker image using following command  _**```docker build --tag spring-docker-world .```**_ here spring-docker-world is the name I've used, you can use your own name and remember there is space and a . (dot)

- Image is built, it's time to run the using the container, the command looks like _**```docker run -d -p 8080:8080 spring-docker-world```**_

- At this moment if you don't get any error, your application is running on the docker container and not on the local machine, to confirm this type localhost:8080 in the browser and you'll see the simple message which has been written in **[```SpringDockerAppApplication.java```](https://github.com/badripaudel77/spring-docker-demo/blob/main/src/main/java/com/io/docker/spring/springdockerapp/SpringDockerAppApplication.java)** file.

- Reference can be found at [Docker Official Website](https://docs.docker.com/language/java/build-images/) and [This tutorial](https://docker-curriculum.com/)

------------------------------------------------------------------------------------------------------------

## Pushing docker image to docker hub 

- Create account at docker hub [Docker Hub](https://hub.docker.com/)

- Create the repository 

- Here we need to create the tagname for our unofficial image by running the following command, _**```docker tag spring-docker-world:latest badripaudel77/hello-java-docker:latest```**_ here, ```badripaudel77``` is my dockerhub username and  ```hello-java-docker:latest``` is the image name and tagname respectively in docker hub while spring-docker-world is the local image name, username will be different for you and rest can be same or different.

- Now  push to docker hub using the following command, _**```docker push badripaudel77/hello-java-docker:latest```**_

- After a while it will be pushed to docker hub which you can see at [Very First and the simplest Spring-Docker app](https://hub.docker.com/repository/docker/badripaudel77/hello-java-docker)

- It can also be pulled using command _**```docker pull badripaudel77/hello-java-docker:latest```**_

- And run to see if it's working just run the command _**```docker run -p 8080:8080 badripaudel77/hello-java-docker:latest```**_ you should see the same output as before but this time pulling image from docker hub that we created and published. 

### Cheers !!! we've created docker file, build image, run image locally, pushed it to the docker hub and finally pulled image from remote docker hub repository.

