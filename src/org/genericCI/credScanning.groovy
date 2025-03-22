package org.genericCI

def call(String reportName) {
    stage ('Cred Scanning'){
        sh "gitleaks detect -f json -r allreports/${reportName}.json"
    }
   // archiveArtifacts artifacts: reportName, fingerprint: true
}
