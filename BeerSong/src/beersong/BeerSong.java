/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beersong;

/**
 *
 * @author Pete
 */
public class BeerSong {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Ninety_Nine_Bottles_of_Beer(); //Call the 99 Bottles Method
    }
    
    public static void Ninety_Nine_Bottles_of_Beer() {
        int bottles = 99; //Initialize 99 Bottles

        while (bottles > 1) { //While Bottles greater 99
            System.out.println(bottles + " bottles of beer on the wall, " + bottles + " bottles of beer"); //More than 99 Bottles

            bottles = bottles - 1; //Decrease Bottles by 1 each time

            if (bottles == 1) {
                System.out.println("take one down, pass it around, " + bottles + " bottle of beer on the wall."); //1 Bottle Left

            } else {
                System.out.println("Take one down, pass it around, " + bottles + " bottles of beer on the wall."); //More than 1 Bottle Left
            }

        }

        System.out.println(bottles + " bottle of beer on the wall, " + bottles + " bottle of beer"); //1 Bottle Left
        System.out.println("Take one down, pass it around, no more bottles of beer on the wall."); //No more Bottles
    }
}
