package org.genericCI

def call(String reportName) {
    stage ('Cred Scanning'){
        sh 'mkdir allreports'
        sh "gitleaks detect -f json -r allreports/${reportName}.json"
    }
   // archiveArtifacts artifacts: reportName, fingerprint: true
}
