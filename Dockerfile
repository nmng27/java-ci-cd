FROM ubuntu:latest
LABEL authors="mangu"

ENTRYPOINT ["top", "-b"]