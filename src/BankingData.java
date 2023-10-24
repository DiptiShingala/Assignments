import java.util.Scanner;
public class BankingData {
    public static void main(String[] args){
        int balance=1000;
        int counterdeposite = 0;
        int counterwithdraw = 0;
        int totalbalance = 0;
        int remainbalance = 0;
        int deposite=0;
        int withdraw = 0;
        char choice;
        Scanner scanner = new Scanner(System.in);
        System.out.println("a. Check Account Balance");
        System.out.println("b. Make a Deposit");
        System.out.println("c. Make a Withdrawal");
        System.out.println("d. Print Account Summary");
        System.out.println("e. Exit");
        do {
            System.out.println("Enter option:");
            char c = scanner.next().charAt(0);
            switch (c) {
                case 'a':
                    System.out.println("Current account balance is" + balance);
                    break;
                case 'b':
                    do {
                        System.out.println("Add deposit:");
                        int addbalance = scanner.nextInt();
                        if(addbalance>0) {
                            totalbalance = balance + addbalance;
                            System.out.println("Now Your balance is" + totalbalance);
                            balance = totalbalance;
                            deposite = deposite + addbalance;
                            counterdeposite++;
                        }
                        else{
                            System.out.println("Enter valid amount for deposit");
                        }
                        System.out.println("Do u want to again add balance:?Y:N");
                        choice = scanner.next().charAt(0);

                    } while (choice != 'N') ;
                    break;
                case 'c':
                    do{
                    System.out.println("Withdrawal deposit:");
                    int withdrawbalance = scanner.nextInt();
                    if(withdrawbalance>0) {
                        if (balance >= withdrawbalance) {
                            remainbalance = balance - withdrawbalance;
                            System.out.println("Now your balance is:" + remainbalance);
                            System.out.println("Do u want to again withdraw :?Y:N");
                        } else {
                            System.out.println("Not sufficient balance:");
                            break;
                        }
                        balance = remainbalance;
                        withdraw = withdrawbalance + withdraw;
                        counterwithdraw++;
                    }
                    else{
                        System.out.println("Enter valid amount for withdraw");
                        break;
                    }

                    choice = scanner.next().charAt(0);
                    } while (choice != 'N') ;
                    break;
                case 'd':
                    System.out.println("Your account current balance is:" +balance);
                    System.out.println("Total no of deposite made:" +counterdeposite);
                    System.out.println("Total no of withdraw made:" +counterwithdraw);
                    System.out.println("Total amount of deposite made:" +deposite);
                    System.out.println("Total amount of withdraw made:" +withdraw);
                    break;
                case 'e':
                    System.exit(0);
                    break;
                default:
                    System.out.println("Enter valid option:");
            }
            System.out.println("Do u want to continue with another option:?Y:N");
            choice = scanner.next().charAt(0);
        } while (choice != 'N');
        }
    }

