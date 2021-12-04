package com.company;

public class Main {

    public static void main(String[] args) {
        int n=7;
        int count = 0;
        for(int i=1;i<=n;i++){
            if(n%i==0){
                count++;
            }
        }
        if(count==2){
            System.out.println(7+" is a prime number");
        }
        else{
            System.out.println(7+" is not a prime number");
        }
    }
}
