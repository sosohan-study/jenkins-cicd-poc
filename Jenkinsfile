pipeline {
    agent any

    stages {
        stage('Git clone') {
            steps {
                 echo 'Git clone'
                 echo 'Pulling...' + env.BRANCH_NAME
                 git branch: env.BRANCH_NAME, credentialsId: 'github-jenkins', url: 'https://github.com/sosohan-study/jenkins-cicd-poc.git'
            }
        }
        
        stage('Jar Build') {
            steps {
                dir('./jenkins-cicd-poc') {
                    ./gradlew clean build 
                }
            }
        }
        
        stage('Docker Image Build') {
            steps {
                 echo 'Docker Image Build'
                 echo 'Pulling...' + env.BRANCH_NAME
            }
        }
        
        stage('Docker Image Push') {
            steps {
                 echo 'Docker Image Push'
                 echo 'Pulling...' + env.BRANCH_NAME
            }
        }
    }
}
