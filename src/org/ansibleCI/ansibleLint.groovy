package org.ansibleCI

def call (String playbook_path){
      stage('Ansible Lint'){
                 script {
                    catchError(buildResult: 'SUCCESS') {
                        sh "ansible-lint ${playbook_path} > Report-ansible-lint.txt"
                 }
            }
        }
}
