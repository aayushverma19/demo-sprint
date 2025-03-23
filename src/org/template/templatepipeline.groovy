package org.template

import org.common.*
import org.genericCI.*
import org.java.* 
//import org.Java.codeCompile

def call (String reportName, String branch, String repoUrl, String gitPassword, String zapUrl, String zapReport, 
          String bugprojectKey, String credentialsId, String staticprojectKey){
          
  clean = new cleanWS()
  clone = new gitclone()
  gitleaks = new credScanning()
  lScanning = new licenseScanning()
  compile = new codeCompile()
  bug = new BugsAnalysis()
  unit = new unitTesting()
  dependency = new dependencyScan()
  staticode = new staticCode()
  DASTcheck = new dast()

  
  clean.call()
  clone.call(branch, repoUrl, gitPassword)
  gitleaks.call(reportName)
  //lScanning.call()
  compile.call()
  bug.call()
  unit.call()
  //dependency.call()
  staticode.call()
  DASTcheck.call()
  

}
