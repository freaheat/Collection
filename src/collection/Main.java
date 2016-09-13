
package collection;

import java.util.ArrayList;
import java.util.Random;

public class Main {
    //private static Mobile[] mobiles = new Mobile[3];
    private static ArrayList<Mobile> mobiles = new ArrayList<Mobile>();
    private static Random r = new Random();

    public static void main(String[] args) {
        /*mobiles[0] = new Mobile(1234567, "Apple");
        mobiles[1] = new Mobile(1235666, "Apple");
        mobiles[2] = new Mobile(1554788, "Apple");
        for(Mobile m: mobiles){
            System.out.println(m.getNumber() + " " + m.getName());
        }*/
        for(int i = 0; i< 300; i++){
            mobiles.add(new Mobile((9999999), "dgdgdgdgdg"));
        }
        for(Mobile m: mobiles){
            System.out.println(m.getNumber() + " " + m.getName());
        }            
        }
    }