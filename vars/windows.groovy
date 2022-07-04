#!/usr/bin/env groovy

def call(body){
    node('windows'){
        //body()
        echo 'windows body '
    }
}