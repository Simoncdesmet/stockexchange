pipeline {
    agent any

    tools {
        jdk 'jdk-12.0.2'
    }

    stages {
            stage('build') {
                steps {
                    bat 'mvn clean test-compile'
                }
            }
        stage('test') {
            steps {
                bat 'mvn test'
}

        stage ('publish-test-results') {
            steps {
            archiveArtifacts allowEmptyArchive: true, artifacts: 'cli/**/*.jar'
            }
        }
    }

}
