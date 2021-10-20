package hu.pivarcsi_gergely_mate.blackjack.kartya;

public enum ConsoleSzin {
    PIROS("\u001B[31m"),
    FEKETE("\u001B[30m");

    private final String szin;

    ConsoleSzin(String szin) {
        this.szin = szin;
    }

    public String getSzin() {
        return szin;
    }
}
