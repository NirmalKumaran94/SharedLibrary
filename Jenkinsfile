@Library('shared-library') _
pipeline {
    tools
    {
        maven ('maven_3.9.0')
    }
    stages  {
        stage ('GIT_HUB')   {
            steps {
                githubTrigger()
            } 
        }
        stage ('Maven_Build')   {
            steps {
                agent {
        label 'GIT'
    }
                mavenBuild()
            } 
        }
        stage ('Nexus Upload')
        {
            steps {
            nexusUpload()
        }
    }
        stage ('Clean_WorkSpace')   {
            steps {
                cleanWS()
            } 
        }
    }
}
