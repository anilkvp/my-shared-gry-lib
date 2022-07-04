#!/usr/bin/env groovy

def call(body){
    node('Publish'){
        echo 'Inside publish node........................'
    }
    echo 'Calling Publish'
}