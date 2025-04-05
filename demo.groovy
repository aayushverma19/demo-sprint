folder('POC') {
    displayName('POC')
}
folder('POC/CI-Checks') {
    displayName('CI-Checks')
}
folder('POC/CI-Checks/Declarative') {
    displayName('Declarative')
}
folder('POC/CI-Checks/Declarative/Generic') {
    displayName('Generic')
}
folder('POC/CI-Checks/Scripted') {
    displayName('Scripted')
}
folder('POC/CI-Checks/Scripted/Generic') {
    displayName('Generic')
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

