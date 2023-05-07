public class Main {
    public static void main(String[] args) {
        // Membuat objek
        //Object adalah suatu instance dari suatu class. Objek memiliki state (nilai dari atribut) dan behavior (perilaku dari method) yang diwariskan dari class.
        Manusia orang1 = new Manusia("Perempuan,", "Angela,", 20);
        Manusia orang2 = new Manusia("Laki-Laki,", "Andhika,");

        orang1.biodata();
        orang2.biodata();
    }
}