/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package cms;

/**
 *
 * @author AMAN
 */
public class Cms {
    

    /**
     * @param args the command line arguments
     */
    public String bytesToHex(byte[] bytes) {
    StringBuilder sb = new StringBuilder(bytes.length * 2);
    for (int i = 0; i < bytes.length; i++) {
        sb.append(String.format("%02x", bytes[i] & 0xFF)); // Mask to avoid negative byte values
    }
    return sb.toString();
}
    public static void main(String[] args) {
        // TODO code application logic here
        Login l=new Login();
        l.setVisible(true);
    }
    
}
