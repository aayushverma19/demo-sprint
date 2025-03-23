package org.java
def call(String staticprojectKey, String credentialsId ) {
  stage ('Static Code Analysis')
    withSonarQubeEnv('sonar') { 
        withCredentials([string(credentialsId: credentialsId, variable: 'SONARQUBE_TOKEN')]) {
            sh """
            mvn clean verify sonar:sonar \
                    -Dsonar.projectKey=${staticprojectKey} \
                    -Dsonar.token=${SONARQUBE_TOKEN}
            """
        }
    }
}
