/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package s_sajat;

/**
 *
 * @author user08
 */
public class S_sajat {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //stringek
        
        String s1 = new String();
        String s2 = ("Ez " + 1 + " String");
        System.out.println(s2);
        
        char [] karaktertomb = {'S', 'o', 'p', 'r', 'o', 'n'};
        String s3 = new String(karaktertomb);
        System.out.println(s3);
        
        String s4 = new String(karaktertomb, 2, 3);
        System.out.println(s4);
        
        char ch = s3.charAt(3);
        System.out.println(ch); 
        
        char ch2 = "Sopron".charAt(0);
        System.out.println(ch2);
        
        boolean b1 = "alma".equals("ALMA");
        System.out.println(b1);
        
        boolean b2 = "alma".equalsIgnoreCase("ALMA");
        System.out.println(b2);
        
        int index1 = "kukuriku".indexOf("u");
        System.out.println(index1+1);
        
        int index2 = "kukuriku".indexOf("u"+1, 2);
        
        
    }
    
}
