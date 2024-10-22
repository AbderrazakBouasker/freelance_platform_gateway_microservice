# freelance_platform_gateway_microservice

## Docker build instructions

### Create a docker network if it doesn't exist
```bash
docker network create freelance-platform
```

### Build the docker image
```bash
docker build -t gateway-service .
```

### Run the docker image
```bash
docker run -p 9094:8080 --name gateway-service --network freelance-platform gateway-service
```

### Test the service
```bash
curl http://localhost:9094/gateway/hello
```

