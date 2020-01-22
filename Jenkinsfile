pipeline {
  agent any
  stages {
    stage('Build') {
      steps {
        sleep 10
      }
    }

    stage('copy to targets') {
      parallel {
        stage('copy to targets') {
          steps {
            sh 'scp udi'
            sh 'scp nathan'
          }
        }

        stage('copy to nathan') {
          steps {
            sh 'scp nathan'
          }
        }

      }
    }

  }
  environment {
    version = '1.1.1'
  }
}