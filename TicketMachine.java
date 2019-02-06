/**
 * TicketMachine models a naive ticket machine that issues
 * flat-fare tickets.
 * The price of a ticket is specified via the constructor.
 * It is a naive machine in the sense that it trusts its users
 * to insert enough money before trying to print a ticket.
 * It also assumes that users enter sensible amounts.
 *
 * @author David J. Barnes and Michael Kolling
 * @version 2008.03.30
 */
 public class TicketMachine
{
    // The price of a ticket from this machine.
    private int price;
    // The amount of money entered by a customer so far.
    private int balance;
    // The total amount of money collected by this machine.
    private int total;
    //EXCERSISE 2.15
    private int status;
    
    

    /**
     * Create a machine that issues tickets of the given price.
     * Note that the price must be greater than zero, and there
     * are no checks to ensure this.
     */
    public TicketMachine()
    {
        price = 1000;
        balance = 0;
        total = 0;
    }
    
    public TicketMachine(int inputPrice){
        this.price = inputPrice;
        
    }

    /**
     * Return the price of a ticket.
     */
    public int getPrice(int price)
    {
        return price;
    }

    /**
     * Return the amount of money already inserted for the
     * next ticket.
     */
    public int getBalance()
    {
        return balance;
    }

    /**
     * Receive an amount of money in cents from a customer.
     */
    public void insertMoney(int amount)
    {
        if(amount >0){
            balance = balance + amount;
        }else{
            System.out.println("Use a positive amoiunt: " +amount);
        }
    }

    //shows total
    public int getTotal(){
        return total;    
    }
    
    //prompts user to insert money
    public void prompt(){
        System.out.println("Please insert the correct amount of money.");
        
    }
    
    //prints the price to screen
    public void showPrice(){
        System.out.println("The price of a ticket is $" +price+ ".");
    }
    
   //emoty the total
    public int emptyMachine(){
        total = 0;
        return total;
        
        }    
    
    public void newPrice(int newPrice){
        price = newPrice;
    
    }
    
    
    public void mySavings(int discount){
        int saving = discount * price;
        
    }
    
    public void ex251(int count){
        int mean = total / count;
    
    }
    
    public void checkBudget(int budget){
        if(price > budget){
            System.out.println("Too Expensive. Your budget is: $" +budget);
        } else{
            System.out.println("Just Right.");
        }
        
    }
    
    public void printTicket(){
         if(balance >= price){
          System.out.println("##################");
          System.out.println("# The BlueJ Line");
          System.out.println("# Ticket");
          System.out.println("# $" + price);
          System.out.println("##################");
          System.out.println();

        
          total = total + balance;
          balance = balance - price;
          }else{
              int remainder = price - balance;
          System.out.println("You must insert at least: $" + remainder);         
       }
    }
}
