pipeline {
    agent any

    stages {
        stage('Checkout') {
            steps {
                git branch: 'main', url: 'https://github.com/Ahmed-Fawzy-Tester/demoblaze-automation.git'
            }
        }

        stage('Check Tools') {
            steps {
                sh 'git --version || true'
                sh 'java -version || true'
                sh 'mvn -version || true'
            }
        }

        stage('Build & Test') {
            steps {
                sh 'mvn clean test'
            }
        }
    }
}