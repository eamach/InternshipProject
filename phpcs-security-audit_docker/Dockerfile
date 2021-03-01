FROM composer:latest

RUN composer require --dev pheromone/phpcs-security-audit
RUN sh ./vendor/pheromone/phpcs-security-audit/symlink.sh
RUN ./vendor/bin/phpcs --config-set ignore_errors_on_exit 1
RUN ./vendor/bin/phpcs --config-set ignore_warnings_on_exit 1
USER 1001

CMD ["bash","-c", "./vendor/bin/phpcs -i"]