package org.genericCI
def call(String project_api_key) {
  stage ('License Scanning') {
        withCredentials([string(credentialsId: 'project_api_key', variable: 'FOSSA_KEY')]) { 
          sh """
            export FOSSA_API_KEY=${FOSSA_KEY}
            fossa analyze
            fossa report --format html attribution >${reportFile}
          """
        }
    }
}
