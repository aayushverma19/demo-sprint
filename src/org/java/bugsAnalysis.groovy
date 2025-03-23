package org.java
def call(String bugprojectKey, String sonar_token ) {
  stage ('Bugs Analysis')
    withSonarQubeEnv('sonar') { 
        withCredentials([string(credentialsId: sonar_token, variable: 'SONARQUBE_TOKEN')]) {
            sh """
            mvn clean verify sonar:sonar \
                    -Dsonar.projectKey=${bugprojectKey} \
                    -Dsonar.token=${SONARQUBE_TOKEN}
            """
        }
    }
}
