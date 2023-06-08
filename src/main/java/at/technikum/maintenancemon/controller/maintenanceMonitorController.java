package at.technikum.maintenancemon.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class maintenanceMonitorController {
    String message = "Everything works as expected";

    @RequestMapping("/api/message")
    public String getStatus(){
        return this.message;
    }

    @RequestMapping("/api/message/set")
    public void setMessage(@RequestParam String m){
        this.message = m;
    }
}
