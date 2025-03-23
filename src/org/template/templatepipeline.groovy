package org.template

import org.common.*
import org.genericCI.*
import org.java.* 
//import org.Java.codeCompile

def call (String reportName, String branch, String repoUrl, String gitPassword){
  clean = new cleanWS()
  clone = new gitclone()
  gitleaks = new credScanning()
  lScanning = new licenseScanning()
  compile = new codeCompile()
  unit = new unitTesting()
  dependency = new dependencyScan()

  
  clean.call()
  clone.call(branch, repoUrl, gitPassword)
  gitleaks.call(reportName)
  //lScanning.call()
  compile.call()
  unit.call()
  dependency.call()

}
