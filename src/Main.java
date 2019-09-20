import java.util.Scanner;

public class Main {

    public Main() {
    }

    public static void main(String[] args) {
       //begin code here
        Heidi cat1 = new Heidi();
        cat1.setEnddate(0);
        cat1.setStarttdate(0);
        cat1.setName("");
        cat1.setCompany("");
        cat1.setEmailadress("");
        cat1.setJobdescription("");
        cat1.setJobtitile("");
        String git1;
        String git2;
        String git3;
        String git4;
        String git5;
        int git6;
        int git7;
        Scanner input = new Scanner(System.in);
        //prompt user for their information based on variables

        //set user's name
        System.out.println("Please enter your name: ");
        git1 = input.nextLine();
        cat1.setName(git1);

        //set user's email address
        System.out.println("Please enter your email address: ");
        git5 = input.nextLine();
        cat1.setName(git1);

        //set user's job title
        System.out.println("Please enter your jobtitle: ");
        git2 = input.nextLine();
        cat1.setJobtitile("");

        //set user's company
        System.out.println("Please enter your company: ");
        git3 = input.nextLine();
        cat1.setCompany("");

        //set user's jobdescription
        System.out.println("Please enter your job description: ");
        git4 = input.nextLine();
        cat1.setCompany("");
        System.out.println();

        //set user's startdate
        System.out.println("Please enter your startdate: ");
        git6 = input.nextInt();
        cat1.setStarttdate(0);

        //set user's enddate
        System.out.println("Please enter your enddate: ");
        git7 = input.nextInt();
        cat1.setEnddate(0);
        System.out.println("Thank you for your entries we'll be in touchA" +
                "");
    }
}
