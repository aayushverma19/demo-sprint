package org.java
def call() {
  stage('Compile') {
    sh 'mvn clean compile'
  }
}
