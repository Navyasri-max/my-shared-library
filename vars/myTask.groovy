def call(name) {
       pipeline {
           agent any
           stages {
               stage('greetings') {
                   steps {
                       echo "Hello $name, how you do..!"
                       }
                }
           }
       }
}
