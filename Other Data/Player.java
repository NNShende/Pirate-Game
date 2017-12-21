/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package game;

/**
 *
 * @author Nikhil
 */
public class Player {
    private int score;
    private String name;
    public Player(int s, String n){
        score = s;
        name = n;
    }

    public int getScore() {
        return score;
    }

    public String getName() {
        return name;
    }
    
}
