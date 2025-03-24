package org.template

import org.commom.*
import org.generic.*
import org.java.*
//import org.java.codeCompile

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

  
