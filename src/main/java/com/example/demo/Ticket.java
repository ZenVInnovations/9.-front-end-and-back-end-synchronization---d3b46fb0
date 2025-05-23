package com.example.demo;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Ticket {
	private String PassangerName;
	private String SourceStation;
	private String DestinationStation;
	private String Email;
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer TicketId;
	public Ticket(String passangerName, String sourceStation, String destinationStation, String email,
			Integer ticketId) {
		super();
		PassangerName = passangerName;
		SourceStation = sourceStation;
		DestinationStation = destinationStation;
		Email = email;
		TicketId = ticketId;
	}
	public Ticket() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getPassangerName() {
		return PassangerName;
	}
	public void setPassangerName(String passangerName) {
		PassangerName = passangerName;
	}
	public String getSourceStation() {
		return SourceStation;
	}
	public void setSourceStation(String sourceStation) {
		SourceStation = sourceStation;
	}
	public String getDestinationStation() {
		return DestinationStation;
	}
	public void setDestinationStation(String destinationStation) {
		DestinationStation = destinationStation;
	}
	public String getEmail() {
		return Email;
	}
	public void setEmail(String email) {
		Email = email;
	}
	public Integer getTicketId() {
		return TicketId;
	}
	public void setTicketId(Integer ticketId) {
		TicketId = ticketId;
	}
	
}
