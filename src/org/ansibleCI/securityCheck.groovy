package org.ansibleCI

def call (String playbook_path){
    stage('Security Check'){
                    script {
                        catchError(buildResult: 'SUCCESS') {
                        sh "/var/lib/jenkins/.local/bin/ansible-later ${playbook_path} 2>&1 | tee Report-security.txt"
                  }
            }
      }
}
