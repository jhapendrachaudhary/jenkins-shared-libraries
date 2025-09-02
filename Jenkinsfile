@Library("Shared") _
pipeline{
    agent any
    stages{
        stage('clone'){
            steps{
                script{
                    clone("https://github.com/LondheShubham153/django-notes-app.git","main")
                }
            }
        }
        stage('hello'){
        steps{
            echo "hello bro.."
        }
        }
        stage('done'){
        steps{
            echo "done successfully"
        }
        }
         stage('last moment'){
        steps{
            echo "byeeeee"
        }
        }
    }
}
