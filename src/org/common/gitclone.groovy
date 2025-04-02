package org.common

def call(String branch_name, String repo_url, String git_password)

stage('Clone Repo') {
          steps {
              checkout([$class: 'GitSCM',
                  branches: [[name: "*/${env.branch_name}"]],
                  userRemoteConfigs: [[url: env.repo_url, credentialsId: env.git_password]]
              ])
          }
      }
