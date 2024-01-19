package emailapp;

import java.util.Scanner;

public class Email {
    private final String firstName;
    private final String lastName;
    private String department;
    private String email;
    private String password;
    private int mailBoxCapacity=500;
    private String alternateEmail;
    private int defaultPasswordLength=8;
    private String companySuffix="aeyCompany.com";

    public Email(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    //    System.out.println("Email Created: " + this.firstName + this.lastName);
        //call a method that asking for department
        this.department=setDepartment();
        System.out.println("Department : " + this.department);
        //call a method that return random password
        this.password=randomPasswordGenerate(defaultPasswordLength);
      //  System.out.println("Your password is: " + this.password);
        //combine elements to generate email
        email=firstName.toLowerCase() + "."  + lastName.toLowerCase() + "@" + department + "." + companySuffix;
      //  System.out.println("Your email is : " + email);

    }

    private String setDepartment() {
        System.out.println("New Worker: " + firstName + ".Department Codes:\n1 Sales\n2 Accounting\n3 Development\n0 None");
        Scanner in = new Scanner(System.in);
        int deptChoice = in.nextInt();
        if (deptChoice == 1) {
            return "Sales";
        } else if (deptChoice == 2) {
            return "Accounting";
        } else if (deptChoice == 3) {
            return "Development";

        } else {
            return "";
        }
    }
private String randomPasswordGenerate(int length){
        String passwordSet="abcdefghijklmnopqrstuvwxyz1234567890@!$";
        char[] password=new char[length];
        for (int i=0;i<length;i++){
        int random=    (int)(Math.random() * passwordSet.length());
        password[i]=passwordSet.charAt(random);
        }
        return new String(password);
}
//set the mailbox capacity
    public void setMailBoxCapacity(int capacity){
        this.mailBoxCapacity=capacity;

    }
    //set the alternate email
    public void setAlternateEmail(String email){
        this.alternateEmail=email;

    }
    //change the password
    public void changePassword(String password){
        this.password=password;
    }
    public int getMailBoxCapacity(){
        return mailBoxCapacity;
    }
    public String getAlternateEmail(){
        return alternateEmail;
    }
public String showInfo(){
        return "Display Name: " + firstName + "" + lastName + "\nCompany Email: " +email + "\nMailBox Capacity: "
                + mailBoxCapacity + "mb";

}
}
