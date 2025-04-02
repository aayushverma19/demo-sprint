def call (String playbook_path){
    stage('Security Check'){
                steps {
                    script {
                        catchError(buildResult: 'SUCCESS') {
                        sh "ansible-later ${playbook_path} 2>&1 | tee Report-security.txt"
                        }
                  }
            }
      }
}
