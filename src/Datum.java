public class Datum {

	private int dag;
	private int maand;
	private int jaar;

	  /**
	   * Constructor
	   */
	public Datum(int dag, int maand, int jaar) {
		this.dag = dag;
		this.maand = maand;
		this.jaar = jaar;
		bestaatDatum(dag, maand, jaar);
	}

	public Datum() {
		// Zorg ervoor dat de parameter loze constructor alle velden op 0 worden gezet.
		this.dag = 0;
		this.maand = 0;
		this.jaar = 0;
	}
	
	public boolean bestaatDatum(int dag, int maand, int jaar){

		if(checkMonth(maand).equals("longMonth") && dag <= 31) {
			return true;
		} else if (isLeapYear(jaar) && checkMonth(maand).equals("leapYear") && dag <= 29) {
			return true;
		} else if (!isLeapYear(jaar) && checkMonth(maand).equals("leapYear") && dag <= 28) {
			return true;
		} else if (checkMonth(maand).equals("shortMonth") && dag <= 30) {
			return true;
		} else {
			return false;
		}

	}

	/**
	 *
	 * @param maand
	 * @return
	 */
	public String checkMonth(int maand) {
		int[] longMonths = new int[]{1, 3, 5, 7, 8, 10, 12};
		int[] shortMonths = new int[]{4, 6, 9, 11};

		for(int smonth : shortMonths) {
			if(smonth == maand) {
				return "shortMonth";
			}
		}

		for(int month : longMonths) {
			if(month == maand) {
				return "longMonth";
			}
		}

		if (maand == 2) {
			return "leapYear";
		}

		return "Onbekend";
	}
	/**
	 *
	 * @param year
	 * @return
	 */
	public boolean isLeapYear(int year) {
		if(year % 4 == 0) {
			return true;
		} else if (year % 400 == 0) {
			return true;
		} else if(year % 100 == 0) {
			return false;
		} else {
		 	return false;
		}
	}


	
	/**
	 * Getter voor Sting weergave van datum
	 * @return Geboortedatum
	 */
	public static String getDatumAsString() {
		// TODO
	}

	/**
	 *
	 * @return
	 */
	public int getDag() {
		return dag;
	}

	/**
	 *
	 * @return
	 */
	public int getJaar() {
		return jaar;
	}

	/**
	 *
	 * @return
	 */
	public int getMaand() {
		return maand;
	}

	/**
	 *
	 * @param dag
	 */
	public void setDag(int dag) {
		this.dag = dag;
	}

	/**
	 *
	 * @param jaar
	 */
	public void setJaar(int jaar) {
		this.jaar = jaar;
	}

	/**
	 *
	 * @param maand
	 */
	public void setMaand(int maand) {
		this.maand = maand;
	}
}
