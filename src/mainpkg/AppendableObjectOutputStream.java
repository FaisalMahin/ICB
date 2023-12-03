/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mainpkg;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import static java.lang.System.out;

/**
 *
 * @author Administrator
 */
public class AppendableObjectOutputStream extends ObjectOutputStream {

    public AppendableObjectOutputStream(FileOutputStream fos) throws IOException 
            {
                super(out);
            }
            @Override
            protected void writeStreamHeader() throws IOException{
              //todo
            }
    
}
