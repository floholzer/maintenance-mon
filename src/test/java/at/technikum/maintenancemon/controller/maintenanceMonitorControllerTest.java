package at.technikum.maintenancemon.controller;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class maintenanceMonitorControllerTest {
    @Test
    void checkCorrectResponse() {
        maintenanceMonitorController controller = new maintenanceMonitorController();

        assertEquals(controller.message, controller.getStatus());
    }

}