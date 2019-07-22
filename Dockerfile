FROM airhacks/glassfish
COPY ./target/lbd-rest.war ${DEPLOYMENT_DIR}
