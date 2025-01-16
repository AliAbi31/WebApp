package edu.fra.uas.v2setter;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Implementiert das Work-Interface und definiert die Arbeit "drill a hole".
 */
public class Drilling implements Work {

    private static final Logger LOGGER = LoggerFactory.getLogger(Drilling.class);

    /**
     * Führt die spezifizierte Arbeit aus: Bohren eines Lochs.
     */
    public void doWork() {
        LOGGER.info(" --> drill a hole into the wall");

        // Erstellen eines MasterV2-Objekts und Setzen der Arbeit über die Setter-Methode
        MasterV2 masterV2 = new MasterV2();
        masterV2.setJourneymanAndWork(new Journeyman(), new Drilling());
        masterV2.delegateWork(); // Delegiert die Arbeit an den Journeyman
    }
}
