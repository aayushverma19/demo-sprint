package org.ansibleCI

def call (String taskFile_path){
    stage('Security Check'){
                    script {
                        catchError(buildResult: 'SUCCESS') {
                        sh "${HOME}/.local/bin/ansible-later ${taskFile_path} 2>&1 | tee Report-security.txt"
                  }
            }
      }
}
