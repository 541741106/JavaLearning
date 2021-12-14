//package edu.kit.informatik;
import java.math.BigInteger; 
public class Kryptosystem {
    
    public static void egcd(BigInteger a, BigInteger b) {
        BigInteger s0 = BigInteger.ONE;
        BigInteger s1 = BigInteger.ZERO;
        BigInteger t0 = BigInteger.ZERO;
        BigInteger t1 = BigInteger.ONE;
        BigInteger r0 = a;
        BigInteger r1 = b;
        while (!r1.equals(BigInteger.ZERO)) {
            BigInteger q = r0.divide(r1);
            BigInteger r2 = r0;
            BigInteger s2 = s0;
            BigInteger t2 = t0;
            r0 = r1;
            s0 = s1;
            t0 = t1;
            r1 = r2.subtract(q.multiply(r1));
            s1 = s2.subtract(q.multiply(s1));
            t1 = t2.subtract(q.multiply(t1));
        }
        System.out.println(r0 + " " + s0 + " " + t0);
    }
    
    public static int[] sieve(int n) {
        boolean[] notPrime = new boolean[n + 1];
        int p = 2;
        int count = 0;
        int sqrn = (int) Math.sqrt(n);
        
        while (p <= sqrn) {
            count++;
            for (int k = p * p; k <= n; k += p)
                notPrime[k] = true;
            while (notPrime[++p]);
        }
        while (p <= n) {
            if (!notPrime[p++])
                count++;           
        }
        int[] primes = new int[count];
        int j = 0;
        for (int i = 2; i <= n; i++) {
            if (!notPrime[i])
                primes[j++] = i;
        }
        return primes;
    }
    
    public static void main(String[] args) {
        switch ((args[0])) {
            case "sieve":
            int[] a = sieve(Integer.parseInt(args[1]));
            for (int i = 0; i < a.length; i++) {
                System.out.print(a[i] + " ");
            }
            break;
            case "egcd":
                egcd(new BigInteger(args[1]), new BigInteger(args[2]));
            break;
            default:
        }
    }
}