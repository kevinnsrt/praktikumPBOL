import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;

public class challenge {
    
    static void UI(){
        System.out.println("------------------------------------");
        System.out.println("Sistem Informasi Mahasiswa Sederhana");
        System.out.println("------------------------------------");
        System.out.println("1.Tambah Mahasiswa");
        System.out.println("2.Daftar Mahasiswa");
        System.out.println("3.Edit Mahasiswa");
        System.out.println("4.Hapus Mahasiswa");
        System.out.println("5.Selesai");
    }

public static void main(String[] args) {
    Map<Integer, String> namaMahasiswa = new HashMap<>();
    Scanner input = new Scanner(System.in);
    int pilihan = 0;
    do {
        UI();
        System.out.printf("Masukkan pilihan anda: ");
        pilihan = input.nextInt();

        switch (pilihan) {
            case 1:
            Scanner inputCreate = new Scanner(System.in);
            System.out.println("------------------------------------");
            System.out.printf("Masukkan NIM: ");
            Integer nim = inputCreate.nextInt();
            inputCreate.nextLine();
            System.out.printf("Masukkan Nama: ");
            String nama= inputCreate.nextLine();
            namaMahasiswa.put(nim, nama);
            break;

            case 2:
            boolean cek = namaMahasiswa.isEmpty();
            if(cek == true){ 
                System.out.println("------------------------------------");
            System.out.println("tidak ada data mahasiswa");
            }
            else{
                System.out.println("------------------------------------");
            for(Map.Entry<Integer, String> data : namaMahasiswa.entrySet()){
            System.out.println("NIM: "+data.getKey()+", NAMA: "+data.getValue());
            }
            }
            break;

            case 3:
            boolean cek3 = namaMahasiswa.isEmpty();
            if(cek3 == true){
                System.out.println("------------------------------------");
                System.out.println("tidak ada data mahasiswa");
            }
            else{
                do {
                System.out.printf("Masukkan NIM yang ingin diedit: ");
                Scanner scanner = new Scanner(System.in);
                int nimReplace = scanner.nextInt();
                scanner.nextLine();
                
                    if(namaMahasiswa.containsKey(nimReplace)){
                        System.out.printf("Masukkan Nama: ");
                        String namaReplace = scanner.nextLine();
                        namaMahasiswa.replace(nimReplace,namaReplace);
                        System.out.println("data sudah diganti");
                        break;
                    }
                    else{
                        System.out.println("------------------------------------");
                        System.out.println("data tidak ditemukan");
                        
                    }
                } while (true);
                
            }
            break;

            case 4:
            boolean cek2 = namaMahasiswa.isEmpty();
            if(cek2 == true){
                System.out.println("------------------------------------");
                System.out.println("tidak ada data mahasiswa");
            }
            else{
                do {
                    System.out.println("------------------------------------");
                    System.out.printf("Masukkan NIM yang ingin dihapus: ");
                    Scanner scanner = new Scanner(System.in);
                    int hapusnim = scanner.nextInt();
                    
                    if(namaMahasiswa.containsKey(hapusnim)){
                        namaMahasiswa.remove(hapusnim);
                        System.out.println("------------------------------------");
                        System.out.println("data sudah dihapus");
                        break;
                    } 
                    else{
                        System.out.println("------------------------------------");
                        System.out.println("data tidak ditemukan");
                    }
                } while (true);
                
                
            }
            break;
            default:
            break;
        }
    } while (pilihan !=5);
        System.out.println("------------------------------------");
        System.out.println("ARIGATOU !!!");  
}
}
