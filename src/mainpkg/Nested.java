/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mainpkg;

/**
 *
 * @author Administrator
 */
public class Nested {
     private int x;
    private class NestedClass{
        void doAnother(){
            x++;
        }
    }
    

public void doSome(){
        NestedClass nc = new NestedClass();
        nc.doAnother();
    }
}
