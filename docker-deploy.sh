docker login -u YOUR_USERNAME -p YOUR_PASSWORD

docker build -t iosid/test_build:latest .
docker tag iosid/test_build:0.0.1 iosid/test_build:latest

docker push iosid/test_build:latest
docker push iosid/test_build:0.0.1