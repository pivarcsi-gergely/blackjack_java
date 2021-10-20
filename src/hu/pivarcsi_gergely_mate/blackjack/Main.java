package hu.pivarcsi_gergely_mate.blackjack;

import hu.pivarcsi_gergely_mate.blackjack.kartya.Szin;

public class Main {

    public static void main(String[] args) {
        Szin karo = Szin.KARO;

        for (Szin szin: Szin.values()) {
            System.out.printf("%c, %s", szin.getMegjelenitendoKarakter(), szin.getKiirasSzine());
        }
    }
}
