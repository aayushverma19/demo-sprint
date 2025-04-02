package org.ansibleCI

def call (String taskFile_path) {
  stage('YAML Syntax Check') {
              script {
                  catchError(buildResult: 'SUCCESS') {
                      sh "yamllint ${taskFile_path} > Report-yamllint.txt"
              }
          }
      }
  }
