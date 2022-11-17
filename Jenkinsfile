node('master'){
        
                stage('Pre build'){
                        parallel(
                                     a: {
            
                checkout([$class: 'GitSCM', 
                          branches: [[name: '*/master']], 
                          doGenerateSubmoduleConfigurations: false, 
                          extensions: [], submoduleCfg: [], 
                          userRemoteConfigs: [[credentialsId: 'jenkins-user-github', 
                                               url: 'https://github.com/inshakn/insha.git']]])},
                                     b: {
                                            echo "This is branch b"
                                        }
                                )
                }
                stage('Build'){
                        
                                script{
                                        def currentDir = pwd()
                                        echo "${currentDir}"
                                        ans =  load "Int_to_Roman.groovy"
                                        //ans.hey()
                                       //second_file = load "hello.groovy"
                                }
                        
                }
                
        
}
