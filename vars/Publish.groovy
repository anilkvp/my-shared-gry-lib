#!/usr/bin/env groovy

def call(Closure body){
    echo 'Calling Publish'
    node {
        stage('Pre publish stage'){
            echo 'Inside pre publish stage........................'
        }
    }
    body()
}