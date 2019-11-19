# Sample calculator microservice
This project builds a nice springboot app that accepts 3 REST parameters:
1. Operand (mul,div,add,sub)
2. Number A
3. Number B

Service usage:
**************

Form a URL to the /calculator api with the required operand, together with two numbers to perform the calculation.
i.e to multiply 5 by 8 use this url:
http://localhost:8080/calculator/mul/5/8

The project is comprised of the following:
1. Source code using maven + springboot
2. dockerfile to create the docker image containing the application jar
3. jenkinsfile - the pipeline with the ci/cd process to actually run it as docker container.
