docker login -u iosid -p pw

docker build -t iosid/test_build:0.0.1 .
docker tag iosid/test_build:0.0.1 iosid/test_build:latest

docker push iosid/test_build:latest
docker push iosid/test_build:0.0.1