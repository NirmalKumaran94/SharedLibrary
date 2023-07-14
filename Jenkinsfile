@Library('shared-library') _
pipeline {
    agent (
        label 'GIT'
        }
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
