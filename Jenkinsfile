pipeline {
    agent any

    stages {
        stage('Build') {
            steps {
                git 'https://github.com/Blake-hub-cloud/CalculatorServiceMaven.git'
                withMaven(maven : 'maven_3_6_0')
                sh 'mvn clean compile'
            }
        }
        stage('Test') {
            steps {
                git 'https://github.com/Blake-hub-cloud/CalculatorServiceMaven.git'
                withMaven(maven : 'maven_3_6_0')
                sh 'mvn test'
            }
        }
        stage('Deploy') {
            steps {
                git 'https://github.com/Blake-hub-cloud/CalculatorServiceMaven.git'
                withMaven(maven : 'maven_3_6_0')
                sh 'mvn deploy'
            }
        }
    }
}