@Library('my-shared-gry-lib')_

pipeline {
    agent any
    stages {
        stage('Build') {
            steps {
                echo 'Hi, GeekFlare. Starting to build the App.'
                FirstJob('Sample')
            }
        }
        stage('Test') {
            steps {
                echo 'Testing going on'
            }
        }
        stage('Deploy') {
            parallel {
                stage('Deploy start ') {
                    steps {
                        echo "Start the deploy .."
                    }
                }
                stage('Deploying now') {
                    steps {
                        echo "Docker Created"
                    }
                }
            }
        }
        stage('Prod') {
            steps {
                echo "App is Prod Ready"
                Publish {
                    echo 'body of Publish starts'
                    echo 'body of Publish ends'
                }
            }
        }

    }
}
