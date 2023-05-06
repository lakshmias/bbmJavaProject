package com.bbm.entity;

import java.util.Date;

import jakarta.persistence.*;


@Entity
@Table(name = "Specimen")
public class Specimen {
		@Id
		@GeneratedValue(strategy = GenerationType.AUTO)
		private Long OID;
		
		@Column(nullable = false)
		private String BLOODGROUP;
		
		@Column(nullable = false)
		private String RHFACTOR;
		
		@Column(nullable = false)
		private Long UNITSRECEIVED;
		
		@Column(nullable = false)
		private Date COLLECTEDON;

		@Column(nullable = false)
		private Date EXPIRYDATE;
		
		@Column(nullable = false)
		private Long PERFORMEDBY;
		
		@Column(nullable = false)
		private String COMMENTS;
		
		@Column(nullable = false)
		private String STATUS;
		
		@Override
		public String toString() {
			return "Specimen [OID=" + OID + ", BLOODGROUP=" + BLOODGROUP + ", RHFACTOR=" + RHFACTOR
					+ ", UNITRECEIVED=" + UNITSRECEIVED + ", COLLECTEDON=" + COLLECTEDON + ", EXPIRYDATE=" + EXPIRYDATE
					+ ", PERFORMEDBY=" + PERFORMEDBY + ", COMMENTS=" + COMMENTS + ", STATUS=" + STATUS + "]";
		}

		public Specimen() {
			super();
			// TODO Auto-generated constructor stub
		}

		public Specimen(Long oID, String bLOODGROUP, String rHFACTOR, Long uNITRECEIVED, Date cOLLECTEDON,
				Date eXPIRYDATE, Long pERFORMEDBY, String cOMMENTS, String sTATUS) {
			super();
			OID = oID;
			BLOODGROUP = bLOODGROUP;
			RHFACTOR = rHFACTOR;
			UNITSRECEIVED = uNITRECEIVED;
			COLLECTEDON = cOLLECTEDON;
			EXPIRYDATE = eXPIRYDATE;
			PERFORMEDBY = pERFORMEDBY;
			COMMENTS = cOMMENTS;
			STATUS = sTATUS;
		}

		public Long getOID() {
			return OID;
		}

		public void setOID(Long oID) {
			OID = oID;
		}

		public String getBLOODGROUP() {
			return BLOODGROUP;
		}

		public void setBLOODGROUP(String bLOODGROUP) {
			BLOODGROUP = bLOODGROUP;
		}

		public String getRHFACTOR() {
			return RHFACTOR;
		}

		public void setRHFACTOR(String rHFACTOR) {
			RHFACTOR = rHFACTOR;
		}

		public Long getUNITSRECEIVED() {
			return UNITSRECEIVED;
		}

		public void setUNITSRECEIVED(Long uNITRECEIVED) {
			UNITSRECEIVED = uNITRECEIVED;
		}

		public Date getCOLLECTEDON() {
			return COLLECTEDON;
		}

		public void setCOLLECTEDON(Date cOLLECTEDON) {
			COLLECTEDON = cOLLECTEDON;
		}

		public Date getEXPIRYDATE() {
			return EXPIRYDATE;
		}

		public void setEXPIRYDATE(Date eXPIRYDATE) {
			EXPIRYDATE = eXPIRYDATE;
		}

		public Long getPERFORMEDBY() {
			return PERFORMEDBY;
		}

		public void setPERFORMEDBY(Long pERFORMEDBY) {
			PERFORMEDBY = pERFORMEDBY;
		}

		public String getCOMMENTS() {
			return COMMENTS;
		}

		public void setCOMMENTS(String cOMMENTS) {
			COMMENTS = cOMMENTS;
		}

		public String getSTATUS() {
			return STATUS;
		}

		public void setSTATUS(String sTATUS) {
			STATUS = sTATUS;
		}

		
	}

