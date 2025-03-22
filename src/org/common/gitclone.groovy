package org.common
def call(String branch , String repoUrl, String gitPassword='' ) {
        stage('Clone Repo'){
            checkout([$class: 'GitSCM',
                branches: [[name: "*/${branch}"]],
                userRemoteConfigs: [[url: repoUrl , credentialsId: gitPassword ]]
              ])
        }
}
