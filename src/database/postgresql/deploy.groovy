package database.postgresql

def call(String inventory_path, String playbook_path, String key_path){
  stage ('Deploy') {
    
    sh "ansible-playbook -i ${inventory_path} ${playbook_path} --private-key=${key_path} -u ubuntu"
   // sh "ansible-playbook -i inventory_path playbook_path --private-key=key_path -u ubuntu"
  }
}
