package database.common
def call(String credentials_Id, String version, String user_name) {
        stage('Clone Repo'){
            script {
                    withCredentials([string(credentialsId: "${credentials_Id}", variable: 'TOKEN')]) {
                
                        sh """
                         git clone --branch ${version} --depth 1 https://${user_name}:${TOKEN}@github.com/snaatak-Zero-Downtime-Crew/ansible.git
                        """
                    }
                }
        }
}
