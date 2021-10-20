package hu.pivarcsi_gergely_mate.blackjack.kartya;

public enum Szin {
    KARO('♦', ConsoleSzin.PIROS.getSzin()),
    KOR('♥', ConsoleSzin.PIROS.getSzin()),
    PIKK('♠', ConsoleSzin.FEKETE.getSzin()),
    TREFF('♣', ConsoleSzin.FEKETE.getSzin());

    private final char megjelenitendoKarakter;
    private final String kiirasSzine;



    Szin(char megjelenitendoKarakter, String kiirasSzine) {
        this.megjelenitendoKarakter = megjelenitendoKarakter;
        this.kiirasSzine = kiirasSzine;
    }

    public char getMegjelenitendoKarakter() {
        return megjelenitendoKarakter;
    }

    public String getKiirasSzine() {
        return kiirasSzine;
    }
}
