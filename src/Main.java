import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("please verify your identity");
        Scanner sc=new Scanner(System.in);

        do {

            System.out.println("most welcome in in SALU university");
            System.out.println("are you a student or employee of SALU university?  y/n");

            String str=sc.next();   // taking input in yes or no

            if (str.equalsIgnoreCase("y")){  // input is equal to y
                System.out.println("most welcome ");
                System.out.println("have you a ID card?  y/n");
                String student_confirmation= sc.next(); // takng confirmation of id card yes or no

                if (student_confirmation.equalsIgnoreCase("y")){  // if coirmation is yes
                    System.out.println("sir please enetr your ID card number  ");
                    int seat_number= sc.nextInt();                        //    taking id card number to check
                    if (seat_number>=1 && seat_number<=100){              //    if id (card number) 0r condition is true
                        System.out.println("you can go ");
                        System.out.println();
                    } else {                                              //    if id (card number) 0r condition is false
                        System.out.println("there is some error!!!! please contact salu technical team :)");
                        System.out.println();
                    }
                } else { //                                                     if coirmation is no
                    System.out.println("you are not allowed without ID card");
                    System.out.println();
                }
            }

                else if (str.equalsIgnoreCase("n")) { //  if input equals to n means no
                System.out.println("other than student or employee noone is allowed!!");
                System.exit(0);
                System.out.println();
            }

        }
        while (true );
    }
}