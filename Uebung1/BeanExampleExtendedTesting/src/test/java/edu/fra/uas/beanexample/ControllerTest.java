package edu.fra.uas.beanexample;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import edu.fra.uas.controller.BeanController;
import edu.fra.uas.service.MessageService;

@SpringBootTest
public class ControllerTest {

    @Autowired
    private BeanController beanController;

    @Autowired
    private MessageService messageService;  // MessageService auch einfügen

    @Test
    void testController() {
        assertThat(beanController.putMessage("Das ist ein Test"))
                                .isEqualTo(" put message: Das ist ein Test");
    }

    @Test
    void testIncrement() {
        // Zähler vor der Erhöhung
        Integer initialCounter = messageService.getCounter();

        // Methode increment aufrufen
        messageService.increment();

        // Zähler nach der Erhöhung
        Integer incrementedCounter = messageService.getCounter();

        // Überprüfen, ob der Zähler um 1 erhöht wurde
        assertThat(incrementedCounter).isEqualTo(initialCounter + 1);
    }
}