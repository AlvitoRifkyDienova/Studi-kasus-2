/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package studi.kasus.pkg2;

import java.util.Scanner;

/**
 *
 * @author MOKLET-1
 */
public class tiketkereta {
    public static void main (String[] args){
        String[] tiket={"Malang-Jakart","Malang-Yogyakarta","Malang-Surabaya"};
        int[] harga= {200000, 120000, 90000};
        
        System.out.println("Daftar harga tiket");
        for (int i=0; i<tiket.length;i++){
            System.out.println(" Harga tiket "+tiket[i]+" adalah "+harga[i]);
        }
        
         System.out.println("Pilih tiket kereta");
         Scanner input = new Scanner(System.in);
          int pilihan= input.nextInt();
         System.out.println("input pilihan: "+tiket[pilihan]);
         System.out.println("Masukan uang: "); 
         int bayar= input.nextInt();
         
         if (bayar>harga[pilihan]){
              System.out.println("Kembalian: "+(bayar-harga[pilihan]));
          }else if(bayar==harga[pilihan]){
              System.out.println("Uangnya pas");
          }
    }

    
    }

