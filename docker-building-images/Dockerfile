FROM ubuntu:jammy

ARG DEPLOY_PATH="/app"

RUN mkdir $DEPLOY_PATH
COPY say_hello.sh $DEPLOY_PATH
ENTRYPOINT [ "/app/say_hello.sh" ]
