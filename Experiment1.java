//comment
//import java.io.*;
//import java.util.Scanner;
public class Experiment1 {
    public static void main(String []args){
              Invoice myInvoice;
              //Write your code here 
              myInvoice=new Invoice("102","Wrench",2,76.8);
              System.out.println(myInvoice.getInvoiceAmount());
    }
}
class Invoice{
    String partNumber;
    String partDescription;
    int quantity;
    double price;
        //Define instance variables here
        public Invoice(String partNumber, String partDescription, int quantity, double price){
            if(quantity<0)
            this.quantity=0;
            else
            this.quantity=quantity;
            if(price<0)
            this.price=0.0;
            else
	{
	this.price=price;
           	this.partNumber=partNumber;
            	this.partDescription=partDescription;
	}
        }
        void setPartNumber(String partNumber){
            this.partNumber=partNumber;
        }
        void setPartDescription(String partDescription){
            this.partDescription=partDescription;
        }
        void setQuantity(int quantity){
            this.quantity=quantity;
        }
        void setPrice(double price){
            this.price=price;
        }
        
        String getPartNumber(){
            return partNumber;
        }
        String getPartDescription(){
            return partDescription;
        }
        int getQuantity(){
            return quantity;
        }
        double getPrice(){
            return price;
        }
        //Define parameterized constructor here
        
       // Setters

       // Getters

       public double getInvoiceAmount(){
                 double invoiceAmount = 0.0;
                // Write your logic here
                invoiceAmount=(double)quantity*price;
                return invoiceAmount;
       }
}


