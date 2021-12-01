pipelineJob('pipelineJob') {
    definition {
        cps {
            script(readFileFromWorkspace('pipelineJob.groovy'))
            sandbox()
        }
    }
}

pipelineJob('userprofile-svc') {
    definition {
        cpsScm {
            scm {
                git {
                    remote {
                        url 'https://github.com/projob4all/userprofile-svc.git'
                    }
                    branch 'master'
                }
            }
        }
    }
}

pipelineJob('userprofile-svc-job-docker') {
    definition {
        cpsScm {
            scm {
                git {
                    remote {
                        url 'https://github.com/projob4all/userprofile-svc.git'
                    }
                    branch 'master'
                    scriptPath('Jenkinsfile-docker')
                }
            }
        }
    }
}