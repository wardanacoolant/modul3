/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modul3;

/**
 *
 * @author USER
 */
public class ContinueLabel {
    public static void main(String[] args){
        int a, b;
 	Mulai:
 	for (a=0; a<2; a++)
            for (b=0; b<3; b++){
                if (b==1) continue Mulai;
                System.out.println("a=" + a + "; b=" + b);
            }
    }
}
