package exercise4;

import java.util.Date;

public class ParkingTicket {
	
	private int Id;
	
	private String ticketId;
	
	private Date ticketIssueTime;
	
	private Date ticketReturnTime;

	public int getId() {
		return Id;
	}

	public void setId(int id) {
		Id = id;
	}

	public String getTicketId() {
		return ticketId;
	}

	public void setTicketId(String ticketId) {
		this.ticketId = ticketId;
	}

	public Date getTicketIssueTime() {
		return ticketIssueTime;
	}

	public void setTicketIssueTime(Date ticketIssueTime) {
		this.ticketIssueTime = ticketIssueTime;
	}

	public Date getTicketReturnTime() {
		return ticketReturnTime;
	}

	public void setTicketReturnTime(Date ticketReturnTime) {
		this.ticketReturnTime = ticketReturnTime;
	}
	
}
