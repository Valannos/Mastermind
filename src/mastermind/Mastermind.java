/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mastermind;

/**
 *
 * @author vanel
 */
public class Mastermind {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Window win = new Window();

        Jeu j = new Jeu();

        int runToken = 0;

        do {
            System.out.println(Color.ANSI_RED + "+++++++++++++++SUPRESS IN PROD ENV+++++++++++++++++" + Color.ANSI_RESET);
            for (int i = 0; i < j.getTab().length; i++) {
                System.out.println(Color.ANSI_CYAN + (i + 1) + "e valeur générée par le jeu : " + j.getTab()[i] + Color.ANSI_RESET);

            }
            System.out.println(Color.ANSI_RED + "+++++++++++++++SUPRESS IN PROD ENV+++++++++++++++++" + Color.ANSI_RESET);
            runToken++;
            j.setNumMisplaced(0);
            j.setNumOk(0);
            j.setUser();

            j.setCheck(j.CheckMatchingValues());

            System.out.print(j.setPresentNumbers());

        } while (runToken < 10 && j.Sum() != 8);

        if (runToken == 10 && j.Sum() != 8) {

            System.out.println("perdu !");
            for (int i = 0; i < j.getTab().length; i++) {

                System.out.println((i + 1) + "e valeure générée par le jeu : " + j.getTab()[i]);

            }

        } else if (j.Sum() == 8) {

            System.out.println("Gagné en " + runToken + " coups !!!");
            for (int i = 0; i < j.getTab().length; i++) {

                System.out.println((i + 1) + "e valeur générée par le jeu : " + j.getTab()[i]);

            }

        }

    }

}
