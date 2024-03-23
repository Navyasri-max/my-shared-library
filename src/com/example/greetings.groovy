def call(name) {
       pipeline {
           agent any
           stages {
               stage('print_name2') {
                   steps {
                       echo "Hello $name"
                       }
                }
           }
       }
}
