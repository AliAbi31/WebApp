package edu.fra.uas.v2setter;

/**
 * Die Klasse MasterV2 repräsentiert einen Meister, der Arbeit an einen Gesellen delegiert.
 */
public class MasterV2 {
    Journeyman journeyman; // Referenz auf den Gesellen

    /**
     * Setzt den Gesellen und die zu delegierende Arbeit mithilfe von Setter-Methoden.
     */
    public void setJourneymanAndWork(Journeyman journeyman, Work work) {
        this.journeyman = journeyman;
        this.journeyman.setWork(work); // Geselle erhält die Arbeit
    }

    /**
     * Delegiert die Arbeit, indem der Geselle seine Methode aufruft.
     */
    public void delegateWork() {
        journeyman.performWork(); // Geselle führt die Arbeit aus
    }
}
