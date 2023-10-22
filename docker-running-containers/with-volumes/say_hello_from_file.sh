#!/bin/bash

if [ ! -f "$WHO_PATH" ]; then
  echo "Error: configuration file not found"
  exit 0
fi

echo "Hello $(cat $WHO_PATH)!"