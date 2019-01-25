/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quizashutodh;

import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author Ashutosh
 */

public class random {
    
    
    int n =50;   //number of quetions
    
     int fuctioncount=0;
      int[] temp = new int[n];

    
        
      public int randomnum(){  
          fuctioncount++;
          if(fuctioncount==1){
          
     
    
        ArrayList<Integer> mylist  = new ArrayList<Integer>();

            for(int i=0 ; i<n ; i++){

           mylist.add(i+1);
    
             }
    Collections.shuffle(mylist);
   
   
   
            for(int i=0 ; i<n ; i++){
   
            temp[i]= mylist.get(i);
              }
  return temp[0];
          }
          else{
          
          return  temp[fuctioncount];
          }
            
         
      }
    
    
   
    
   
}
