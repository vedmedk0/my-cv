#!/bin/sh
set -euxo pipefail
DIR=/tmp/pages-deploy
CURRENT=$(pwd)
COMMIT_MSG="push ver 2"
sbt "reload ; clean ; fullOptJS ; packageSite" && \
  rm -rf $DIR && \
  mkdir $DIR && \
  cd $DIR && \
  git clone https://github.com/vedmedk0/my-cv.git && \
  cd my-cv && \
  git checkout gh-pages && \
  touch dummy && \
  rm -rf ./* && \
  cp $CURRENT/target/site/* . && \
  git add . && \
  git commit -m "$COMMIT_MSG" && \
  git push -f

