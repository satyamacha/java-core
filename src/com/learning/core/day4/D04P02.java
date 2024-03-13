package com.learning.core.Day04;

import java.util.Scanner;

class NotEligibleException extends Exception {
    public NotEligibleException(String message) {
        super(message);
    }
}

class CricketRating {
    String playerName;
    double[] critics;
    double avgRating;
    String coins;

    CricketRating(String playerName, double... critics) {
        this.playerName = playerName;
        this.critics = critics;
        calculateAverageRating(critics);
        calculateCoins();
    }

    void calculateAverageRating(double... critics) {
        double sum = 0;
        for (double critic : critics) {
            sum += critic;
        }
        this.avgRating = sum / critics.length;
    }

    String calculateCoins() {
        if (avgRating >= 7) {
            coins = "Gold";
        } else if (avgRating >= 5 && avgRating < 7) {
            coins = "Silver";
        } else if (avgRating >= 2 && avgRating < 5) {
            coins = "Copper";
        } else {
            coins = "NotEligible";
        }
        return coins;
    }

    void display() {
        System.out.println(playerName + " " + avgRating + " " + coins);
    }
}

public class D04P02 {
    public static void main(String[] args) throws NotEligibleException {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter player name and critic ratings separated by space:");
        String input = scanner.nextLine();

        String[] values = input.split(" ");
        String playerName = values[0];

        double[] criticScores = new double[values.length - 1];
        for (int i = 1; i < values.length; i++) {
            criticScores[i - 1] = Double.parseDouble(values[i]);
        }

        CricketRating player = new CricketRating(playerName, criticScores);
        player.display();
    }
}
