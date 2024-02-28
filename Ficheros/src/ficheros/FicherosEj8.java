package ficheros;

import java.io.ByteArrayInputStream;
import java.io.IOException;

public class FicherosEj8 {

    public static void main(String[] args) throws IOException {

        byte[] arrayBytes = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        ByteArrayInputStream ArrayBytes = new ByteArrayInputStream(arrayBytes);
        
        while (ArrayBytes.available() != 0) {
            byte leido = (byte) ArrayBytes.read();
            System.out.println(leido);
        }
        ArrayBytes.close();
    }

}


