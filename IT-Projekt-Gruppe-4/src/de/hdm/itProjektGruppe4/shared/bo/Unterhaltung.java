package de.hdm.itProjektGruppe4.shared.bo;
import java.sql.Date;

public class Unterhaltung extends BusinessObject{
	
	private static final long serialVersionUID = 1L;
	
	private Nachricht refNachricht;
	private Date lastEdited;
	private String sender;
	private String receiver;
	
	public void setNachrichten(Nachricht nachricht){
		refNachricht= nachricht;
	}
	
	public Nachricht nachrichtAnzeigen(){
		return refNachricht; //muss noch veraendert werden
	}
	
	public void nachrichtHinzufuegen (Nachricht hinzufuegen){
		//
	}

	public Date getLastEdited() {
		return lastEdited;
	}

	public void setLastEdited(Date lastEdited) {
		this.lastEdited = lastEdited;
	}

	public String getSender() {
		return sender;
	}

	public void setSender(String sender) {
		this.sender = sender;
	}

	public String getReceiver() {
		return receiver;
	}

	public void setReceiver(String receiver) {
		this.receiver = receiver;
	}
	
}
