package org.credScanning

def call(String reportName) {
    stage ('Cred Scanning'){
        sh "gitleaks detect -r ${reportName}"
    }
   // archiveArtifacts artifacts: reportName, fingerprint: true
}
