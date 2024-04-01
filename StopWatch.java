package tugaspertemuan7;
//1 detik = 1000md
import java.util.*; //library untuk date, memanggil semua library yg ada di dalam java agar bisa dipakai, * memanggil date
import java.text.*;
public class StopWatch{

    private String startTime;
    private String endTime;

    StopWatch(){ //mengisi nilai awal (default), waktu awal
        Date jamSekarang = new Date(); //variabel, date nama library nya
        SimpleDateFormat ft = new SimpleDateFormat("HH:mm:ss SS"); //format tanggal, SS milidetik
        this.startTime = ft.format(jamSekarang); //format waktu yg sudah dibuat dan disimpan di property start time (string)
    }

    public void start(){ //digunakan untuk mulai sorting
        Date jamSekarang = new Date();
        SimpleDateFormat ft = new SimpleDateFormat("HH:mm:ss SS");
        this.startTime = ft.format(jamSekarang);
        System.out.println("Waktu Mulai Sorting : "+this.startTime); //menampilkan waktu mulai sorting
    }

    public void stop(){ //digunakan jika sorting sudah beres
        Date jamSekarang = new Date();
        SimpleDateFormat ft = new SimpleDateFormat("HH:mm:ss SS");
        this.endTime = ft.format(jamSekarang);
        System.out.println("Waktu Berakhir Sorting : "+this.endTime);
    }

    public int getElapsedTime(){ //digunakan untuk menemukan lama sortingnya
        String dAwal, dAkhir, mdAwal, mdAkhir,menitAwal, menitAkhir; //semua yg awal mengacu ke start time
        int jumlahMiliDetik, selisihDetik,selisihMenit, totalMiliDetik, status=0;
        dAwal = this.startTime.substring(6,8); //yg diitung 7 & 8
        mdAwal = this.startTime.substring(9);//yg diitung 10 dst, this kode yg mencari var/property yg terdapat diluar function
        dAkhir = this.endTime.substring(6,8);
        mdAkhir = this.endTime.substring(9);
        menitAwal = this.startTime.substring(3,5);
        menitAkhir = this.endTime.substring(3,5);

        // Menjumlahkan milidetik
        jumlahMiliDetik  = Integer.parseInt(mdAkhir)- Integer.parseInt(mdAwal);
        if (jumlahMiliDetik <= 0){
            jumlahMiliDetik  = Integer.parseInt(mdAkhir)- Integer.parseInt(mdAwal)+1000;
            status=1;
            
        }

        // Menghitung selisih menit
        if(Integer.parseInt(menitAkhir)>=Integer.parseInt(menitAwal)){ //parseInt : konversi string ke int
            selisihMenit      = Integer.parseInt(menitAkhir) - Integer.parseInt(menitAwal);
        }else{
            selisihMenit      = (Integer.parseInt(menitAkhir)+60) - Integer.parseInt(menitAwal);
        }//60 : karena jumlah maks menit 60, dakhir 6 dawal 20

        // Menghitung selisih detik
        if(Integer.parseInt(dAkhir)>=Integer.parseInt(dAwal)){
            selisihDetik      = Integer.parseInt(dAkhir)-Integer.parseInt(dAwal);
        }else{
            selisihDetik      = (Integer.parseInt(dAkhir)+60)-Integer.parseInt(dAwal);
            selisihMenit      = selisihMenit-1;
        }
        
        if(status==1){
            selisihDetik=selisihDetik - 1;
        }

        totalMiliDetik = (selisihMenit*60000) + (selisihDetik*1000) + jumlahMiliDetik;
        return totalMiliDetik;
    }
}