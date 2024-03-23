def call(name) {
       pipeline {
           agent any
           stages {
               stage('print_name') {
                   steps {
                       echo "Hello $name"
                       }
                }
           }
       }
}
