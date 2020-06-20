package GitTest;

import java.math.BigInteger;

public class git_fibonacci {
    public static void main(String[] args) {
        for(int i = 0;i<=200;i++) {
            System.out.printf("Fibonacci.of(%d) = %s\n",i,Fibonacci.of(i).toString());
        }
    }
}

class Fibonacci{
    static BigInteger of(long pos){
        BigInteger a = new BigInteger("1");
        BigInteger b = new BigInteger("2");
        BigInteger c = new BigInteger("0");
        if(pos == 1) {
            return a;
        }
        else if(pos == 2) {
            return b;
        }
        else {
            for(long i=3;i<=pos;i++){
                c = a.add(b);
                a=b;
                b=c;
            }
        }
        return c;
    }
}