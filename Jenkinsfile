pipeline {
    agent any

    stages {
        stage('pull code') {
            steps {
               checkout([$class: 'GitSCM', branches: [[name: '*/${branch}']], doGenerateSubmoduleConfigurations: false, extensions: [], submoduleCfg: [], userRemoteConfigs: [[credentialsId: '5f62fc97-9b15-43d1-b03e-9faf75905bbb', url: 'https://github.com/Mr-zhango/jenkins-demo-war.git']]])
            }
        }
        stage('build project') {
            steps {
               sh 'mvn clean package -Dmaven.test.skip=true'
            }
        }

        stage('publish project') {
            steps {
               deploy adapters: [tomcat8(credentialsId: '0bc571d8-e739-4f7c-972a-356c883dbcef', path: '', url: 'http://192.168.1.129:8090')], contextPath: null, war: 'target/*.war'
            }
        }
    }
}
