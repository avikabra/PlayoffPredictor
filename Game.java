/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package playoff.predictor;

/**
 *
 * @author home
 */
public class Game {
    public Team t1; 
    public Team t2;
    
    public Game (Team t1, Team t2) {
        this.t1 = t1;
        this.t2 = t2;
    }
    
    public double calcRunningDifference() {
        Double[] d1 = t1.getData();
        Double[] d2 = t2.getData();
        double running_diff = 0;
        
        for (int i = 0; i < 18; i++) {
            double max = Math.max(d1[i], d2[i]);
            double diff = d1[i]/max - d2[i]/max;
            //System.out.println(diff);
            running_diff += diff/18;
        }
        
        return running_diff;
    }
    
    public Team simGame () {
        double running_diff = calcRunningDifference();
        
        double rand_val = Math.random();
        //System.out.println(rand_val);
        if (rand_val < .5 + running_diff) return t1;
        else return t2;
    }
    
    public Team simBO7 () {
        int w = 0; 
        int l = 0;
        while (w < 4 && l < 4) {
            Team t3 = simGame();
            //System.out.println(simGame());
            if (t3.equals(t1)) w++;
            else l++;
        }
        if (w == 4) return t1;
        else return t2;
    }
}
