/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mastermind;

import java.util.Scanner;
import java.lang.NumberFormatException;

/**
 *
 * @author vanel
 */
public class Jeu {

    private int[] tab = new int[4];
    private int[] check = new int[4];
    private int[] user = new int[4];
    private int numMisplaced = 0;
    private int numOk = 0;

    public Jeu() {

        for (int i = 0; i < this.tab.length; i++) {

            this.tab[i] = (int) (Math.random() * 5 + 1);

        }

    }

    public Jeu(int[] game, int[] user) {
        
        
        
        this.tab = game;
        this.user = user;

    }

    public int[] getTab() {

        return tab;
    }

    public int[] getCheck() {
        return check;
    }

    public void setCheck(int[] check) {
        this.check = check;
    }

    /**
     *
     * @return int
     */
    public int Sum() {

        int sum = 0;

        for (int i = 0; i < this.check.length; i++) {

            sum += this.check[i];
        }

        return sum;
    }


    public String setPresentNumbers() {

        for (int i = 0; i < this.check.length; i++) {

            if (this.check[i] == 1) {

                this.numMisplaced++;

            } else if (this.check[i] == 2) {

                this.numOk++;

            }

        }
       return (Color.ANSI_GREEN + "Il y a " + this.getNumOk() + " chiffres bien placé(s)." + Color.ANSI_RESET + "\t" +
        Color.ANSI_YELLOW + "Il y a " + this.getNumMisplaced() + " chiffres mal placé(s)." + Color.ANSI_RESET + "\t");

    }

    public int[] getUser() {
        return user;
    }

    public void setUser() {

        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < this.user.length; i++) {

            Boolean err;

            do {
                try {
                    err = false;
                    System.out.println("Entrez la " + (i + 1) + "e valeur : ");
                    this.user[i] = Integer.parseInt(sc.nextLine());
                    if (this.user[i] <= 0 || this.user[i] > 5) {
                        System.out.println(Color.ANSI_YELLOW + "Saisissez une valeur entre 1 et 5" + Color.ANSI_RESET);
                        err = true;
                    }
                } catch (NumberFormatException e) {

                    err = true;
                    System.out.println(Color.ANSI_RED + e.getMessage() + Color.ANSI_RESET);

                }

            } while (err == true);

            /*
                userVal[i] = (int) (Math.random() * 5 + 1);
                System.out.println("Valeur généré par le joueur : " + userVal[i]);
             */
        }
        System.out.println("***************Nouvelle tentative**********");
        System.out.println("-------------------------------------");
        System.out.println("|    " + this.getUser()[0] + "    |    " + this.getUser()[1] + "    |    " + this.getUser()[2] + "    |    " + this.getUser()[3] + "    |");
        System.out.println("-------------------------------------");
        System.out.println("*************************");
    }

    public int getNumMisplaced() {
        return numMisplaced;
    }

    public int getNumOk() {
        return numOk;
    }

    public void setNumMisplaced(int numMisplaced) {
        this.numMisplaced = numMisplaced;
    }

    public void setNumOk(int numOk) {
        this.numOk = numOk;
    }
    
    
    public int[] CheckMatchingValues () {
        
        int[] tabCheck = new int[4]; 
        
         for (int k = 0; k < this.tab.length; k++) {
               tabCheck[k] = 0;
                for (int i = 0; i < this.user.length; i++) {

                    if (this.user[i] == this.tab[k] && i == k) {

                        tabCheck[k] = 2;

                    } else if (this.user[i] == this.tab[k] && i != k) {

                        tabCheck[k] = 1;

                    } else if (this.user[i] != this.tab[k] && i != k && tabCheck[k] != 1) {

                        tabCheck[k] = 0;

                    }

                    if (tabCheck[k] == 2) {
                        break;
                    }

                }

            }
        
        
        
        
        return tabCheck;
    }

}
