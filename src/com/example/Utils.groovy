def call(name) {
       pipeline {
           agent any
           stages {
               stage('print_name3') {
                   steps {
                       echo "Hello $name"
                       }
                }
           }
       }
}
