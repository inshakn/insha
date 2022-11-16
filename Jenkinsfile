node('master'){
        stages{
                stage('Pre build'){
                        parallel(
                                     a: {
                                            echo "This is branch a"
                                         },
                                     b: {
                                            echo "This is branch b"
                                        }
                                )
                }
                stage('Build'){
                        
                                script{
                                      ans =  load "Int_to_Roman.groovy"
                                }
                        
                }
                
        }
}
