/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conversorpractice;

/**
 *
 * @author Julian Markowskyj <julian.markowskyj at gmail.com>
 */
public class ConversorPractice {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Conversor conversor = new Conversor();
        
        System.out.println(conversor.stringToInt("9"));
        System.out.println(conversor.intToString(89));
        System.out.println(conversor.intToFloat(5));
        System.out.println(conversor.floatToInt(10f));
    }    
}
