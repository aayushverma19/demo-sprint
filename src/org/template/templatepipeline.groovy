package org.template

import org.common.*
import org.genericCI.*
import org.java.* 
//import org.Java.codeCompile

def call (String reportName, String branch, String repoUrl, String gitPassword, String zapUrl, String zapReport, 
          String bugprojectKey, String sonar_token, String staticprojectKey, String project_api_key, String reportFile){
          
  clean = new cleanWS()
  clone = new gitclone()
  gitleaks = new credScanning()
  lScanning = new licenseScanning()
  compile = new codeCompile()
  bug = new bugsAnalysis()
  unit = new unitTesting()
  dependency = new dependencyScan()
  staticode = new staticCode()
  DASTcheck = new dast()

  
  clean.call()
  clone.call(branch, repoUrl, gitPassword)
  gitleaks.call(reportName)
  //lScanning.call(project_api_key, reportFile)
  compile.call()
  bug.call(bugprojectKey, sonar_token)
  unit.call()
  //dependency.call()
  staticode.call(staticprojectKey, sonar_token)
  DASTcheck.call(zapUrl, zapReport)
  

}
