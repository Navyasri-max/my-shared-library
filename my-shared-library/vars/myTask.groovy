def call(name) {
       pipeline {
           agent any
           stages {
               stage('Greetings') {
                   steps {
                       script {
                           echo "Hello..! $name, Welcome to DevOps wonderfull world"
                     }
                 }
              }
           }
       }
  }
