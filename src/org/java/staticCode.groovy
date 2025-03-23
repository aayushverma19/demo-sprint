package org.java
def call(String staticprojectKey, String sonar_token ) {
  stage ('Static Code Analysis')
    withSonarQubeEnv('sonar') { 
        withCredentials([string(credentialsId: sonar_token, variable: 'SONARQUBE_TOKEN')]) {
            sh """
            mvn clean verify sonar:sonar \
                    -Dsonar.projectKey=${staticprojectKey} \
                    -Dsonar.token=${SONARQUBE_TOKEN}
            """
        }
    }
}
