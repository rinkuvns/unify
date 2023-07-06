package com.unify.beans;

public class WhatsappTest {
	private String FROM;
	private String TO;
	private String SEQ;
	private String TAG;
	public String getFROM() {
		return FROM;
	}
	public void setFROM(String fROM) {
		FROM = fROM;
	}
	public String getTO() {
		return TO;
	}
	public void setTO(String tO) {
		TO = tO;
	}
	public String getSEQ() {
		return SEQ;
	}
	public void setSEQ(String sEQ) {
		SEQ = sEQ;
	}
	public String getTAG() {
		return TAG;
	}
	public void setTAG(String tAG) {
		TAG = tAG;
	}
	@Override
	public String toString() {
		return "WhatsappTest [FROM=" + FROM + ", TO=" + TO + ", SEQ=" + SEQ + ", TAG=" + TAG + "]";
	}
	
	
	
}
