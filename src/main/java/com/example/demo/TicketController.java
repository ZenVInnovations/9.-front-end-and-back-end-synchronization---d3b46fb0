package com.example.demo;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class TicketController {

    @Autowired
    private TicketService ticketService;
    @GetMapping("/")
    public String showForm(Model model) {
        model.addAttribute("ticket", new Ticket());
        return "register";
    }


    @PostMapping("/create")
    public Ticket createTicket(@RequestBody Ticket ticketObj) {
        return ticketService.Createticket(ticketObj);
    }

    @GetMapping("/getAll")
    public List<Ticket> getAllTickets() {
        return ticketService.getAllTickets();
    }
    @GetMapping("/get/{id}")
    public Optional<Ticket> getTicketById(@PathVariable Integer id) {
        return ticketService.getTicketById(id);
    }
    @DeleteMapping("/delete/{id}")
    public String deleteTicketById(@PathVariable Integer id) {
    	ticketService.deleteTicketById(id);
    	return "Ticket with ID" + id + "delete Successfully.";
    	
    }
  
    

    @PutMapping("/update/{id}")
    public Ticket updateTicket(@PathVariable Integer Id,@RequestBody Ticket updatedTicket ) {
    	return ticketService.updateTicket(Id, updatedTicket);
    }

}

