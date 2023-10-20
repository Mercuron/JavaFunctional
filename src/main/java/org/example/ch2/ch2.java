package org.example.ch2;

import java.util.Arrays;
import java.util.List;

public class ch2 {

    public static void run(){
        final List<String> friends =
                Arrays.asList("Brian", "Nate", "Neal", "Raju", "Sara", "Scott");

        // Stupid
        for(int i = 0; i < friends.size(); i++) {
            System.out.println(friends.get(i));
        }
        //Stupid but better
        for (String friend : friends) {
            System.out.println(friend);
        }


    }
}
