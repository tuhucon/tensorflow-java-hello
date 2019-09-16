sh jni.sh
mvn package
java -jar  -Djava.library.path=./jni  ./target/tensofloww-hellow-0.0.1-SNAPSHOT.jar
