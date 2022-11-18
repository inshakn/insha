      import com.cloudbees.groovy.cps.NonCPS

      @NonCPS
       def intToRoman (int number) {
       def rom_map = ["M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"]
       def int_val  = [1000, 900, 500, 400,  100,   90,  50, 40,   10,    9,   5,   4,    1]
       String roman="";
        
        for (int i = 0; i < rom_map.size(); i++) {
                                                        while (number >= int_val[i]) {
            
                                                                                               number -= int_val[i];
                                                                                               roman  += rom_map[i];
                                                                                      }
                                                  }
         return roman;
    }  
       
a=  intToRoman(78)
println("78 in roman is ")
print(a)

GroovyShell shell = new GroovyShell()
        //sh "ls"
            '''sh label: "List files", script: """#!/usr/bin/env bash
            ls
            """'''
        //print(${list})
       def secondFile= load "hello.groovy"
       greeting = secondFile.hey()
       print(greeting)




