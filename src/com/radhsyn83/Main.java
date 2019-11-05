package com.radhsyn83;

/*
 *
 * Fathur Radhy
 * 10115046
 * PDO11K
 */

public class Main {

    public static void main(String[] args) {
	// write your code here
        Desa obj = new Desa();
        obj.setNama("PAIN");
        obj.setDesa("AME");
        System.out.println("======BIODATA ANGGOTA AKATSUKI======");
        System.out.println("Nama : "+obj.getNama());
        System.out.println("Asal Desa : "+obj.getDesa());
        Kekuatan obj1 = new Kekuatan();
        obj1.setKekuatan("Rine Tensei, Shinra Tensei, BanshoTein, Chibaku Tensei, "
                + "dan Kuchiyose");
        System.out.println("Kekuatan : "+obj1.getKekuatan());

        System.out.println("");

        Desa obj2 = new Desa();
        obj2.setNama("Konan");
        obj2.setDesa("AME");
        System.out.println("Nama : "+obj2.getNama());
        System.out.println("Asal Desa : "+obj2.getDesa());
        Kekuatan obj3 = new Kekuatan();
        obj3.setKekuatan("Origami");
        System.out.println("Kekuatan : "+obj3.getKekuatan());

        System.out.println("");

        Desa obj4 = new Desa();
        obj4.setNama("Zetsu");
        obj4.setDesa("Chakra Kaguya Otsutsuki");
        System.out.println("Nama : "+obj4.getNama());
        System.out.println("Asal Desa : "+obj4.getDesa());
        Kekuatan obj5 = new Kekuatan();
        obj5.setKekuatan("Tidak diketahui");
        System.out.println("Kekuatan : "+obj5.getKekuatan());

        System.out.println("");

        Desa obj6 = new Desa();
        obj6.setNama("Kisame Hoshigaki");
        obj6.setDesa("Kiri");
        System.out.println("Nama : "+obj6.getNama());
        System.out.println("Asal Desa : "+obj6.getDesa());
        Kekuatan obj7 = new Kekuatan();
        obj7.setKekuatan("Ikan HIU");
        System.out.println("Kekuatan : "+obj7.getKekuatan());

        System.out.println("");
    }
}
