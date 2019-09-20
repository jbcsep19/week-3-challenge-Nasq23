import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
       //begin code here
        Heidi cat1 = new Heidi();
        cat1.setEnddate(2020);
        cat1.setStarttdate(2020);
        cat1.setName("");
        cat1.setCompany("");
        cat1.setEmailaddress("");
        cat1.setJobdescription("");
        cat1.setJobtitile("");
        //String userinfo = "";
        String love;
        String userlove;
        String git1;
        String git2;
        String git3;
        String git4;
        String git5;
        int git6;
        int git7;
        int counter = 1;
        ArrayList<Heidi> cats = new ArrayList<>();
        cats.add(cat1);
        while (true) {
            Heidi golf = new Heidi();
            Scanner input = new Scanner(System.in);
            //prompt user for their information based on variables


            //set user's name
            System.out.println("Please enter your name: ");
            git1 = input.nextLine();
            cat1.setName(git1);

            //set user's email address
            System.out.println("Please enter your email address: ");
            git5 = input.nextLine();
            cat1.setName(git5);

            //set user's job title
            System.out.println("Please enter your jobtitle: ");
            git2 = input.nextLine();
            cat1.setJobtitile(git2);

            //set user's company
            System.out.println("Please enter your company: ");
            git3 = input.nextLine();
            cat1.setCompany(git3);

            //set user's jobdescription
            System.out.println("Please enter your job description: ");
            git4 = input.nextLine();
            cat1.setCompany(git4);

            //set user's startdate
            System.out.println("Please enter your startdate: ");
            git6 = input.nextInt();
            cat1.setStarttdate(git6);

            //set user's enddate
            System.out.println("Please enter your enddate: ");
            git7 = input.nextInt();
            love = input.nextLine();
            cat1.setEnddate(git7);


            //Prompt user for entering more jobs
            System.out.println("Do you want to add another job? (y/n)");
            love = input.nextLine();
            if (love.equalsIgnoreCase("n")) {
                userlove = input.nextLine();
               // System.out.println(golf.getDisplayText());
                break;
            }
            counter = 1;
       }
        counter =1;
            for (int i = 0; i < 2; i++) {
                System.out.println("Job: " + counter);
                System.out.println(cat1.getDisplayText());
                counter = counter + 1;
                break;
            }

                Scanner sc = new Scanner(System.in);
                int startdate = (git6);
                int enddate = (git7);
                String job1 = "";
                String name = "";
                String emailaddress = "";
                String jobdescription = "";
                String jobtitle = "";
                String company = "";
                //prompt user for purpose of form
                System.out.println("We are creating a resume with all of your job's today. Let's begin!");
                //HashMap<Integer, String> hmap = new HashMap<Integer, String>();
                while (true) {
                    /* //////prompt user for entries */
                    System.out.println("Please enter your name: ");
                    name = sc.nextLine();
                    cat1.setName(name);
                    //cat1.equals(name);
                    System.out.println("Please enter your email address: ");
                    emailaddress = sc.nextLine();
                    cat1.setEmailaddress(emailaddress);
                    //cat1.equals(emailaddress);
                    System.out.println("Please enter your job's company: ");
                    company = sc.nextLine();
                    cat1.setCompany(company);
                    //cat1.equals(company);
                    System.out.println("Please enter your job description: ");
                    jobdescription = sc.nextLine();
                    cat1.setJobdescription(jobdescription);
                    //cat1.equals(jobdescription);
                    System.out.println("Please enter your job's title: ");
                    jobtitle = sc.nextLine();
                    cat1.setJobtitile(jobtitle);
                    //cat1.equals(jobtitle);
                    System.out.println("Please enter your job's start date: ");
                    startdate = sc.nextInt();
                    cat1.setStarttdate(startdate);
                    //String.valueOf(startdate).equals(cat1);
                    System.out.println("Please enter your job's end date: ");
                    enddate = sc.nextInt();
                    System.out.println();
                    cat1.setEnddate(enddate);
                    //String.valueOf(enddate).equals(cat1);
                    Scanner np = new Scanner(System.in);

                    //Prompt user for entering more jobs
                    System.out.println("Do you want to add another job? (y/n)");
                   love = np.nextLine();
                   if (love.equalsIgnoreCase("n")) {
                        //userlove = input.nextLine();
                        //System.out.println(golf.getDisplayText());
                        break;
                    }
                    counter = 1;
                }
                counter = 1;
                for (int i = 0; i < 2; i++) {
                   System.out.println("Job: " + counter);
                    System.out.println(cat1.getDisplayText());
                   counter = counter + 1;
                   break;
                }

            }
        }