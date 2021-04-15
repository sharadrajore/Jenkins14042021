pipeline {
    agent any



    stages {
        stage('Checkout') {
            steps {
                git 'https://github.com/sharadrajore/Jenkins14042021.git'
            }
        }
        
         stage('Build') {
            steps {
               bat 'mvn clean package'
            }
        }
        

         stage('Deploy') {
            steps {
               deploy adapters: [tomcat8(credentialsId: 'tomcat-user', path: '', 
               url: 'http://localhost:9090/')], contextPath: null, 
               onFailure: false, war: '**/*.war'
            }
        }
        
        
        
       
    }
}
