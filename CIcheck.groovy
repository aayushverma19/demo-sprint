// folder('POC') {
//     displayName('POC')
// }
// folder('POC/CI-Checks') {
//     displayName('CI-Checks')
// }
folder('POC/CI-Checks/Generic') {
    displayName('Generic')
}
folder('POC/CI-Checks/Application') {
    displayName('Application')
}
folder('POC/CI-Checks/Generic/Declarative') {
    displayName('Generic')
}
folder('POC/CI-Checks/Generic/Scripted') {
    displayName('Scripted')
}
folder('POC/CI-Checks/Scripted/Generic') {
    displayName('Generic')
}
folder('POC/CI-Checks/Shared-Library/Generic') {
    displayName('Generic')
}
folder('POC/CI-Checks/Application/Declarative/Java') {
    displayName('Java')
}


pipelineJob('POC/CI-Checks/Declarative/Generic/Cred-Scanning') {
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

pipelineJob('POC/CI-Checks/Declarative/Generic/License-Scanning') {
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

pipelineJob('POC/CI-Checks/Declarative/Generic/Notificaiton') {
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

pipelineJob('POC/CI-Checks/Declarative/Generic/AMI') {
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

pipelineJob('POC/CI-Checks/Declarative/Generic/Commit-Sign-off') {
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

pipelineJob('POC/CI-Checks/Scripted/Generic/Cred-Scanning') {
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

pipelineJob('POC/CI-Checks/Scripted/Generic/License-Scanning') {
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


pipelineJob('POC/CI-Checks/Scripted/Generic/Notificaiton') {
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


pipelineJob('POC/CI-Checks/Scripted/Generic/AMI') {
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


pipelineJob('POC/CI-Checks/Scripted/Generic/Commit-Sign-off') {
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

pipelineJob('POC/CI-Checks/Scripted/Generic/AMI') {
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

pipelineJob('POC/CI-Checks/Shared-Library/Generic/Cred-Scanning') {
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
pipelineJob('POC/CI-Checks/Shared-Library/Generic/Licence-Scanning ') {
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

pipelineJob('POC/CI-Checks/Shared-Library/Generic/Notificaiton') {
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
pipelineJob('POC/CI-Checks/Shared-Library/Generic/Commit-Sign-off') {
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

pipelineJob('POC/CI-Checks/Application/Declarative/Java/Code-Compilation') {
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

pipelineJob('POC/CI-Checks/Application/Declarative/Java/Static-Code-Analysis') {
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


pipelineJob('POC/CI-Checks/Application/Declarative/Java/Bugs-Analysis') {
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


pipelineJob('POC/CI-Checks/Application/Declarative/Java/Unit-Testing') {
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


pipelineJob('POC/CI-Checks/Application/Declarative/Java/DAST') {
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
