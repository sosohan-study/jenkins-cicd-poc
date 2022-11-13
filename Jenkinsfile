pipeline {
    agent any

    stages {
        stage('Git clone') {
            steps {
                 echo 'Git clone'
                 echo 'Pulling...' + env.BRANCH_NAME
            }
        }
        
        stage('Jar Build') {
            steps {
                 echo 'Jar Build'
                 echo 'Pulling...' + env.BRANCH_NAME
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
