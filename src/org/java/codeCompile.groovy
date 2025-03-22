package org.Java
def call() {
  stage('Compile') {
    sh 'mvn clean compile'
  }
}
