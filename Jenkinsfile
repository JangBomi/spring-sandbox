pipeline {
  agent any
  stages {
    stage('git') {
      steps {
        echo 'Git spring-sandbox test/jenkins branch'
        git(url: 'https://github.com/JangBomi/spring-sandbox.git', branch: 'test/jenkins')
      }
    }

    stage('build') {
      steps {
        sh './gradlew build'
      }
    }

    stage('complete') {
      steps {
        echo 'build success??'
      }
    }

  }
}