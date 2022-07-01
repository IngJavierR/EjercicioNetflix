pipeline {
    agent any
    tools {
        maven 'M3_8_6'
    }
    stages {
        
        stage('Zuul') {
            steps {
                dir("ZuulBase/"){
                    sh "docker build -t zuul ."
                    sh 'docker stop zuul || true'
                    sh 'docker run -d --rm --name zuul -e SPRING_PROFILES_ACTIVE=dev -p zuul'
                }
            }
        }

        stage('Eureka') {
            steps {
                dir("EurekaBase/"){
                    sh "docker build -t eureka ."
                    sh 'docker stop eureka || true'
                    sh 'docker run -d --rm --name eureka -e SPRING_PROFILES_ACTIVE=dev -p eureka'
                }
            }
        }
        
        stage('Ordenes') {
            steps {
                dir("ordenes-service/"){
                    sh "docker build -t ordenes-service ."
                    sh 'docker stop ordenes-service || true'
                    sh 'docker run -d --rm --name ordenes-service -e SPRING_PROFILES_ACTIVE=dev -p ordenes-service'
                }
            }
        }

        stage('Productos') {
            steps {
                dir("productos-service/"){
                    sh "docker build -t productos-service ."
                    sh 'docker stop productos-service || true'
                    sh 'docker run -d --rm --name productos-service -e SPRING_PROFILES_ACTIVE=dev -p productos-service'
                }
            }
        }

        stage('Usuarios') {
            steps {
                dir("usuarios-service/"){
                    sh "docker build -t usuarios-service ."
                    sh 'docker stop usuarios-service || true'
                    sh 'docker run -d --rm --name usuarios-service -e SPRING_PROFILES_ACTIVE=dev -p usuarios-service'
                }
            }
        }
    }
}