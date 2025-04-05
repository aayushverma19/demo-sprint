folder('POC') {
     displayName('POC')
 }
 folder('POC/CI-Checks') {
     displayName('CI-Checks')
 }
folder('POC/CI-Checks/Generic') {
    displayName('Generic')
}
folder('POC/CI-Checks/Applications') {
    displayName('Applications')
}
folder('POC/CI-Checks/Applications/Declarative') {
    displayName('Declarative')
}
folder('POC/CI-Checks/Generic/Declarative') {
    displayName('Declarative')
}
folder('POC/CI-Checks/Generic/Scripted') {
    displayName('Scripted')
}
folder('POC/CI-Checks/Generic/Shared-Library') {
    displayName('Shared-Library')
}
folder('POC/CI-Checks/Applications/Declarative/Java') {
    displayName('Java')
}
folder('POC/CI-Checks/Applications/Scripted') {
    displayName('Scripted')
}
folder('POC/CI-Checks/Applications/Scripted/Java') {
    displayName('Java')
}
folder('POC/CI-Checks/Applications/Shared-Library') {
    displayName('Shared-Library')
}
folder('POC/CI-Checks/Applications/Shared-Library/Java') {
    displayName('Java')
}
folder('POC/CI-Checks/Applications/Declarative/Python') {
    displayName('Python')
}
folder('POC/CI-Checks/Applications/Scripted/Python') {
    displayName('Python')
}
folder('POC/CI-Checks/Applications/Shared-Library/Python') {
    displayName('Python')
}

pipelineJob('POC/CI-Checks/Generic/Declarative/Cred-Scanning') {
    definition {
        cpsScm {
            scm {
                git {
                    remote {
                        url('https://github.com/snaatak-Zero-Downtime-Crew/jenkins.git')
                        credentials('git-cred') 
                    }
                    branch('*/main') 
                }
            }
            scriptPath('CI/Generic/Declarative/Cred Scanning/Jenkinsfile')
        }
    }
}

pipelineJob('POC/CI-Checks/Generic/Declarative/License-Scanning') {
    definition {
        cpsScm {
            scm {
                git {
                    remote {
                        url('https://github.com/snaatak-Zero-Downtime-Crew/jenkins.git')
                        credentials('git-cred') 
                    }
                    branch('*/Rohit-SCRUM-129') 
                }
            }
            scriptPath('CI/Generic/Declarative/License Scanning/Jenkinsfile')
        }
    }
}

pipelineJob('POC/CI-Checks/Generic/Declarative/Notificaiton') {
    definition {
        cpsScm {
            scm {
                git {
                    remote {
                        url('https://github.com/snaatak-Zero-Downtime-Crew/jenkins.git')
                        credentials('git-cred') 
                    }
                    branch('*/main') 
                }
            }
            scriptPath('CI/Generic/Declarative/Notification/Jenkinsfile')
        }
    }
}

pipelineJob('POC/CI-Checks/Generic/Declarative/AMI') {
    definition {
        cpsScm {
            scm {
                git {
                    remote {
                        url('https://github.com/snaatak-Zero-Downtime-Crew/jenkins.git')
                        credentials('git-cred') 
                    }
                    branch('*/Pravesh-SCRUM-131') 
                }
            }
            scriptPath('CI/Generic/Declarative/AMI/Jenkinsfile')
        }
    }
}

pipelineJob('POC/CI-Checks/Generic/Declarative/Commit-Sign-off') {
    definition {
        cpsScm {
            scm {
                git {
                    remote {
                        url('https://github.com/snaatak-Zero-Downtime-Crew/jenkins.git')
                        credentials('git-cred') 
                    }
                    branch('*/main') 
                }
            }
            scriptPath('CI Implementation/Declarative Pipeline/Generic/Commit Sign-off/Jenkinsfile')
        }
    }
}

pipelineJob('POC/CI-Checks/Generic/Scripted/Cred-Scanning') {
    definition {
        cpsScm {
            scm {
                git {
                    remote {
                        url('https://github.com/snaatak-Zero-Downtime-Crew/jenkins.git')
                        credentials('git-cred') 
                    }
                    branch('*/Nikita-SCRUM-133') 
                }
            }
            scriptPath('CI/Generic/Scripted/Cred Scanning/Jenkinsfile')
        }
    }
}

pipelineJob('POC/CI-Checks/Generic/Scripted/License-Scanning') {
    definition {
        cpsScm {
            scm {
                git {
                    remote {
                        url('https://github.com/snaatak-Zero-Downtime-Crew/jenkins.git')
                        credentials('git-cred') 
                    }
                    branch('*/Mohit-SCRUM-134') 
                }
            }
            scriptPath('CI/Generic/Scripted/License Scanning/Jenkinsfile')
        }
    }
}


pipelineJob('POC/CI-Checks/Generic/Scripted/Notificaiton') {
    definition {
        cpsScm {
            scm {
                git {
                    remote {
                        url('https://github.com/snaatak-Zero-Downtime-Crew/jenkins.git')
                        credentials('git-cred') 
                    }
                    branch('*/Anuj-SCRUM-135') 
                }
            }
            scriptPath('CI/Generic/Scripted/Notification/Jenkinsfile')
        }
    }
}


pipelineJob('POC/CI-Checks/Generic/Scripted/AMI') {
    definition {
        cpsScm {
            scm {
                git {
                    remote {
                        url('https://github.com/snaatak-Zero-Downtime-Crew/jenkins.git')
                        credentials('git-cred') 
                    }
                    branch('*/main') 
                }
            }
            scriptPath('CI/Generic/Scripted/AMI/Jenkinsfile')
        }
    }
}


pipelineJob('POC/CI-Checks/Generic/Scripted/Commit-Sign-off') {
    definition {
        cpsScm {
            scm {
                git {
                    remote {
                        url('https://github.com/snaatak-Zero-Downtime-Crew/jenkins.git')
                        credentials('git-cred') 
                    }
                    branch('*/main') 
                }
            }
            scriptPath('CI Implementation/Scripted Pipeline/Generic/Commit Sign-off/JenkinsFile')
        }
    }
}

pipelineJob('POC/CI-Checks/Generic/Scripted/AMI') {
    definition {
        cpsScm {
            scm {
                git {
                    remote {
                        url('https://github.com/snaatak-Zero-Downtime-Crew/jenkins.git')
                        credentials('git-cred') 
                    }
                    branch('*/main') 
                }
            }
            scriptPath('CI/Generic/Scripted/AMI/Jenkinsfile')
        }
    }
}

pipelineJob('POC/CI-Checks/Generic/Shared-Library/Cred-Scanning') {
    definition {
        cpsScm {
            scm {
                git {
                    remote {
                        url('https://github.com/snaatak-Zero-Downtime-Crew/jenkins.git')
                        credentials('git-cred') 
                    }
                    branch('*/Rohit-SCRUM-138') 
                }
            }
            scriptPath('Shared_Library/CI/Generic/Credentials_ Scanning/Jenkinsfile')
        }
    }
}
pipelineJob('POC/CI-Checks/Generic/Shared-Library/Licence-Scanning ') {
    definition {
        cpsScm {
            scm {
                git {
                    remote {
                        url('https://github.com/snaatak-Zero-Downtime-Crew/jenkins.git')
                        credentials('git-cred') 
                    }
                    branch('*/Ramratan-SCRUM-139') 
                }
            }
            scriptPath('jenkinsfile')
        }
    }
}

pipelineJob('POC/CI-Checks/Generic/Shared-Library/Notificaiton') {
    definition {
        cpsScm {
            scm {
                git {
                    remote {
                        url('https://github.com/snaatak-Zero-Downtime-Crew/jenkins.git')
                        credentials('git-cred') 
                    }
                    branch('*/Pravesh-SCRUM-140') 
                }
            }
            scriptPath('CI/Generic/shared-library/Notificaiton/Jenkinsfile')
        }
    }
}

pipelineJob('POC/CI-Checks/Generic/Shared-Library/AMI') {
    definition {
        cpsScm {
            scm {
                git {
                    remote {
                        url('https://github.com/snaatak-Zero-Downtime-Crew/jenkins.git')
                        credentials('git-cred') 
                    }
                    branch('*/main') 
                }
            }
            scriptPath('CI/Generic/shared-library/AMI/Jenkinsfile')
        }
    }
}

pipelineJob('POC/CI-Checks/Generic/Shared-Library/Commit-Sign-off') {
    definition {
        cpsScm {
            scm {
                git {
                    remote {
                        url('https://github.com/snaatak-Zero-Downtime-Crew/jenkins.git')
                        credentials('git-cred') 
                    }
                    branch('*/Nikita-SCRUM-142') 
                }
            }
            scriptPath('CI/Generic/Shared Library/Commit Sign off/Jenkinsfile')
        }
    }
}
//CI/Application/Declarative/Java/Code Compilation/Jenkinsfile

pipelineJob('POC/CI-Checks/Applications/Declarative/Java/Code-Compilation') {
    definition {
        cpsScm {
            scm {
                git {
                    remote {
                        url('https://github.com/snaatak-Zero-Downtime-Crew/jenkins.git')
                        credentials('git-cred') 
                    }
                    branch('*/Mohit-SCRUM-143') 
                }
            }
            scriptPath('CI/Application/Declarative/Java/Code Compilation/Jenkinsfile')
        }
    }
}

pipelineJob('POC/CI-Checks/Applications/Declarative/Java/Static-Code-Analysis') {
    definition {
        cpsScm {
            scm {
                git {
                    remote {
                        url('https://github.com/snaatak-Zero-Downtime-Crew/jenkins.git')
                        credentials('git-cred') 
                    }
                    branch('*/Anuj-SCRUM-144') 
                }
            }
            scriptPath('CI/Application/Declarative/Java/Static Code Analysis/JenkinsFile')
        }
    }
}


pipelineJob('POC/CI-Checks/Applications/Declarative/Java/Bugs-Analysis') {
    definition {
        cpsScm {
            scm {
                git {
                    remote {
                        url('https://github.com/snaatak-Zero-Downtime-Crew/jenkins.git')
                        credentials('git-cred') 
                    }
                    branch('*/Aayush-SCRUM-145') 
                }
            }
            scriptPath('CI/Application/Declarative/Java/Bugs Analysis/Jenkinsfile')
        }
    }
}


pipelineJob('POC/CI-Checks/Applications/Declarative/Java/Unit-Testing') {
    definition {
        cpsScm {
            scm {
                git {
                    remote {
                        url('https://github.com/snaatak-Zero-Downtime-Crew/jenkins.git')
                        credentials('git-cred') 
                    }
                    branch('*/Pravesh-SCRUM-146') 
                }
            }
            scriptPath('CI/Application/Declarative/Java/Unit_Testing/Jenkinsfile')
        }
    }
}


pipelineJob('POC/CI-Checks/Applications/Declarative/Java/DAST') {
    definition {
        cpsScm {
            scm {
                git {
                    remote {
                        url('https://github.com/snaatak-Zero-Downtime-Crew/jenkins.git')
                        credentials('git-cred') 
                    }
                    branch('*/Aayush-SCRUM-147') 
                }
            }
            scriptPath('CI/Application/Declarative/Java/DAST/Jenkinsfile')
        }
    }
}
pipelineJob('POC/CI-Checks/Applications/Declarative/Java/Dependency-Scanning') {
    definition {
        cpsScm {
            scm {
                git {
                    remote {
                        url('https://github.com/snaatak-Zero-Downtime-Crew/jenkins.git')
                        credentials('git-cred') 
                    }
                    branch('*/Nikita-SCRUM-148') 
                }
            }
            scriptPath('CI/Application/Declarative/Java/Dependency scanning/Jenkinsfile')
        }
    }
}

pipelineJob('POC/CI-Checks/Applications/Scripted/Java/Code-compilation') {
    definition {
        cpsScm {
            scm {
                git {
                    remote {
                        url('https://github.com/snaatak-Zero-Downtime-Crew/jenkins.git')
                        credentials('git-cred') 
                    }
                    branch('*/Mohit-SCRUM-149') 
                }
            }
            scriptPath('CI/Application/Scripted/Java/Code Compilation/Jenkinsfile')
        }
    }
}

pipelineJob('POC/CI-Checks/Applications/Scripted/Java/Static-Code-Analysis') {
    definition {
        cpsScm {
            scm {
                git {
                    remote {
                        url('https://github.com/snaatak-Zero-Downtime-Crew/jenkins.git')
                        credentials('git-cred') 
                    }
                    branch('*/main') 
                }
            }
            scriptPath('CI/Application/Scripted/Java/Static Code Analysis/Jenkinsfile')
        }
    }
}

pipelineJob('POC/CI-Checks/Applications/Scripted/Java/Bugs-Analysis') {
    definition {
        cpsScm {
            scm {
                git {
                    remote {
                        url('https://github.com/snaatak-Zero-Downtime-Crew/jenkins.git')
                        credentials('git-cred') 
                    }
                    branch('*/Rohit-SCRUM-151') 
                }
            }
            scriptPath('CI/Application/Scripted/Java/Bug Analysis/Jenkinsfile')
        }
    }
}

pipelineJob('POC/CI-Checks/Applications/Scripted/Java/Unit-Testing') {
    definition {
        cpsScm {
            scm {
                git {
                    remote {
                        url('https://github.com/snaatak-Zero-Downtime-Crew/jenkins.git')
                        credentials('git-cred') 
                    }
                    branch('*/main') 
                }
            }
            scriptPath('CI/Application/Scripted/Java/Unit Testing/Jenkinsfile')
        }
    }
}

pipelineJob('POC/CI-Checks/Applications/Scripted/Java/DAST') {
    definition {
        cpsScm {
            scm {
                git {
                    remote {
                        url('https://github.com/snaatak-Zero-Downtime-Crew/jenkins.git')
                        credentials('git-cred') 
                    }
                    branch('*/Pravesh-SCRUM-153') 
                }
            }
            scriptPath('CI/Application/Scripted/Java/DAST/Jenkinsfile')
        }
    }
}

pipelineJob('POC/CI-Checks/Applications/Scripted/Java/Dependency-Scanning') {
    definition {
        cpsScm {
            scm {
                git {
                    remote {
                        url('https://github.com/snaatak-Zero-Downtime-Crew/jenkins.git')
                        credentials('git-cred') 
                    }
                    branch('*/main') 
                }
            }
            scriptPath('CI/Application/Scripted/Java /Dependency scanning/Jenkinsfile')
        }
    }
}

pipelineJob('POC/CI-Checks/Applications/Shared-Library/Java/Code-compilation') {
    definition {
        cpsScm {
            scm {
                git {
                    remote {
                        url('https://github.com/snaatak-Zero-Downtime-Crew/jenkins.git')
                        credentials('git-cred') 
                    }
                    branch('*/Nikita-SCRUM-155') 
                }
            }
            scriptPath('CI/Application/Shared Library/Java/Code compilation/Jenkinsfile')
        }
    }
}

pipelineJob('POC/CI-Checks/Applications/Shared-Library/Java/Static-Code-Analysis') {
    definition {
        cpsScm {
            scm {
                git {
                    remote {
                        url('https://github.com/snaatak-Zero-Downtime-Crew/jenkins.git')
                        credentials('git-cred') 
                    }
                    branch('*/Mohit-SCRUM-156') 
                }
            }
            scriptPath('CI/Application/Shared Library/Java/Static Code Analysis/Jenkinsfile')
        }
    }
}


pipelineJob('POC/CI-Checks/Applications/Shared-Library/Java/Bugs-Analysis') {
    definition {
        cpsScm {
            scm {
                git {
                    remote {
                        url('https://github.com/snaatak-Zero-Downtime-Crew/shared-library.git')
                        credentials('git-cred') 
                    }
                    branch('*/Anuj-Scrum-157') 
                }
            }
            scriptPath('jenkinsfile')
        }
    }
}


pipelineJob('POC/CI-Checks/Applications/Shared-Library/Java/Unit-Testing') {
    definition {
        cpsScm {
            scm {
                git {
                    remote {
                        url('https://github.com/snaatak-Zero-Downtime-Crew/jenkins.git')
                        credentials('git-cred') 
                    }
                    branch('*/Aayush-SCRUM-158') 
                }
            }
            scriptPath('CI/Application/Shared Library/Java/Unit Testing/Jenkinsfile')
        }
    }
}

pipelineJob('POC/CI-Checks/Applications/Shared-Library/Java/DAST') {
    definition {
        cpsScm {
            scm {
                git {
                    remote {
                        url('https://github.com/snaatak-Zero-Downtime-Crew/jenkins.git')
                        credentials('git-cred') 
                    }
                    branch('*/main') 
                }
            }
            scriptPath('CI/Application/Shared Library/Java/DAST/Jenkinsfile')
        }
    }
}

pipelineJob('POC/CI-Checks/Applications/Shared-Library/Java/Dependency-Scanning') {
    definition {
        cpsScm {
            scm {
                git {
                    remote {
                        url('https://github.com/snaatak-Zero-Downtime-Crew/shared-library.git')
                        credentials('git-cred') 
                    }
                    branch('*/Rohit-SCRUM-160') 
                }
            }
            scriptPath('Jenkinsfile')
        }
    }
}


//check complete


//POC/CI-Checks/Applications/Declarative/Python

pipelineJob('POC/CI-Checks/Applications/Declarative/Python/Code-Coverage') {
    definition {
        cpsScm {
            scm {
                git {
                    remote {
                        url('https://github.com/snaatak-Zero-Downtime-Crew/jenkins.git')
                        credentials('git-cred') 
                    }
                    branch('*/main') 
                }
            }
            scriptPath('CI/Application/Declarative/Python/Code coverage/Jenkins') //####################### check
        }
    }
}

pipelineJob('POC/CI-Checks/Applications/Declarative/Python/Static-Code-Analysis') {
    definition {
        cpsScm {
            scm {
                git {
                    remote {
                        url('https://github.com/snaatak-Zero-Downtime-Crew/jenkins.git')
                        credentials('git-cred') 
                    }
                    branch('*/main') 
                }
            }
            scriptPath('CI/Application/Declarative/Python/Static Code Analysis/Jenkinsfile') 
        }
    }
}

pipelineJob('POC/CI-Checks/Applications/Declarative/Python/Bugs-Analysis') {
    definition {
        cpsScm {
            scm {
                git {
                    remote {
                        url('https://github.com/snaatak-Zero-Downtime-Crew/jenkins.git')
                        credentials('git-cred') 
                    }
                    branch('*/main') 
                }
            }
            scriptPath('CI/Application/Declerative/Python/Bug analysis/Jenkinsfile') 
        }
    }
}

pipelineJob('POC/CI-Checks/Applications/Declarative/Python/Unit-Testing') {
    definition {
        cpsScm {
            scm {
                git {
                    remote {
                        url('https://github.com/snaatak-Zero-Downtime-Crew/jenkins.git')
                        credentials('git-cred') 
                    }
                    branch('*/Nikita-SCRUM-164') 
                }
            }
            scriptPath('CI/Application/Declarative/Python/Unit Testing/Jenkinsfile') 
        }
    }
}


pipelineJob('POC/CI-Checks/Applications/Declarative/Python/DAST') {
    definition {
        cpsScm {
            scm {
                git {
                    remote {
                        url('https://github.com/snaatak-Zero-Downtime-Crew/jenkins.git')
                        credentials('git-cred') 
                    }
                    branch('*/Mohit-SCRUM-165') 
                }
            }
            scriptPath('CI/Application/Declarative/Python/DAST/Jenkinsfile') 
        }
    }
}

pipelineJob('POC/CI-Checks/Applications/Declarative/Python/Dependency-Scanning ') {
    definition {
        cpsScm {
            scm {
                git {
                    remote {
                        url('https://github.com/snaatak-Zero-Downtime-Crew/jenkins.git')
                        credentials('git-cred') 
                    }
                    branch('*/Anuj-SCRUM-166') 
                }
            }
            scriptPath('CI/Declarative/Python/Dependency scanning/Jenkinsfile') 
        }
    }
}

//POC/CI-Checks/Applications/Scripted/Python


pipelineJob('POC/CI-Checks/Applications/Scripted/Python/Code-Coverage') {
    definition {
        cpsScm {
            scm {
                git {
                    remote {
                        url('https://github.com/snaatak-Zero-Downtime-Crew/jenkins.git')
                        credentials('git-cred') 
                    }
                    branch('*/main') 
                }
            }
            scriptPath('CI/Application/Scripted/Python/Code Coverage/Jenkinsfile') 
        }
    }
}

pipelineJob('POC/CI-Checks/Applications/Scripted/Python/Static-Code-Analysis') {
    definition {
        cpsScm {
            scm {
                git {
                    remote {
                        url('https://github.com/snaatak-Zero-Downtime-Crew/jenkins.git')
                        credentials('git-cred') 
                    }
                    branch('*/Rohit-SCRUM-168') 
                }
            }
            scriptPath('CI/Application/Scripted/Python/Static Code Analysis/Jenkinsfile') 
        }
    }
}

pipelineJob('POC/CI-Checks/Applications/Scripted/Python/Bug-Analysis') {
    definition {
        cpsScm {
            scm {
                git {
                    remote {
                        url('https://github.com/snaatak-Zero-Downtime-Crew/jenkins.git')
                        credentials('git-cred') 
                    }
                    branch('*/Anuj-SCRUM-169') 
                }
            }
            scriptPath('CI/Application/Scripted/Python/Bug Analysis/JenkinsFile') 
        }
    }
}

pipelineJob('POC/CI-Checks/Applications/Scripted/Python/Unit-Testing') {
    definition {
        cpsScm {
            scm {
                git {
                    remote {
                        url('https://github.com/snaatak-Zero-Downtime-Crew/jenkins.git')
                        credentials('git-cred') 
                    }
                    branch('*/main') 
                }
            }
            scriptPath('CI/Application/Scripted/Python/Unit Testing/Jenkinsfile') 
        }
    }
}


pipelineJob('POC/CI-Checks/Applications/Scripted/Python/DAST') {
    definition {
        cpsScm {
            scm {
                git {
                    remote {
                        url('https://github.com/snaatak-Zero-Downtime-Crew/jenkins.git')
                        credentials('git-cred') 
                    }
                    branch('*/Pravesh-SCRUM-171') 
                }
            }
            scriptPath('CI/Application/Scripted/Python/DAST/Jenkinsfile') 
        }
    }
}

pipelineJob('POC/CI-Checks/Applications/Scripted/Python/Dependency-Scanning') {
    definition {
        cpsScm {
            scm {
                git {
                    remote {
                        url('https://github.com/snaatak-Zero-Downtime-Crew/jenkins.git')
                        credentials('git-cred') 
                    }
                    branch('*/main') 
                }
            }
            scriptPath('CI/Application/Scripted/Python/Dependency scanning/Jenkinsfile') 
        }
    }
}

//POC/CI-Checks/Applications/Shared-Library/Python

pipelineJob('POC/CI-Checks/Applications/Shared-Library/Python/Code-Coverage') {
    definition {
        cpsScm {
            scm {
                git {
                    remote {
                        url('https://github.com/snaatak-Zero-Downtime-Crew/jenkins.git')
                        credentials('git-cred') 
                    }
                    branch('*/Rohit-SCRUM-173') 
                }
            }
            scriptPath('Shared_Library/CI/Applications/Python/Code_coverage/Jenkinsfile') 
        }
    }
}


pipelineJob('POC/CI-Checks/Applications/Shared-Library/Python/Static-Code-Analysis') {
    definition {
        cpsScm {
            scm {
                git {
                    remote {
                        url('https://github.com/snaatak-Zero-Downtime-Crew/jenkins.git')
                        credentials('git-cred') 
                    }
                    branch('*/Pravesh-SCRUM-174') 
                }
            }
            scriptPath('CI/Application/Shared_Library/Python/Static Code Analysis/Jenkinsfile') 
        }
    }
}



pipelineJob('POC/CI-Checks/Applications/Shared-Library/Python/Bugs-Analysis') {
    definition {
        cpsScm {
            scm {
                git {
                    remote {
                        url('https://github.com/snaatak-Zero-Downtime-Crew/jenkins.git')
                        credentials('git-cred') 
                    }
                    branch('*/Sharvari-SCRUM-175') 
                }
            }
            scriptPath('CI/Application/Shared Library/Python/Bugs analysis/Jenkinsfile') 
        }
    }
}

//################chanes pending
pipelineJob('POC/CI-Checks/Applications/Shared-Library/Python/Unit-Testing') {
    definition {
        cpsScm {
            scm {
                git {
                    remote {
                        url('https://github.com/snaatak-Zero-Downtime-Crew/shared-library.git')
                        credentials('git-cred') 
                    }
                    branch('*/Sharvari-SCRUM-176') 
                }
            }
            scriptPath('Jenkinsfile') 
        }
    }
}


pipelineJob('POC/CI-Checks/Applications/Shared-Library/Python/Dependency-Scanning') {
    definition {
        cpsScm {
            scm {
                git {
                    remote {
                        url('https://github.com/snaatak-Zero-Downtime-Crew/jenkins.git')
                        credentials('git-cred') 
                    }
                    branch('*/Ramatan-SCRUM-178') 
                }
            }
            scriptPath('CI/Application/Shared_Library/Python/Dependency_scanning/Jenkinsfile') 
        }
    }
}






/////api


pipelineJob('POC/CI-Checks/Applications/Shared-Library/Python/Dependency-Sscanning  ') {
    definition {
        cpsScm {
            scm {
                git {
                    remote {
                        url('https://github.com/snaatak-Zero-Downtime-Crew/jenkins.git')
                        credentials('git-cred') 
                    }
                    branch('*/Ramatan-SCRUM-178') 
                }
            }
            scriptPath('CI/Application/Shared_Library/Python/Dependency_scanning/Jenkinsfile') 
        }
    }
}




