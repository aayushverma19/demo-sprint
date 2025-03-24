package org.template

import org.commom.cleanWS
import org.commom.gitclone
import org.generic.credScanning
import org.java.codeCompile
import org.java.unitTesting

def call (String reportName, String branch, String repoUrl, String gitPassword ){

  clean = new cleanWS()
  clone = new gitclone()
  gitleaks = new credScanning()
  compile = new codeCompile()
  unit = new unitTesting()

  
  clean.call()
  clone.call(branch, repoUrl, gitPassword)
  gitleaks.call(reportName)
  compile.call()
  unit.call()
  
}

  
