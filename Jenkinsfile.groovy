pipeline{
    agent any
    stages{
        stage('try'){
            steps{
                sh 'echo "hi welcome" '
                sh 'echo "this is a try" '
            }
        }
    }
}