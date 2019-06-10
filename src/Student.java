public class Student extends Persoon {

    private int studentNummer;
    private String studieRichting;

    /**
     * Constructor
     *
     * @param bsn
     * @param voornaam
     * @param achternaam
     * @param geboortedatum
     * @param geslacht
     * @param studentNummer
     * @param studieRichting
     */
    public Student(int bsn, String voornaam, String achternaam, Datum geboortedatum, char geslacht, int studentNummer, String studieRichting) {
        super(bsn, voornaam, achternaam, geboortedatum, geslacht);
        setStudentNummer(studentNummer);
        setStudieRichting(studieRichting);
    }

    /**
     * Set het studentnummer van de student
     *
     * @param studentNummer Het studentnummer
     */
    public void setStudentNummer(int studentNummer) {
        this.studentNummer = studentNummer;
    }

    /**
     * Set de studierichting van de student
     *
     * @param studieRichting De studierichting
     */
    public void setStudieRichting(String studieRichting) {
        this.studieRichting = studieRichting;
    }

    /**
     * Geef het studentnummer
     * @return Het studentnummer
     */
    public int getStudentNummer(){
        return this.studentNummer;
    }

    /**
     * Geef de studierichting
     * @return De studierichting
     */
    public String getStudieRichting(){
        return this.studieRichting;
    }

    public String toString() {
        return super.toString() + "Student[studentNummer=" + this.getStudentNummer() + ", " +
                "studieRichting=" + this.getStudieRichting() + "]";
    }



}