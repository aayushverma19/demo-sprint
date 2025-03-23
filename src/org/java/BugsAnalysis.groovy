def call(String projectKey, String credentialsId ) {
  stage ('bug')
    withSonarQubeEnv('sonar') { 
        withCredentials([string(credentialsId: credentialsId, variable: 'SONARQUBE_TOKEN')]) {
            sh """
            mvn clean verify sonar:sonar \
                    -Dsonar.projectKey=${projectKey} \
                    -Dsonar.token=${SONARQUBE_TOKEN}
            """
        }
    }
}
