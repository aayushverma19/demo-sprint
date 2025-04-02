package org.ansibleCI

def call (String taskFile_path){
      stage('Ansible Lint'){
                 script {
                    catchError(buildResult: 'SUCCESS') {
                        sh "ansible-lint ${taskFile_path} > Report-ansible-lint.txt"
                 }
            }
        }
}
