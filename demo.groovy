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

pipelineJob('POC/CI-Checks/Declarative/Generic/Cred-Scanning') {
    description("")
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
    description("Pipeline job for provisioning PostgreSQL EC2 instance in the Dev environment")
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
            scriptPath('CI/Generic/Declarative/License Scanning')
        }
    }
}

pipelineJob('POC/CI-Checks/Declarative/Generic/License-Scanning') {
    description("Pipeline job for provisioning PostgreSQL EC2 instance in the Dev environment")
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
            scriptPath('CI/Generic/Declarative/License Scanning')
        }
    }
}


pipelineJob('POC/CI-Checks/Declarative/Generic/Notificaiton') {
    description("Pipeline job for provisioning PostgreSQL EC2 instance in the Dev environment")
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
            scriptPath('CI/Generic/Declarative/Notificaiton')
        }
    }
}


