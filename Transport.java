import java.util.*;

public class Transport {
    private String name;
    private int w;
    private int charge;
    private double surCharge;
    private double tBill;

    public Transport(){
        name = "";
        w = 0;
        charge = 0;
        surCharge = 0.0;
        tBill = 0.0;
    }

    public void accept(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Customer Name: ");
        name = sc.nextLine();
        System.out.print("Enter the weight of Parcel: ");
        w = sc.nextInt();
    }

    public void calculate(){
        if(w<=10){
            charge = w*25;
            surCharge = (5/100.0)*charge;
            tBill = charge + surCharge;
        }
        else if(w>=10 && w<=30){
            charge = w*20;
            surCharge = (5/100.0)*charge;
            tBill = charge + surCharge;
        }
        else{
            charge = w*10;
            surCharge = (5/100.0)*charge;
            tBill = charge + surCharge;
        }
    }
    public void print(){
        System.out.println("Customer Name: "+name);
        System.out.println("Weight: "+ w);
        System.out.println("Total Bill: "+ tBill);
    }

    public static void main(String[] args) {
        Transport obj = new Transport();
        obj.accept();
        obj.calculate();
        obj.print();
    }
}
