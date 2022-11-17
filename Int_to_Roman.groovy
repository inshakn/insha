      ''' GroovyShell shell = new GroovyShell()
       def secondFile = shell.parse(new File('/var/jenkins_home/workspace/insha_git1/hello.groovy'))
       secondFile.hey("hello")'''

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




