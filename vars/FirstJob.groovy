#!/usr/bin/env groovy

def call(body){
    def config = [:]
    echo "Calling FirstJob.call() with parameter ${body}"
    //body.resolveStrategy = Closure.DELEGATE_FIRST
    body.delegate = config
    body()
    echo "Calling FirstJob.call() printing config parameters ${body}"
    node(config.nodeName){
        echo "Inside node ${config.nodeName}"
    }
}