package com.example.demo;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TicketService {
	@Autowired
	private TicketRepository ticketrepo;
	public Ticket Createticket(Ticket ticketobj) {
	return ticketrepo.save(ticketobj);
	}
	public List<Ticket> getAllTickets() {
	    return (List<Ticket>) ticketrepo.findAll();
	}
	public Optional<Ticket> getTicketById(Integer id) {
        return ticketrepo.findById(id);
    }
	public void deleteTicketById(Integer  TicketId) {
	     ticketrepo.deleteById( TicketId);
	}
	public Ticket updateTicket(Integer TicketId,Ticket updatedTicket) {
		return ticketrepo.save(updatedTicket);
		
	}
	}


