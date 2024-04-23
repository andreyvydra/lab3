package com.site.demo.tests;

import com.site.demo.AltShotManager;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertNotNull;


class ComplexTest {

    private AltShotManager sm;

    @BeforeEach
    void setUp() {
        sm = new AltShotManager();
    }

    @Test
    void testAboba() {
//        sm.shoot();

        assertNotNull(sm.toString());
    }

}
