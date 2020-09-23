pipeline {
    agent any
    stages {
        stage('Build') {
            steps {
                git 'https://github.com/Blake-hub-cloud/CalculatorServiceMaven.git'
                withMaven(maven : 'maven_3_6_0')
                bat 'mvn deploy'
            }
        }
        stage('Test') {
            steps {
                git 'https://github.com/Blake-hub-cloud/CalculatorServiceMaven.git'
                withMaven(maven : 'maven_3_6_0')
                bat 'mvn deploy'
            }
        }
        stage('Deploy') {
            steps {
                git 'https://github.com/Blake-hub-cloud/CalculatorServiceMaven.git'
                withMaven(maven : 'maven_3_6_0')
                bat 'mvn deploy'
            }
        }
    }
}