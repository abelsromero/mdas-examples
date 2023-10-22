FROM ubuntu:jammy

ARG DEPLOY_PATH="/app"
ENV WHO_PATH="/app/who"

RUN mkdir $DEPLOY_PATH
COPY say_hello_from_file.sh $DEPLOY_PATH
ENTRYPOINT [ "/app/say_hello_from_file.sh" ]

