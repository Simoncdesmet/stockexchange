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
                junit allowEmptyResults: true, keepLongStdio: true, testResults: 'testResults/*.xml'        }


        stages ('archive') {
            steps {
            archiveArtifacts allowEmptyArchive: true, artifacts: 'cli-1.0-SNAPSHOT-jar-with-dependencies.jar'
            }
        }
    }

}
