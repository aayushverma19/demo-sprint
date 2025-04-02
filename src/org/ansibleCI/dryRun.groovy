package org.ansibleCI

def call (String inventory_path, String playbook_path, String key_path, String user_name ){
  stage('Dry Run'){

                script {
                    catchError(buildResult: 'SUCCESS') {
                        sh "ANSIBLE_HOST_KEY_CHECKING=False ansible-playbook -C -D -i ${inventory_path} ${playbook_path} --private-key=${key_path} -u ${user_name}  > Report-dry-run.txt"
                }
            }
      }
  
  }
//ANSIBLE_HOST_KEY_CHECKING=False 
