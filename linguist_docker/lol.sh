#!/bin/bash

LOL=$(docker run --rm -v "$(pwd):/dir" eamach/linguist)
echo "$LOL"
if [ "$LOL" = "*Java*" ]; then
    echo "Acertou"
else
    echo "Negativo"
fi