## Batch JPA

### Project creation

 curl -G https://start.spring.io/starter.tgz \
    -d dependencies=devtools,h2,lombok,data-jpa,batch,validation \
    -d type=maven-project \
    -d description="Batch with JPA" \
    -d groupId=io.github.eealba.springboot.example \
    -d artifactId=batch-jpa \
    -d name=batch-jpa \
    -d packaging=jar \
    -d javaVersion=17 \
    -d packageName=io.github.eealba.springboot.example.batch \
    -d baseDir=batch-jpa | tar -xzvf -
