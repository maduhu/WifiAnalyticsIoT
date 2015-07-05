package io.pivotal.demo;

import java.net.InetAddress;
import java.net.UnknownHostException;

import org.springframework.context.annotation.ComponentScan;

import com.fasterxml.jackson.annotation.JsonProperty;

@ComponentScan
public class ProbeRequest {

	@JsonProperty
	private String probe_timeepoch;
	
	@JsonProperty
	private String device_id;
	
	@JsonProperty
	private int signal_dbm;
	
	@JsonProperty
	private String hostname;
	
	@JsonProperty
	private int frequencyMhz;
	
	@JsonProperty
	private long nanoTimestamp;
	
	public ProbeRequest() {}
	
	public ProbeRequest(String probe_timeepoch, String device_id, int signal_dbm, int frequencyMhz, long timestamp) throws UnknownHostException {
		super();
		this.probe_timeepoch = probe_timeepoch;
		this.device_id = device_id;
		this.signal_dbm = signal_dbm;
		this.hostname = InetAddress.getLocalHost().getHostName();
		this.frequencyMhz = frequencyMhz;
		this.nanoTimestamp = timestamp;
	}
	
	
	public long getNanoTimestamp() {
		return nanoTimestamp;
	}

	public void setNanoTimestamp(long nanoTimestamp) {
		this.nanoTimestamp = nanoTimestamp;
	}

	public int getFrequencyMhz() {
		return frequencyMhz;
	}

	public void setFrequencyMhz(int frequencyMhz) {
		this.frequencyMhz = frequencyMhz;
	}

	
	
	public String getProbe_timeepoch() {
		return probe_timeepoch;
	}
	public void setProbe_timeepoch(String probe_timeepoch) {
		this.probe_timeepoch = probe_timeepoch;
	}
	public String getDevice_id() {
		return device_id;
	}
	public void setDevice_id(String device_id) {
		this.device_id = device_id;
	}
	public int getSignal_dbm() {
		return signal_dbm;
	}
	public void setSignal_dbm(int signal_dbm) {
		this.signal_dbm = signal_dbm;
	}
	
	public String getHostname() {
		return hostname;
	}

	public void setHostname(String hostname) {
		this.hostname = hostname;
	}


	
	
}
