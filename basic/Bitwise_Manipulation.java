public class Bitwise_Manipulation {
    public static void main(String[] args) {
        int a=5;
        int pos=1;
        int bitwise=5<<1; // Binary left shift
        //Get Bit
        /*if ((bitwise&a)==0){
            System.out.println("bit is zero");
        }
        else {
            System.out.println("bit is one");
        }*/
        // Set Bit
        /*int newnum=bitwise | a;
        System.out.println(newnum);*/
        // clear bit
        int notBitmask=~(bitwise);
        int n = notBitmask & a;
        System.out.println(n);
    }
}
