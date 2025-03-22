package org.Java
def call() {
    stage ('Unit Test'){
        sh 'mvn clean test jacoco:report | tee unit-test-report.txt'
    }
}
