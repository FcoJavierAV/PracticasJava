package ficheros;

import java.io.FileWriter;
import java.io.IOException;

public class FicherosEJ1 {

    
    public static void main(String[] args) {
        
        try{
            
            FileWriter file = new FileWriter("./pares.txt");
                      
            
            for(int num = 0; num <= 200; num ++){
                
                if(num % 2 == 0){
                    file.write(String.valueOf(num) + "\n");
                }
                
            }
            file.close();
            
        }catch(IOException e){
            
        }
       
    }

}
