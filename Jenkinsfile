pipeline {
    agent any

    stages {
        stage('Build') {
            steps {
                // Run Maven package to build the WAR file
                // Use 'mvn' directly if it's in the PATH, or configure a tool in Jenkins
                sh 'mvn clean package' 
            }
        }
        stage('Test') {
            steps {
                // Run Maven test to execute TestNG tests
                sh 'mvn test'
            }
        }
    }
    
    post {
        always {
             // Archive artifacts (like the WAR file and test results)
             archiveArtifacts artifacts: 'target/*.war', fingerprint: true
             junit 'target/surefire-reports/*.xml'
        }
    }
}
