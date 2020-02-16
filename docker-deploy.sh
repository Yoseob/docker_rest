docker login -u YOUR_USERNAME -p YOUR_PASSWORD

docker build -t iosid/test_build:latest .
docker push iosid/test_build:latest