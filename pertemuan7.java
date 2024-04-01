package tugaspertemuan7;

import java.io.*;
import java.util.*;
public class pertemuan7
{

	public static void main(String args[]) 
	{ 
		// pembuatan objek
        SelectionSort ob = new SelectionSort(); 
        StopWatch sw = new StopWatch();
        Scanner key = new Scanner(System.in);

        // deklarasi variabel
		int max, min, range, nilaiRandom; //inputnya nilai random, sedangkan max, min dan range mendapatkan nilai random
        String pilih; //var string utk memilih apakah akan menampilkan hasil sorting atau tidak
        int arr[] = new int[100000];

        // input data
        max = arr.length; //max nya diambil dari jmlh max array
        min = 1; //batas nilai random dari 1 - 100.000
        range = max - min + 1;

        for(int i=0;i<max;i++){ //input array, perulangan dan input 100k kali
            nilaiRandom = (int)(Math.random() * range) + min; //input nilai random
            arr[i] = nilaiRandom;
        }

        for(int i=0;i<max;i++){ //memnampilkan array yg sudah di input
            System.out.print(arr[i]+" ");
        }
        System.out.println("");
        System.out.println("");
        
        //proses sorting
        sw.start(); //untuk memulai waktu sorting
        ob.sort(arr); //untuk sorting
        sw.stop(); //untuk waktu akhir sorting
        
        //menampilkan output
        System.out.println("Lama Sorting : "+sw.getElapsedTime()+" Milidetik"); //menampilkan hasil lama sorting
        System.out.print("Tampilkan hasil sorting [y/n] : ");
        pilih = key.nextLine();
        if(pilih.equals("Y") || pilih.equals("y")){
            System.out.println("Hasilnya : ");
            ob.printArray(arr);
        }
	} 
} 


