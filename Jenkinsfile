pipeline {
    agent any

    tools {
        jdk 'jdk-12.0.2'
    }

    stages {
        stage('cli-test') {
            steps {
                bat 'mvn clean test'
            }
        }
    }
}
