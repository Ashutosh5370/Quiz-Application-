/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quizashutodh;

import java.util.HashMap;

/**
 *
 * @author Ashutosh
 */
public class hashmap {
    
    
    public static void main(String args[]){
    
        
        
        
        
        String str1 = "Ashutoshpatil";
        String str2 = "A";
        
        char[] ch1 =str1.toCharArray();
        char[] ch2 = str2.toCharArray();
        
        int len1 = ch1.length;
        int len2 = ch2.length;
        
        boolean flag = false;
        for(int i=0 ;i<len1 ;i++){
        
        
            if(ch1[i]==ch2[0]){
            
                    int j=i+1;
                for(int k=1 ;k<len2 ;k++){
                    if(ch2[k] ==ch1[j]){
                        j++;
                    flag =true;
                    }else{
                    flag=false;
                    break;
                    }
                    
                    
                    
                }
            
            }
        
        
        }
        System.out.print(flag);
        
        
    
    
    
    }
    
}
