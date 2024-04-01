package tugaspertemuan7;

public class SelectionSort {
    void sort(int arr[]) //fungsi utama untuk seleksi angka
    { 
        int n = arr.length; //mengambil jumlah array
  
        for (int i = 0; i < n-1; i++) 
        { 
            int min_idx = i; 
            for (int j = i+1; j < n; j++) 
                if (arr[j] < arr[min_idx]) 
                    min_idx = j; 
   
            int temp = arr[min_idx]; 
            arr[min_idx] = arr[i]; 
            arr[i] = temp; 
        } 
    } 
  
    // Prints the array 
    void printArray(int arr[]) //untuk mencetak hasil
    { 
        int n = arr.length; 
        for (int i=0; i<n; ++i) 
            System.out.print(arr[i]+" "); 
        System.out.println(); 
    } 
}
