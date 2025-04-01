package org.common
def cloneRepo(String branch , String repoUrl, String credentials_Id, String version, String user_name) {
        stage('Clone Repo'){
            script {
                    withCredentials([string(credentialsId: "${credentials_Id}", variable: 'TOKEN')]) {
                
                        sh """
                         git clone --branch ${version} --depth 1 https://${user_name}:${TOKEN}@github.com/snaatak-Zero-Downtime-Crew/tagdemo.git
                        """
                    }
                }
        }
}
