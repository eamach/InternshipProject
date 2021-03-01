FROM node:latest
RUN npm i -g eslint
RUN npm install eslint-plugin-security@latest --save-dev
RUN npm install eslint-plugin-react --save-dev
COPY esrc /var/
RUN chmod -R 777 /var/esrc