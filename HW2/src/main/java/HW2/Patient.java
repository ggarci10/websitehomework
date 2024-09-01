package HW2;

import java.util.Date;

public class Patient {
		  public String getPatientName() {
			return patientName;
		}

		public int getId() {
			return id;
		}

		public void setId(int id) {
			this.id = id;
		}

		public void setPatientName(String patientName) {
			this.patientName = patientName;
		}

		public String getVacName() {
			return vacName;
		}

		public void setVacName(String vacName) {
			this.vacName = vacName;
		}

		static int idSeed = 1;
			    private int id;
			    private String patientName;
			    private String vacName;
			    private  Date dateRecieved;
			    private boolean doseTwo;
			    private  Date secondDate;
			    public Date getSecondDate() {
					return secondDate;
				}

				public void setSecondDate(Date secondDate) {
					this.secondDate = secondDate;
				}

				public boolean isDoseTwo() {
					return doseTwo;
				}

				public void setDoseTwo(boolean doseTwo) {
					this.doseTwo = doseTwo;
				}

				public Patient( String name,String Vacname)
			    { Date date = new Date();
			        this.id = idSeed++;
			        this.patientName = name;
			        this.vacName = Vacname;
			        this.dateRecieved=date;
			  this.doseTwo=false;
			    
			      
			    }

				public Date getDateRecieved() {
					return dateRecieved;
				}

				public void setDateRecieved(Date dateRecieved) {
					this.dateRecieved = dateRecieved;
				}
	}
