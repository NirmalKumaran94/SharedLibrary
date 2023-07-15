def call()
{
  checkout scmGit(branches: [[name: '*/main']], extensions: [], userRemoteConfigs: [[url: 'https://github.com/NirmalKumaran94/SharedLibrary.git']])
}
