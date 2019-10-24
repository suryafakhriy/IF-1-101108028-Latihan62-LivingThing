/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkgif.pkg1.pkg101108028.latihan62.livingthing;

/**
 *
 * @author User
 * NAMA      : Surya Fakhriy Hasbi
   KELAS     : IF-01 2018
   NIM       : 10118028
   DESKRIPSI : Living Thing

 */
public class IF1101108028Latihan62LivingThing {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Human h= new Human();
        h.setNama("Surya Fakhriy Hasbi");
        h.walk(h.getNama());
        h.breath(h.getNama());
        h.eat(h.getNama());
    }
    
}
