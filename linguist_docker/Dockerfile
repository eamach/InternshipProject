FROM alpine:3.12

RUN apk add --no-cache --virtual .fetch-deps \
    ruby \
    cmake \
    build-base \
    pkgconfig \
    icu-dev \
    zlib-dev \
    curl-dev \
    openssl-dev \ 
    ruby-dev \
    ruby-charlock_holmes \
    ruby-rugged \
    ruby-json \
    && gem install github-linguist

VOLUME [ "/dir" ]

WORKDIR /dir

ENTRYPOINT [ "github-linguist" ]