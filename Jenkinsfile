pipeline {
    agent any

    stages {

        stage('Checkout') {
            steps {
                git 'https://github.com/Ahmed-Fawzy-Tester/demoblaze-automation.git'
            }
        }

        stage('Build & Test') {
            steps {
                bat 'mvn clean test'
            }
        }
    }
}
