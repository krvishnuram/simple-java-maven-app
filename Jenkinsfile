
pipeline {
    agent  any
    stages {
        stage('Build') { 
            steps {
                echo "Building test ${env.BUILD_ID}"
		checkout scm
		sh 'mvn -B -DskipTests clean package' 
            }
        }
		stage('Test') { 
            steps {
                sh 'mvn test' 
            }
            post {
                always {
                    junit 'target/surefire-reports/*.xml' 
                }
            }
        }
		stage('Deliver'){
		steps {
                sh './jenkins/scripts/deliver.sh' 
            }
		
		}
		
    }
}
