# Consul Demo

## Running with consul-template

```bin
consul-template  -template "src/main/resources/application.tpl:application1.properties" -exec "java -jar target/gudang-0.0.1-SNAPSHOT.jar --spring.config.location=application1.properties --server.port=9000"
```

## Running with envconsul

```bin
envconsul -prefix consul-demo "java -jar target/gudang-0.0.1-SNAPSHOT.jar"
```
