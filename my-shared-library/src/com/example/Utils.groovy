def call(name) {
       pipeline {
           agent any
           stages {
               stage('PrintMyName') {
                   steps {
                       script {
                           echo "Hello $name, Welcome to DevOps wonderfull world"
                     }
                 }
              }
           }
       }
  }
