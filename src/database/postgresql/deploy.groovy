package database.postgresql

def ancibleExecute(String inventory_path, String playbook_path, String key_path){
 // sh "ansible-playbook -i ${inventory_path} ${playbook_path} --private-key=${key_path} -u ubuntu"
  sh "ansible-playbook -i inventory_path playbook_path --private-key=key_path -u ubuntu"
}
