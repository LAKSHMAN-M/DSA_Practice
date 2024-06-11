package com.permutations.subSeq;

public class Dice {
    public static void main(String[] args) {
        diceRoll("", 4);
    }

    static void diceRoll(String p, int target) {
        if(target == 0){
            System.out.print(p+", ");
            return;
        }
        for(int i = 1; i <= 6 && i <= target; i++){
            diceRoll(p + i, target - i);
        }
    }
}
