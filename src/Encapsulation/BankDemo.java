package Encapsulation;

import java.util.Scanner;
public class BankDemo {
    public static void main(String[] args) {

        Bank bank = new Bank("xyz","Savings",897065,0);
        char choice;
        Scanner scanner = new Scanner(System.in);
        bank.setName("Dipti");

        System.out.println("Account holder name is : " +bank.getName());
        System.out.println("Account Type is : " +bank.getAccountType());
        System.out.println("Account No is : " +bank.getAccountNumber());
        try {
            do {
                System.out.println("Enter your input:");
                System.out.println("Press 1 for Account balance:");
                System.out.println("Press 2 for Deposite:");
                System.out.println("Press 3 for Withdraw:");
                System.out.println("Press 4 for Account Summery:");
                System.out.println("Press 5 for exit");
                int input = scanner.nextInt();

                switch (input) {
                    case 1: {
                        System.out.println("Account balance is : " + bank.accountBalance);
                        break;
                    }
                    case 2: {
                        System.out.println("Enter deposite: ");
                        double addBalance = scanner.nextDouble();
                        bank.deposit(addBalance);
                        break;
                    }
                    case 3: {
                        System.out.println("Enter Withdraw money is :");
                        double withdraw = scanner.nextDouble();
                        bank.withdrawBalance(withdraw);
                        break;
                    }
                    case 4: {
                        bank.checkBalance();
                        break;
                    }
                    case 5: {
                        System.exit(0);
                        break;
                    }
                    default:
                        System.out.println("Enter valid data");
                }

                System.out.println("Do u want to continue with another option:?Y:N");
                choice = scanner.next().charAt(0);
            } while (choice != 'N');

        }catch(Exception e){
            System.out.println("Something went wrong");
        }
    }
}
