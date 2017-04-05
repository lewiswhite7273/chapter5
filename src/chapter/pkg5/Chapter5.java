/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package chapter.pkg5;
import java.util.Scanner;
import java.text.*;
/**
 *
 * @author lewhi7273
 */
public class Chapter5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        NumberFormat currency = new DecimalFormat("$#,###,###.00");
      double paper, cost;
      Scanner input = new Scanner(System.in);
      System.out.println("Please enter the number of sheets to print");
      paper = input.nextInt();
      
      if (paper >= 0 && paper <= 99) {
          System.out.println("The cost per page is $0.30");
          cost = paper * 0.3;
         System.out.println("The total cost is:" + (currency.format(cost)));
     
      } else if (paper >= 100 && paper <= 499) {
          System.out.println("The cost per page is $0.28");
          cost = paper * 0.28;
         System.out.println("The total cost is:" + (currency.format(cost)));
     
      }else if (paper >= 500 && paper <= 749) {
          System.out.println("The cost per page is $0.27");
          cost = paper * 0.27;
         System.out.println("The total cost is:" + (currency.format(cost)));
         
      }else if (paper >= 750 && paper <= 1000) {
          System.out.println("The cost per page is $0.26");
          cost = paper * 0.26;
         System.out.println("The total cost is:" + (currency.format(cost)));
         
      } if (paper > 1000) {
          System.out.println("The cost per page is $0.25");
          cost = paper * 0.25;
         System.out.println("The total cost is:" + (currency.format(cost)));
         
    }
    
    }}
