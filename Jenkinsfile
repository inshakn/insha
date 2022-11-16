def ans

pipeline{
        agent any
        stages{
                stage('Pre build'){
                        steps{
                                echo "hello"
                        }
                }
                stage('Build'){
                        steps{
                                script{
                                      ans =  load "Int_to_Roman.groovy"
                                }
                        }
                }
                
        }
}
