public class tp1 {

    public static void main(String[] args) {
        int num=13;
        boolean isPrime=true;
        for(int i=2;i<num;i++){
            if(num%i==0){
                isPrime=false;
            }
        }
        if(isPrime){
            int ld,rev=0;
            while (num!=0) {
                ld=num%10;
                rev=ld+rev*10;
                num=num/10;
            }
            for(int i=2;i<rev;i++){
                if(rev%i==0){
                    isPrime=false;
                }
            }
            if(isPrime){
                System.out.println("it is twisted prime number");
            }
            else{
                System.out.println("it is not a twisted prime number");
            }
        }
        else{
            System.out.println("it is not a prime number");
        }
    }
}