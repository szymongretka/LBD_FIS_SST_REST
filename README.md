# Build
mvn clean package && docker build -t pl.fis.szymon.gretka/lbd-rest .

# RUN

docker rm -f lbd-rest || true && docker run -d -p 8080:8080 -p 4848:4848 --name lbd-rest pl.fis.szymon.gretka/lbd-rest 