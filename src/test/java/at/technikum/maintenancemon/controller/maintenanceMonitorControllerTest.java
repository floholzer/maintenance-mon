package at.technikum.maintenancemon.controller;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class maintenanceMonitorControllerTest {
    @Test
    void checkCorrectResponse() {
        maintenanceMonitorController controller = new maintenanceMonitorController();

        assertEquals(controller.message, controller.getStatus());
    }

    @Test
    void checkSetMessage(){
        maintenanceMonitorController controller = new maintenanceMonitorController();
        controller.setMessage("Test");
        assertEquals("Test", controller.message);
    }
    @Test
    void checkresetMessage(){
        maintenanceMonitorController controller = new maintenanceMonitorController();
        controller.resetMessage();
        assertEquals("Everything works as expected", controller.message);
    }

}