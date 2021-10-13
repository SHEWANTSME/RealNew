package com.company;
import java.io.*;
public class Main {

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
        int number = Integer.parseInt(br.readLine());
        int answer=0;
        for(int i=0;i<number;i++){
            int n = i;
            int sum=0;
            while(n != 0){
                sum = sum+ (n%10);
                n = (n/10);
            }

            if(sum+i ==number){
                answer = i;
                break;
            }
        }



       System.out.println(answer);

    }
}
