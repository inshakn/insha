  
       def intToRoman (int number) {
          print("Inside intoRoman")
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
       




