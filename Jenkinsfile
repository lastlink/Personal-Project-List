pipeline {
  agent any
  stages {
    stage('Webpack bundle') {
      steps {
        sh '''# pull dependencies
npm install

# pull data
sh build/retrieveList.sh -i \'$id\'

# run build
npm run build

# run unit tests'''
      }
    }
  }
}