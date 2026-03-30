pipeline {
    agent any

    stages {
        stage('Checkout') {
            steps {
                git branch: 'master', url: 'https://github.com/Ahmed-Fawzy-Tester/demoblaze-automation.git'
            }
        }

        stage('Build & Run with Docker Compose') {
            steps {
                sh 'docker-compose down || true'
                sh 'docker-compose up --build --abort-on-container-exit'
            }
        }
    }

    post {
        always {
            sh 'docker-compose down || true'
        }
    }
}