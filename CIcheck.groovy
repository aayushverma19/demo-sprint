folder('POC') {
     displayName('POC')
 }
folder('POC/CD') {
     displayName('CD')
 }
folder('POC/CD/Ansible') {
     displayName('Ansible')
 }
folder('POC/CD/Ansible/Declarative') {
     displayName('Declarative')
 }
 folder('POC/CI-Checks') {
     displayName('CI-Checks')
 }
folder('POC/CI-Checks/Generic') {
    displayName('Generic')
}
folder('POC/CI-Checks/Ansible') {
    displayName('Ansible')
}
folder('POC/CI-Checks/Ansible/Declarative') {
    displayName('Declarative')
}
folder('POC/CI-Checks/Applications') {
    displayName('Applications')
}
folder('POC/CI-Checks/Applications/API') {
    displayName('API')
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
folder('POC/CI-Checks/Applications/Declarative/GoLang') {
    displayName('GoLang')
}
folder('POC/CI-Checks/Applications/Scripted/GoLang') {
    displayName('GoLang')
}
folder('POC/CI-Checks/Applications/Shared-Library/GoLang') {
    displayName('Golang')
}
folder('POC/CI-Checks/Applications/Declarative/React') {
    displayName('React')
}
folder('POC/CI-Checks/Applications/Scripted/React') {
    displayName('React')
}
folder('POC/CI-Checks/Applications/Shared-Library/React') {
    displayName('React')
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

pipelineJob('POC/CI-Checks/Applications/Declarative/Python/Dependency-Scanning') {
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

pipelineJob('POC/CI-Checks/Applications/Declarative/GoLang/Code-compilation') {
    description("Pipeline job for GoLang Code compilationg")
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
            scriptPath('CI/Application/Declarative/GoLang/code compilation/Jenkinsfile')
        }
    }
}

pipelineJob('POC/CI-Checks/Applications/Declarative/GoLang/Static-code-analysis') {
    description("Pipeline job for Static code analysis")
    definition {
        cpsScm {
            scm {
                git {
                    remote {
                        url('https://github.com/snaatak-Zero-Downtime-Crew/jenkins.git')
                        credentials('git-cred') 
                    }
                    branch('*/Nikita-SCRUM-180') 
                }
            }
            scriptPath('CI/Application/Declarative/GoLang/Static Code Analysis/Jenkinsfile')
        }
    }
}

pipelineJob('POC/CI-Checks/Applications/Declarative/GoLang/Bug-Analysis') {
    description("Pipeline job for Bug Analysis")
    definition {
        cpsScm {
            scm {
                git {
                    remote {
                        url('https://github.com/snaatak-Zero-Downtime-Crew/jenkins.git')
                        credentials('git-cred') 
                    }
                    branch('*/Mohit-SCRUM-181') 
                }
            }
            scriptPath('CI/Application/Declarative/GoLang/Bug Analysis/Jenkinsfile')
        }
    }
}
pipelineJob('POC/CI-Checks/Applications/Declarative/GoLang/Unit-Testing') {
    definition {
        cpsScm {
            scm {
                git {
                    remote {
                        url('https://github.com/snaatak-Zero-Downtime-Crew/jenkins.git')
                        credentials('git-cred') 
                    }
                    branch('*/Anuj-SCRUM-182') 
                }
            }
            scriptPath('CI/Application/Declarative/GoLang/Unit Testing/JenkinsFile')
        }
    }
}
pipelineJob('POC/CI-Checks/Applications/Declarative/GoLang/DAST') {
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
            scriptPath('CI/Application/Declarative/GoLang/DAST/Jenkinsfile')
        }
    }
}
pipelineJob('POC/CI-Checks/Applications/Declarative/GoLang/Dependency-Scanning') {
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
            scriptPath('CI/Application/Declarative/GoLang/Dependency Scanning/Jenkinsfile')
        }
    }
}
pipelineJob('POC/CI-Checks/Applications/Scripted/GoLang/Code-compilation') {
    description("Pipeline job for GoLang Code compilationg")
    definition {
        cpsScm {
            scm {
                git {
                    remote {
                        url('https://github.com/snaatak-Zero-Downtime-Crew/jenkins.git')
                        credentials('git-cred') 
                    }
                    branch('*/Rohit-SCRUM-185') 
                }
            }
            scriptPath('CI/Application/Scripted/GoLang/Code Compilation/Jenkinsfile')
        }
    }
}

pipelineJob('POC/CI-Checks/Applications/Scripted/GoLang/Static-code-analysis') {
    description("Pipeline job for Static code analysis")
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
            scriptPath('CI/Application/Scripted/GoLang/Static code analysis/Jenkinsfile')
        }
    }
}

pipelineJob('POC/CI-Checks/Applications/Scripted/GoLang/Bug Analysis') {
    description("Pipeline job for Bug Analysis")
    definition {
        cpsScm {
            scm {
                git {
                    remote {
                        url('https://github.com/snaatak-Zero-Downtime-Crew/jenkins.git')
                        credentials('git-cred') 
                    }
                    branch('*/Pravesh-SCRUM-187') 
                }
            }
            scriptPath('CI/Application/Scripted/GoLang/Bugs analysis/Jenkinsfile')
        }
    }
}

pipelineJob('POC/CI-Checks/Applications/Scripted/GoLang/Unit Testing') {
    description("Pipeline job for Unit Testing")
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
            scriptPath('CI/Application/Scripted/GoLang /Unit Testing/Jenkinsfile')
        }
    }
}
pipelineJob('POC/CI-Checks/Applications/Scripted/GoLang/DAST') {
    description("Pipeline job for DAST")
    definition {
        cpsScm {
            scm {
                git {
                    remote {
                        url('https://github.com/snaatak-Zero-Downtime-Crew/jenkins.git')
                        credentials('git-cred') 
                    }
                    branch('*/Nikita-SCRUM-189') 
                }
            }
            scriptPath('CI/Application/Scripted/GoLang/DAST/Jenkinsfile')
        }
    }
}
pipelineJob('POC/CI-Checks/Applications/Scripted/GoLang/Dependency-Scanning') {
    description("Pipeline job for Dependency Scanning")
    definition {
        cpsScm {
            scm {
                git {
                    remote {
                        url('https://github.com/snaatak-Zero-Downtime-Crew/jenkins.git')
                        credentials('git-cred') 
                    }
                    branch('*/Mohit-SCRUM-190') 
                }
            }
            scriptPath('CI/Application/Scripted/GoLang/Dependency Scanning/Jenkinsfile')
        }
    }
}

pipelineJob('POC/CI-Checks/Applications/Shared-Library/GoLang/Dependency-Scanning') {
    description("Pipeline job for Golang dependency scanning")
    definition {
        cpsScm {
            scm {
                git {
                    remote {
                        url('https://github.com/snaatak-Zero-Downtime-Crew/jenkins.git')
                        credentials('git-cred') 
                    }
                    branch('*/Aayush-SCRUM-196') 
                }
            }
            scriptPath('CI/Application/Shared Library/GoLang/Dependency scanning/Jenkinsfile')
        }
    }
}



pipelineJob('POC/CI-Checks/Applications/Shared-Library/GoLang/DAST') {
    description("Pipeline job for Golang DAST scanning")
    definition {
        cpsScm {
            scm {
                git {
                    remote {
                        url('https://github.com/snaatak-Zero-Downtime-Crew/jenkins.git')
                        credentials('git-cred') 
                    }
                    branch('*/Anuj-SCRUM-195') 
                }
            }
            scriptPath('Jenkinsfile')
        }
    }
}

pipelineJob('POC/CI-Checks/Applications/Shared-Library/GoLang/Code-Compilation') {
    description("Pipeline job for Golang code compilation")
    definition {
        cpsScm {
            scm {
                git {
                    remote {
                        url('https://github.com/snaatak-Zero-Downtime-Crew/jenkins.git')
                        credentials('git-cred') 
                    }
                    branch('*/Nikita-SCRUM-191') 
                }
            }
            scriptPath('CI/Application/Shared Library/Golang/ Code Compilation/Jenkinsfile')
        }
    }
}

pipelineJob('POC/CI-Checks/Applications/Shared-Library/GoLang/Unit-Testing') {
     description("Pipeline job for Golang unit testing")
    definition {
        cpsScm {
            scm {
                git {
                    remote {
                        url('https://github.com/snaatak-Zero-Downtime-Crew/jenkins.git')
                        credentials('git-cred') 
                    }
                    branch('*/Mohit-SCRUM-194') 
                }
            }
            scriptPath('CI/Application/Shared Library/Go Lang/Unit Testing/Jenkinsfile')
        }
    }
}

pipelineJob('POC/CI-Checks/Applications/Shared-Library/GoLang/Bugs-Analysis') {
    description("Pipeline job for Golang Bugs Scanning")
    definition {
        cpsScm {
            scm {
                git {
                    remote {
                        url('https://github.com/snaatak-Zero-Downtime-Crew/jenkins.git')
                        credentials('git-cred') 
                    }
                    branch('*/Aayush-SCRUM-193') 
                }
            }
            scriptPath('CI/Application/Shared Library/GoLang/Bug Analysis/Jenkinsfile')
        }
    }
}

pipelineJob('POC/CI-Checks/Applications/Shared-Library/GoLang/Static-Code-Analysis') {
    description("Pipeline job for Golang Static code Analysis")
    definition {
        cpsScm {
            scm {
                git {
                    remote {
                        url('https://github.com/snaatak-Zero-Downtime-Crew/jenkins.git')
                        credentials('git-cred') 
                    }
                    branch('*/Aayush-SCRUM-192') 
                }
            }
            scriptPath('CI/Application/Shared Library/GoLang/Static Code Analysis/Jenkinsfile')
        }
    }
}

pipelineJob('POC/CI-Checks/Applications/Declarative/React/Dependency-Scanning') {
    description("Pipeline job for react declarative Dependency-scanning")
    definition {
        cpsScm {
            scm {
                git {
                    remote {
                        url('https://github.com/snaatak-Zero-Downtime-Crew/jenkins.git')
                        credentials('git-cred') 
                    }
                    branch('*/Nikita-SCRUM-205') 
                }
            }
            scriptPath('CI/Application/Declarative/React/Dependency scanning/Jenkinsfile')
        }
    }
}

pipelineJob('POC/CI-Checks/Applications/Declarative/React/DAST') {
    description("Pipeline job for DAST")
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
            scriptPath('CI/Application/Applications/Declarative/React/DAST/Jenkinsfile')
        }
    }
}

pipelineJob('POC/CI-Checks/Applications/Declarative/React/Code-Compilation') {
    description("Pipeline job for react Code Compilation")
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
            scriptPath('CI/Application/Declarative/React/Code Compilation/Jenkinsfile')
        }
    }
}


pipelineJob('POC/CI-Checks/Applications/Declarative/React/Unit-Testing') {
    description("Pipeline job for react Unit Testing")
    definition {
        cpsScm {
            scm {
                git {
                    remote {
                        url('https://github.com/snaatak-Zero-Downtime-Crew/jenkins.git')
                        credentials('git-cred') 
                    }
                    branch('*/Pravesh-SCRUM-203') 
                }
            }
            scriptPath('CI/Application/Declarative/React/Unit Testing/Jenkinsfile')
        }
    }
}

pipelineJob('POC/CI-Checks/Applications/Declarative/React/Bug-Analysis') {
    description("Pipeline job for react Bugs analysis")
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
            scriptPath('CI/Declarative/React/Bugs analysis/Jenkinsfile')
        }
    }
}
pipelineJob('POC/CI-Checks/Applications/Declarative/React/Static-Code-Analysis') {
    description("Pipeline job for react Static Code Analysis")
    definition {
        cpsScm {
            scm {
                git {
                    remote {
                        url('https://github.com/snaatak-Zero-Downtime-Crew/jenkins.git')
                        credentials('git-cred') 
                    }
                    branch('*/Rohit-SCRUM-201') 
                }
            }
            scriptPath('CI/Application/Declarative/React/Static code analysis/JenkinsFile')
        }
    }
}

pipelineJob('POC/CI-Checks/Applications/Scripted/React/Dependency-Scanning') {
    description("Pipeline job for react Dependency-scanning")
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
            scriptPath('CI/Scripted/React/Dependency scanning/Jenkinsfile')
        }
    }
}

pipelineJob('POC/CI-Checks/Applications/Scripted/React/DAST') {
    description("Pipeline job for DAST")
    definition {
        cpsScm {
            scm {
                git {
                    remote {
                        url('https://github.com/snaatak-Zero-Downtime-Crew/jenkins.git')
                        credentials('git-cred') 
                    }
                    branch('*/Rohit-SCRUM-210') 
                }
            }
            scriptPath('CI/Application/Scripted/React/DAST/Jenkinsfile')
        }
    }
}

pipelineJob('POC/CI-Checks/Applications/Scripted/React/Unit-Testing') {
    description("Pipeline job for react Unit Testing")
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
            scriptPath('CI/Application/Scripted/React/Unit Testing/Jenkinsfile')
        }
    }
}


pipelineJob('POC/CI-Checks/Applications/Scripted/React/Bugs-Analysis') {
    description("Pipeline job for react Bugs analysis")
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
            scriptPath('CI/Application/Scripted/React/Bugs analysis/Jenkinsfile')
        }
    }
}

pipelineJob('POC/CI-Checks/Applications/Scripted/React/Static-Code-Analysis') {
    description("Pipeline job for react Static Code Analysis")
    definition {
        cpsScm {
            scm {
                git {
                    remote {
                        url('https://github.com/snaatak-Zero-Downtime-Crew/jenkins.git')
                        credentials('git-cred') 
                    }
                    branch('*/Anuj-SCRUM-207') 
                }
            }
            scriptPath('CI/Scripted/React/Static Code Analysis/JenkinsFile')
        }
    }
}

pipelineJob('POC/CI-Checks/Applications/Scripted/React/Code-Compilation ') {
    description("Pipeline job for react Code compilation ")
    definition {
        cpsScm {
            scm {
                git {
                    remote {
                        url('https://github.com/snaatak-Zero-Downtime-Crew/jenkins.git')
                        credentials('git-cred') 
                    }
                    branch('*/Mohit-SCRUM-206') 
                }
            }
            scriptPath('CI/Application/Scripted/React/Code Compilation/Jenkinsfile')
        }
    }
}

pipelineJob('POC/CI-Checks/Applications/Shared-Library/React/Dependency-Scanning') {
    description("Pipeline job for React dependency scanning")
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
            scriptPath('CI/Application/Shared Library/React/Dependency scanning/Jenkinsfile')
        }
    }
}

pipelineJob('POC/CI-Checks/Applications/Shared-Library/React/DAST') {
    description("Pipeline job for DAST for React")
    definition {
        cpsScm {
            scm {
                git {
                    remote {
                        url('https://github.com/snaatak-Zero-Downtime-Crew/jenkins.git')
                        credentials('git-cred') 
                    }
                    branch('*/Anuj-SCRUM-216') 
                }
            }
            scriptPath('Jenkinsfile')
        }
    }
}

pipelineJob('POC/CI-Checks/Applications/Shared-Library/React/Unit-Testing') {
    description("Pipeline job for React unit testing")
    definition {
        cpsScm {
            scm {
                git {
                    remote {
                        url('https://github.com/snaatak-Zero-Downtime-Crew/jenkins.git')
                        credentials('git-cred') 
                    }
                    branch('*/Mohit-SCRUM-215') 
                }
            }
            scriptPath('CI/Application/Shared Library/React/Unit Testing/Jenkinsfile')
        }
    }
}

pipelineJob('POC/CI-Checks/Applications/Shared-Library/React/Bugs-Analysis') {
    description("Pipeline job for React bug analysis")
    definition {
        cpsScm {
            scm {
                git {
                    remote {
                        url('https://github.com/snaatak-Zero-Downtime-Crew/jenkins.git')
                        credentials('git-cred') 
                    }
                    branch('*/Nikita-SCRUM-214') 
                }
            }
            scriptPath('CI/Application/Shared Library/React/Bugs Analysis/Jenkinsfile')
        }
    }
}


/////api


pipelineJob('POC/CI-Checks/Applications/API/Attendance') {
    definition {
        cpsScm {
            scm {
                git {
                    remote {
                        url('https://github.com/snaatak-Zero-Downtime-Crew/jenkins.git')
                        credentials('git-cred') 
                    }
                    branch('*/Pooja-SCRUM-197') 
                }
            }
            scriptPath('CI/Attendance API/Jenkinsfile') 
        }
    }
}


pipelineJob('POC/CI-Checks/Applications/API/Employee') {
    definition {
        cpsScm {
            scm {
                git {
                    remote {
                        url('https://github.com/snaatak-Zero-Downtime-Crew/jenkins.git')
                        credentials('git-cred') 
                    }
                    branch('*/Nikita-SCRUM-198') 
                }
            }
            scriptPath('CI/Employee API/Jenkinsfile') 
        }
    }
}

pipelineJob('POC/CI-Checks/Applications/API/Salary') {
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
            scriptPath('CI/Salary_API/Jenkinsfile') 
        }
    }
}





pipelineJob('POC/CI-Checks/Ansible/Declarative/Playbook') {
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
            scriptPath('CI/Ansible/CI/Jenkinsfile') 
        }
    }
}

pipelineJob('POC/CD/Ansible/Declarative/Playbook') {
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
            scriptPath('CD/Ansible/CD/Jenkinsfile') 
        }
    }
}
