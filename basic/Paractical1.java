class power_{
    double voltage;
    double current;
    double powerfactor;
    double Active(){
        return voltage*current*powerfactor;
    }
    void setActive(double v,double i, double pf){
        voltage=v;
        current=i;
        powerfactor=pf;
    }
}
public class Paractical1 {
    public static void main(String[] args) {
     power_ p1=new power_();
     power_ p2=new power_();
     power_ p3=new power_();
     p1.setActive(230,5,0.8);
     p2.setActive(230,10,0.6);
     p3.setActive(115,5,0.7);

        System.out.println("Active power is :"+ p1.Active());
        System.out.println("Active power is :"+ p2.Active());
        System.out.println("Active power is :"+ p3.Active());
    }
}
