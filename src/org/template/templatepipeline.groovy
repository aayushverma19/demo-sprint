package org.template

import org.common.*
import org.Java.* 
//import org.Java.codeCompile

def call (String branch, String repoUrl, String gitPassword){
  clean = new cleanWS()
  clone = new gitclone()
  compile = new codeCompile()
  unit = new unitTesting()

  clean.call()
  clone.call(branch, repoUrl, gitPassword)
  compile.call()
  unit.call()

  
}

// import org.Java.unitTesting
// def call () {
//   unit = new unitTesting()
//   unit.call()
// }
