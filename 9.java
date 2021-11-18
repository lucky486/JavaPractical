import java.util.Scanner;

class Bank {
    private String accno;
    private String name;
    private long balance;

    Scanner input = new Scanner(System.in);

    // method to open an account
    void openAccount() {
        System.out.print("Enter Account No : ");
        accno = input.next();
        System.out.print("Enter Name       : ");
        name = input.next();
        System.out.print("Enter Balance    : ");
        balance = input.nextLong();
    }

    // method to display account details
    void showAccount() {
        System.out.println(accno + "\t\t" + name + "\t\t" + balance);
    }

    // method to deposit money
    void deposit() {
        long amt;
        System.out.println("---------------------------------------------------------------");
        System.out.print("Enter Amount YOU Want to Deposit  :   ");
        amt = input.nextLong();
        balance = balance + amt;
    }

    // method to withdraw money
    void withdrawal() {
        long amt;
        System.out.print("Enter Amount You Want to withdraw :   ");
        amt = input.nextLong();
        if (balance >= amt && amt <= 100000) {
            balance = balance - amt;
        } else if (balance >= amt && amt > 100000) {
            System.out.println("You can't withdraw money more than 1 Lakh !");
        } else {
            System.out.println("Less Balance..Transaction Failed..");
        }
    }

    // method to search an account number
    boolean search(String acn) {
        if (accno.equals(acn)) {
            System.out.println("AC NO." + "\t\t" + "NAME" + "\t\t" + "BALANCE");
            showAccount();
            System.out.println("---------------------------------------------------------------");
            return (true);
        }
        return (false);
    }

}

public class driver {
    public static void main(String arg[]) {
        Scanner input = new Scanner(System.in);

        // create initial accounts
        System.out.println("---------------------------------------------------------------");
        System.out.print("How many bank account you want to create : ");
        int n = input.nextInt();
        Bank B[] = new Bank[n];
        for (int i = 0; i < B.length; i++) {
            System.out.println("---------------------------------------------------------------");
            B[i] = new Bank();
            B[i].openAccount();
        }

        // run loop until menu 5 is not pressed
        int choice;
        do {
            System.out.println("--------------------------MAIN MENU----------------------------");
            System.out.println("1. Display All");
            System.out.println("2. Search By Account");
            System.out.println("3. Deposit");
            System.out.println("4. Withdrawal");
            System.out.println("5. Exit");
            System.out.println("---------------------------------------------------------------");
            System.out.print("Enter your choice :  ");
            choice = input.nextInt();
            System.out.println("---------------------------------------------------------------");
            switch (choice) {
            case 1:
                System.out.println("AC NO." + "\t\t" + "NAME" + "\t\t" + "BALANCE");

                for (int i = 0; i < B.length; i++) {
                    B[i].showAccount();
                }
                System.out.println("---------------------------------------------------------------");
                break;

            case 2:
                System.out.print("Enter Account No. You Want to Search   : ");
                String acn = input.next();
                System.out.println("---------------------------------------------------------------");
                boolean found = false;
                for (int i = 0; i < B.length; i++) {
                    found = B[i].search(acn);
                    if (found) {
                        break;
                    }
                }
                if (!found) {
                    System.out.println("Search Failed..Account Not Exist..");
                }
                break;

            case 3:
                System.out.print("Enter Account No : ");
                acn = input.next();
                System.out.println("---------------------------------------------------------------");

                found = false;
                for (int i = 0; i < B.length; i++) {
                    found = B[i].search(acn);
                    if (found) {
                        B[i].deposit();
                        break;
                    }
                }
                if (!found) {
                    System.out.println("Search Failed..Account Not Exist..");
                }
                System.out.println("---------------------------------------------------------------");
                break;

            case 4:
                System.out.print("Enter Account No : ");
                acn = input.next();
                System.out.println("---------------------------------------------------------------");

                found = false;
                for (int i = 0; i < B.length; i++) {
                    found = B[i].search(acn);
                    if (found) {
                        B[i].withdrawal();
                        break;
                    }
                }
                if (!found) {
                    System.out.println("Search Failed..Account Not Exist..");
                }
                System.out.println("---------------------------------------------------------------");
                break;

            case 5:
                System.out.println("Good Bye..");
                System.out.println("---------------------------------------------------------------");
                break;
            
            default:
                System.out.println("Wrong Choice !!!");
                System.out.println("---------------------------------------------------------------");
                break;
            }
        } while (choice != 5);
        input.close();

    }
}
