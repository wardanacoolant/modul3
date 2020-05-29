/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modul3;

public class BreakLoop {
    public static void main(String[] args) {
      int i = 0;
      do {
         System.out.println("Iterasi ke " + i);
         i++;
         if (i > 10) break;
      }
      while (true);
    }
}
