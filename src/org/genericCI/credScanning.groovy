def call(String reportName) {
    sh "gitleaks detect -r ${reportName}"
    archiveArtifacts artifacts: reportName, fingerprint: true
}
