package org.java
def call(String bugprojectKey, String credentialsId ) {
  stage ('Bugs Analysis')
    withSonarQubeEnv('sonar') { 
        withCredentials([string(credentialsId: credentialsId, variable: 'SONARQUBE_TOKEN')]) {
            sh """
            mvn clean verify sonar:sonar \
                    -Dsonar.projectKey=${bugprojectKey} \
                    -Dsonar.token=${SONARQUBE_TOKEN}
            """
        }
    }
}
