package org.common
def cloneRepo(String branch , String repoUrl, String gitPassword) {
        stage('Clone Repo'){
            script {
                    withCredentials([string(credentialsId: "${credentials_Id}", variable: 'TOKEN')]) {
                
                        sh """
                         git clone --branch ${version} --depth 1 https://${user_name}:${TOKEN}@github.com/snaatak-Zero-Downtime-Crew/demofortag.git
                        """
                    }
                }
        }
}
