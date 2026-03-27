pipeline {
    agent any

    stages {
        stage('Checkout') {
            steps {
                git branch: 'master', url: 'https://github.com/Ahmed-Fawzy-Tester/demoblaze-automation.git'
            }
        }

        stage('Build & Test') {
            agent {
                docker {
                    image 'maven:3.9.9-eclipse-temurin-21'
                    args '-v $HOME/.m2:/root/.m2'
                }
            }
            steps {
                sh 'mvn -version'
                sh 'mvn clean test'
            }
        }
    }
}