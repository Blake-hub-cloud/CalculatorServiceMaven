pipeline {
    agent any
    tools {
        maven 'maven_3_6_0'
    }
    stages {
        stage('Build') {
            steps {
                sh 'mvn package'
            }
        }
    }
}