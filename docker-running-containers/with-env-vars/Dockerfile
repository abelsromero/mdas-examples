FROM ubuntu:jammy

ARG DEPLOY_PATH="/app"
ENV ALIAS=""

RUN mkdir $DEPLOY_PATH
COPY say_hello_from_envar.sh $DEPLOY_PATH
ENTRYPOINT [ "/app/say_hello_from_envar.sh" ]

