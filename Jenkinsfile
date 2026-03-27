pipeline {
    agent any

    tools {
        maven 'Maven3'
    }

    stages {
        stage('Checkout') {
            steps {
                git branch: 'master', url: 'https://github.com/Ahmed-Fawzy-Tester/demoblaze-automation.git'
            }
        }

        stage('Check Tools') {
            steps {
                sh 'git --version'
                sh 'java -version'
                sh 'mvn -version'
            }
        }

        stage('Build & Test') {
            steps {
                sh 'mvn clean test'
            }
        }
    }
}
