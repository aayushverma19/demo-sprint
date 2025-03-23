def call(String zapUrl, String zapReport) {
  stage ('DAST') {
         script {
             sh "zap.sh -cmd -quickurl ${zapUrl} -quickprogress -port 8091 -quickout ${zapReport}"
          }
      }
  }
