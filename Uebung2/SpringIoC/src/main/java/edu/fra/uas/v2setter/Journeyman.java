package edu.fra.uas.v2setter;

/**
 * Repräsentiert einen Gesellen, der eine Arbeit (Work) ausführt.
 */
public class Journeyman {
    Work work; // Referenz auf die Arbeit

    /**
     * Setter-Methode, um die Arbeit zu setzen.
     */
    public Journeyman setWork(Work work) {
        this.work = work;
        return this;
    }

    /**
     * Führt die zugewiesene Arbeit aus.
     */
    public void performWork() {
        work.doWork(); // Aufruf der Methode doWork() der Arbeit
    }
}