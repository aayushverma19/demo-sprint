package org.common
def cloneRepo(String branch , String repoUrl, String gitPassword) {
        stage('Clone Repo'){
            checkout([$class: 'GitSCM',
                branches: [[name: "*/${branch}"]],
                userRemoteConfigs: [[url: repoUrl , credentialsId: gitPassword ]]
              ])
        }
}
