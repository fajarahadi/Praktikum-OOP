package com.MuhammadFajarAhadi.Modul2.Tugas.Nomor2;

public class DemoBinatang {
    public static void main(String[] args) {
        Binatang superclass = new Binatang();
        Burung classBurung = new Burung();
        Ikan classIkan = new Ikan();
        Kucing classKucing = new Kucing();

        System.out.println("Sifat unik Binatang :\n");
        superclass.getNama("Koala");
        System.out.println();
        classBurung.getNama("Burung Dara");
        classBurung.burung();
        System.out.println();
        classIkan.getNama("Ikan Mas");
        classIkan.ikan();
        System.out.println();
        classKucing.getNama("Kucing Anggora");
        classKucing.kucing();
    }
}
