import java.io.*;
import java.util.Scanner;
class Ebill{
    int cno;
    String cname,type;
    float pmr,cmr;
    public Ebill(int cno,String cname,String type,float pmr,float cmr){
        this.cno=cno;
        this.cname=cname;
        this.type=type;
        this.pmr=pmr;
        this.cmr=cmr;
    }
    float calBillAmount(){
        float units=Math.abs(pmr-cmr);
        float bill=0.0f;
    if(type.equals("Domestic")==true){
        for(int i=1;i<=units;i++){
            if(i<=100)
            bill+=i*1;
            else if(i>100&& i<=200)
            bill+=i*2.5;
            else if(i>200&&i<=500)
            bill+=i*4;
            else
            bill+=i*6;
        }
    }
    else{
        for(int i=1;i<=units;i++){
            if(i<=100)
            bill+=i*2;
            else if(i>100&& i<=200)
            bill+=i*4.5;
            else if(i>200&&i<=500)
            bill+=i*6;
            else
            bill+=i*7;
            }
        }
        return bill;
    }
}

class Experiment2 {
    public static void main(String arhs[]){
        Ebill e=new Ebill(1011,"Sharon","Domestic",23.99f,232.34f);
        System.out.println(e.calBillAmount());
    }
}

