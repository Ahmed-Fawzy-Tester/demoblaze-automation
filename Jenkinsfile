pipeline {
    agent any

    stages {

        stage('Checkout') {
            steps {
                git 'https://github.com/Ahmed-Fawzy-Tester/demoblaze-automation.git'
            }
        }

        stage('Build') {
            steps {
                bat 'mvn clean install -DskipTests'
            }
        }

        stage('Run Tests (Docker Grid)') {
            steps {
                bat 'docker-compose down'
                bat 'docker-compose up --build'
            }
        }
    }
}