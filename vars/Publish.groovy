#!/usr/bin/env groovy

def call(Closure body){
    node('Publish'){
        echo 'Inside publish node........................'
    }
    echo 'Calling Publish'
}