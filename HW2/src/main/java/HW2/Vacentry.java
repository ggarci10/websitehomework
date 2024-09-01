package HW2;

public class Vacentry {
	   static int idSeed = 1;
	 //  Vaccine	DosesRequired	DaysBetweenDoses	TotalDosesReceived	TotalDosesLeft
	    private int id;

	    private String Vacname;
	    private int DosesRequired;
	    private int TotalDosesLeft;
	    private int TotalDosesReceived;
	    private int DaysBetweenDoses;
	    
	    public Vacentry( String Vacname, int DosesRequired,int DaysBetweenDoses,int TotalDosesReceived ,int  TotalDosesLeft)
	    {
	        this.id = idSeed++;
	        this.Vacname = Vacname;
	        this.DosesRequired = DosesRequired;
	        this.DaysBetweenDoses=DaysBetweenDoses;
	        this.TotalDosesReceived=TotalDosesReceived;
	        this.TotalDosesLeft=TotalDosesLeft;
	    
	      
	    }
	    
	    public int getTotalDosesLeft() {
			return TotalDosesLeft;
		}

		public void setTotalDosesLeft(int totalDosesLeft) {
			TotalDosesLeft = totalDosesLeft;
		}

		public int getTotalDosesReceived() {
			return TotalDosesReceived;
		}

		public void setTotalDosesReceived(int totalDosesReceived) {
			TotalDosesReceived = totalDosesReceived;
		}

		public int getDaysBetweenDoses() {
			return DaysBetweenDoses;
		}

		public void setDaysBetweenDoses(int daysBetweenDoses) {
			DaysBetweenDoses = daysBetweenDoses;
		}

		
	

	    public int getId()
	    {
	        return id;
	    }

	    public void setId( int id )
	    {
	        this.id = id;
	    }

	    public String getVacname()
	    {
	        return Vacname;
	    }

	    public void setVacname( String Vacname )
	    {
	        this.Vacname = Vacname;
	    }

	    public int getDosesRequired()
	    {
	        return DosesRequired;
	    }

	    public void setDosesRequired( int DosesRequired )
	    {
	        this.DosesRequired = DosesRequired;
	    }
	}