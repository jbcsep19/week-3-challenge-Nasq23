import java.util.ArrayList;
import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;
import java.util.Iterator;
import java.util.Set;

public class Cat {
    public void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String userinfo = "";
        int startdate = 0;
        int enddate = 0;
        String job1 = "";
        String name = "";
        String emailaddress = "";
        String jobdescription = "";
        String jobtitle = "";
        String company = "";
        ArrayList<Cat> cats = new ArrayList<>();
        //prompt user for purpose of form
        System.out.println("We are retreiving all of your resume information");
        HashMap<Integer, String> hmap = new HashMap<Integer, String>();
        int counter = 1;
        while (true){
            Cat cat1 = new Cat();
            /* //////prompt user for entries */
        System.out.println("Please enter your name): " + counter);
        name = sc.nextLine();
        cat1.equals(name);
        System.out.println("Please enter your email address): " + counter);
        emailaddress = sc.nextLine();
        cat1.equals(emailaddress);
        System.out.println("Please enter your job's company: " +counter);
        company = sc.nextLine();
        cat1.equals(company);
        System.out.println("Please enter your job description: " +counter);
        jobdescription = sc.nextLine();
        cat1.equals(jobdescription);
        System.out.println("Please enter your job's title: " +counter);
        jobtitle = sc.nextLine();
        cat1.equals(jobtitle);
        System.out.println("Please enter your job's start date: " +counter);
        startdate = sc.nextInt();
        cat1.equals(String.valueOf(0));
        System.out.println("Please enter your job's end date: " +counter);
        enddate = sc.nextInt();
        cat1.equals(String.valueOf(enddate));
            System.out.println("Do you want to add another job? y/n");
            userinfo = sc.nextLine();
            if (userinfo.equalsIgnoreCase("n")){
                break;
            }

        }

    }

}
