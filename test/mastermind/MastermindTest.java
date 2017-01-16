/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mastermind;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author vanel
 */
public class MastermindTest {

    private Jeu game;

    public MastermindTest() {
    }

    @BeforeClass
    public static void setUpClass() {

    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {

        int[] tabGame = {1, 2, 2, 0};
        int[] tabUser = {1, 3, 4, 0};

        this.game = new Jeu(tabGame, tabUser);
        
       

    }

    @After
    public void tearDown() {
        
       
        
    }
    
    @Test
    public void testCompareTables() {

       int[] tab = {2, 0, 0, 2};
        Assert.assertArrayEquals(tab, this.game.CheckMatchingValues());
        
    }
    
    
  

    @Test
    public void testMatch() {
        this.game.setCheck(this.game.CheckMatchingValues());
        assertEquals((Color.ANSI_GREEN + "Il y a " + 2 + " chiffres bien placé(s)." + Color.ANSI_RESET + "\t"
                + Color.ANSI_YELLOW + "Il y a " + 0 + " chiffres mal placé(s)." + Color.ANSI_RESET + "\t"), this.game.setPresentNumbers());

    }



}
