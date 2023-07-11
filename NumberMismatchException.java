/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package error;

/**
 *
 * @author ELCOT
 */
public class NumberMismatchException extends Exception {
    public NumberMismatchException(char x){
        System.out.println("Error : Number doesn't contain character " + x);
    }
}
