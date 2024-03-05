build:
	docker build -f Dockerfile -t proyecto/spring:latest .

run:
	docker run -p 8081:8080 proyecto/spring:latest