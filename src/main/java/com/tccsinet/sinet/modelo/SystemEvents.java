package com.tccsinet.sinet.modelo;


import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "SystemEvents")
public class SystemEvents {
	
	private int ID; 
    private Date ReceivedAt;
    private Date DeviceReportedTime; 
    private short Facility; 
    private short Priority; 
    private String FromHost; 
    private String Message; 
    private String SysLogTag; 

    
    @Id
    @GeneratedValue
	public int getID() {
		return ID;
	}
	public void setID(int iD) {
		ID = iD;
	}
	
	@Column(name="ReceivedAt")
	public Date getReceivedAt() {
		return ReceivedAt;
	}
	public void setReceivedAt(Date receivedAt) {
		ReceivedAt = receivedAt;
	}
	
	@Column(name="DeviceReportedTime")
	public Date getDeviceReportedTime() {
		return DeviceReportedTime;
	}
	public void setDeviceReportedTime(Date deviceReportedTime) {
		DeviceReportedTime = deviceReportedTime;
	}
	
	@Column(name="Facility")
	public short getFacility() {
		return Facility;
	}
	public void setFacility(short facility) {
		Facility = facility;
	}
	
	@Column(name="Priority")
	public short getPriority() {
		return Priority;
	}
	public void setPriority(short priority) {
		Priority = priority;
	}
	
	@Column(name="FromHost")
	public String getFromHost() {
		return FromHost;
	}
	public void setFromHost(String fromHost) {
		FromHost = fromHost;
	}
	
	@Column(name="Message")
	public String getMessage() {
		return Message;
	}
	public void setMessage(String message) {
		Message = message;
	}
	
	
	@Column(name="SyslogTag")
	public String getSysLogTag() {
		return SysLogTag;
	}
	public void setSysLogTag(String sysLogTag) {
		SysLogTag = sysLogTag;
	}
	
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ID;
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		SystemEvents other = (SystemEvents) obj;
		if (ID != other.ID)
			return false;
		return true;
	}

}
