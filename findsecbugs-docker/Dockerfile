FROM blacklabelops/java:server-jre.8

RUN set -x \
	\
	&& apk add --no-cache --virtual .fetch-deps \
		curl \
		jq \
		ca-certificates \
		unzip \
		openssl \
		coreutils \
	&& export VERSION_FB=$(curl -s "https://api.github.com/repos/find-sec-bugs/find-sec-bugs/releases/latest" | jq -r .tag_name | cut -b 9-) \
	&& export VERSION_SB=$(curl -s "https://api.github.com/repos/spotbugs/spotbugs/releases/latest" | jq -r .tag_name) \
	&& wget -O find-sec-bugs.zip "https://github.com/find-sec-bugs/find-sec-bugs/releases/download/version-$VERSION_FB/findsecbugs-cli-$VERSION_FB.zip" \
	&& wget -O spotbugs.zip "https://github.com/spotbugs/spotbugs/releases/download/$VERSION_SB/spotbugs-$VERSION_SB.zip" \
  && unzip find-sec-bugs.zip -d /usr/local/bin \
  && rm -rf /usr/local/bin/lib/spotbugs-3.1.12.jar /usr/local/bin/lib/spotbugs-annotations-3.1.12.jar \
  && unzip -o -j spotbugs.zip "spotbugs-$VERSION_SB/lib/*" -d /usr/local/bin/lib/ \
  && rm -rf find-sec-bugs.zip \
  && rm -rf spotbugs.zip \
  && sed $'s/\r$//' /usr/local/bin/findsecbugs.sh \
  && chmod +x /usr/local/bin/findsecbugs.sh

CMD ["bash","-c","findsecbugs.sh", "help"]