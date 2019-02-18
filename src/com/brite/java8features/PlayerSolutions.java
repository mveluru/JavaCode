package com.brite.java8features;

import java.util.Arrays;
import java.util.Scanner;

import com.brite.java8features.model.Player;

public class PlayerSolutions {
	
	public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
    int n = scan.nextInt();

    Player[] player = new Player[n];
    PlayerCompartor checker = new PlayerCompartor();
    
    for(int i = 0; i < n; i++){
        player[i] = new Player(scan.next(), scan.nextInt());
    }
    scan.close();
    
    Arrays.sort(player, checker);
    for(int i = 0; i < player.length; i++){
        System.out.printf("%s %s\n", player[i].getName(), player[i].getScore());
    }
    
	}

}
