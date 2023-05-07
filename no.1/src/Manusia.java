//Class adalah suatu blueprint atau cetak biru untuk membuat objek yang memiliki atribut (variabel) dan perilaku (method). Suatu class dapat digunakan untuk membuat banyak objek yang memiliki karakteristik yang sama.
public class Manusia {
        private String gender;
        private String nama;
        private int umur;

        // Constructor adalah method khusus yang digunakan untuk menginisialisasi objek saat objek dibuat dari suatu class. Constructor dapat memiliki parameter atau tidak memiliki parameter.
        public Manusia(String gender, String nama, int umur){
            this.gender = gender;
            this.nama = nama;
            this.umur = umur;
        }

        // Method overloading adalah teknik dalam pemrograman Java untuk memiliki beberapa method dengan nama yang sama pada suatu class. Method overloading memungkinkan kita untuk menggunakan nama yang sama pada beberapa method dengan parameter yang berbeda.
        public Manusia(String gender, String nama){
            this(gender, nama,0);
        }

        // Method setter adalah method yang digunakan untuk mengubah nilai dari atribut dalam suatu objek. Method setter biasanya diberi nama "set" diikuti dengan nama atribut yang ingin diubah.
        public void setGender(String gender){
            this.gender = gender;
        }
        public void setNama(String nama){
            this.nama = nama;
        }
        public void setUmur(int umur){
            this.umur = umur;
        }

        // Method getter adalah method yang digunakan untuk mengambil nilai dari suatu atribut dalam suatu objek. Method getter biasanya diberi nama "get" diikuti dengan nama atribut yang ingin diambil nilainya.
        public String getGender(){
            return gender;
        }

        public String getNama(){
            return nama;
        }

        public int getUmur(){
            return umur;
        }

        public void biodata(){
            System.out.println("Nama : " +nama+ " Jenis Kelamin : " +gender+ " Umur : " +umur+ " tahun");
        }

        public void biodata(String nama,String gender){
            System.out.println("Nama : " +nama+ " Jenis Kelamin : " +gender+ ".");
        }


    }
