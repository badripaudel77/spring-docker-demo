# spring-docker-demo
## Writing docker file for spring boot and running it in container using docker image.
-----------------------------------------------------------------------------------
## Steps to Run the app
----------------------
### First make sure that docker is installed on your machine, depending on the OS you're using, it can be downloaded from official documentation of Docker at https://docs.docker.com/get-docker/

### Now write docker file with what each instruction tells about in **Dockerfile** located at the **root directory** of the project.

### Now build the docker image using following command _**docker build --tag spring-docker-world .**_, here spring-docker-world is the name I've use, you can use your own name

### Now Image is built, it's time to run the using the container, the command looks like _**docker run -d -p 8080:8080 spring-docker-world**_

### Now if you don't get any error, your application is running on the docker container and not on the local machine, to confirm this type localhost:8080 in the browser and you'll see the simple message which has been written in **SpringDockerAppApplication.java** file.
