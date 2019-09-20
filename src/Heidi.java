public class Heidi {

    private String name;
    private String jobtitile;
    private String jobdescription;
    private String company;
    private int starttdate;
    private int enddate;
    private String emailadress;


    private String display;
    private String result;


    public Heidi() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getJobtitile() {
        return jobtitile;
    }

    public void setJobtitile(String jobtitile) {
        this.jobtitile = jobtitile;
    }

    public String getJobdescription() {
        return jobdescription;
    }

    public void setJobdescription(String jobdescription) {
        this.jobdescription = jobdescription;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public int getStarttdate() {
        return starttdate;
    }

    public void setStarttdate(int starttdate) {
        this.starttdate = starttdate;
    }

    public int getEnddate() {
        return enddate;
    }

    public void setEnddate(int enddate) {
        this.enddate = enddate;
    }

    public String getEmailadress() {
        return emailadress;
    }

    public void setEmailadress(String emailadress) {
        this.emailadress = emailadress;
    }

    public String getDisplay() {
        return display;
    }

    public void setDisplay(String display) {
        this.display = display;
    }

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }

    public String getDisplayText() {
       String result = "";
        for (int i=0; i<2; i++){
        result = i + " ";
    }
        String display = "Your name: " + getName() +"\nYour company: " + getCompany() + "\nYour email adress: " + "\nYour job title: " + getJobtitile() + "\nYour job description: " + getJobdescription() +"\nYour start date: "
                +getStarttdate() +"\nYour end date" +getEnddate();
        return display;



    }
  }

