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
                        url 'https://github.com/projob4all/profile-svc/tree/master/userprofile-svc'
                    }
                    branch 'master'
                }
            }
        }
    }
}