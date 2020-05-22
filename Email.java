import java.util.Scanner;

public class Email {
    
    private String fName;
    private String lName;
    private String password;
    private int defaultPasswordLength = 10;
    private String email;
    private String department;
    private int mailboxCapacity = 500;
    private String alternateEmail;
    private String companySuffix = "company.com";

    // constructor to receive the fname and lname
    public Email(String fName, String lName){
        this.fName = fName;
        this.lName = lName;
        // System.out.println("Email Create: " + this.fName +" " + this.lName);
    

    // call a method asking for the dept return the department
    this.department = setDepartment();
    // System.out.println("Department: " + this.department);

    //call method that returns random pw
    this.password = randomPassword(defaultPasswordLength);
    System.out.println("Your password is : " + this.password);

    //combine elements to generate email
    email = fName.toLowerCase()+ "." + lName.toLowerCase() + "@" + department + "." + companySuffix;
    // System.out.println("Your email is: " + email);
    }

    // ask for the dept
    private String setDepartment(){
        System.out.print("New worker " + fName + ". Department Code: \n1 for Sales\n2 for Development\n3 for Accounting/n0 for none\nEnter Department Code: ");
        Scanner in = new Scanner(System.in);
        int depChoice = in.nextInt();

        if(depChoice == 1){
            return "sales";
        } else if (depChoice == 2){
            return "dev";
        } else if (depChoice == 3){
            return "acct";
        } else {
            return " ";
        }
    }
    
    
    //gernerate random pw
    private String randomPassword(int length){
        String passwordSet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890!@#$%^&*?";
        char[]password = new char[length];
        for(int i = 0; i < length; i++){
            int rand = (int) (Math.random() * passwordSet.length());
            password[i]= passwordSet.charAt(rand);
            System.out.println(rand);
            System.out.println(passwordSet.charAt(rand));
        }
        return new String(password);
    }
   // set mail mailboxCapacity
    public void setMailboxCapacity(int capacity) {
        this.mailboxCapacity = capacity;
    }

   //set alt email
   public void setAlternateEmail(String altEmail){
       this.alternateEmail = altEmail;
   }
   //change pw
   public void changePassword(String pw){
       this.password = pw;
   }


   //getter
   public int getMailboxCapacity() { 
       return mailboxCapacity;
   }
   public String getAlternateEmail(){
       return alternateEmail;
   }
   public String getPassword(){
       return password;
   }

   //setter
   public String showInfo(){
       return "Display Name: " + fName + " " + lName +
       " \nMAILBOX CAPACITY: " + mailboxCapacity + "mb";
   }

}