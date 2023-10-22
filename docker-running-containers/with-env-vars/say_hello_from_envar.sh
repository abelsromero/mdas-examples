#!/bin/bash

if [ ! -z "$ALIAS" ]; then
  echo "Hello $ALIAS...I think you are hiding something..."
  exit 0
fi

readonly WHO="${1:?must be set}"
echo "Hello $WHO!"