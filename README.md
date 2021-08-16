# spring boot with seperate jar files


## how to running

* build

```code

mvn clean package
```

* copy files

```code

mkdir -p demoapp/lib

cp firstjar/target/firstjar-0.0.1-SNAPSHOT.jar demo/lib
cp secondjar/target/secondjar-0.0.1-SNAPSHOT.jar demo/lib
cp thirdjar/target/thirdjar-0.0.1-SNAPSHOT.jar demo/lib
cp ui/target/ui-0.0.1-SNAPSHOT.jar demo/
cd demo
```

* running 

```code
java -cp ui-0.0.1-SNAPSHOT.jar -Dloader.path=./lib org.springframework.boot.loader.PropertiesLauncher
```