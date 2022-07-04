#!/usr/bin/env groovy

def call(body){
    def config = [:]
    echo "Calling FirstJob.call() with parameter ${body}"
    echo "Calling FirstJob.call() printing config parameters ${config}"
}