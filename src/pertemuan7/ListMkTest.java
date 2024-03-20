package pertemuan7;

public class ListMkTest {
    public static void main(String[] args) {
//        Latihan 4
        ListMataKuliah list = new ListMataKuliah();

        list.addHead(new MataKuliah("IF001","Dasar Pemrograman", 4));
        list.addHead(new MataKuliah("IF002","Pemrograman Web", 3));
        list.displayElement();

//        Test 1
        ListMataKuliah list1 = new ListMataKuliah();
        list1.addHead(new MataKuliah("IF001","Dasar Pemrograman", 4));
        list1.addHead(new MataKuliah("IF002","Pemrograman Web", 3));
        list1.addHead(new MataKuliah("IF003","Struktur Diskrit", 3));
        list1.addHead(new MataKuliah("IF004","Konstruksi PL Berorientasi Objek", 3));
        list1.displayElement();

//        Test 4
        ListMataKuliah list4 = new ListMataKuliah();
        list4.addTail(new MataKuliah("IF004","Konstruksi PL Berorientasi Objek", 3));
        list4.addTail(new MataKuliah("IF001","Dasar Pemrograman", 4));
        list4.addMid(new MataKuliah("IF002","Pemrograman Web", 3),2);
        list4.addMid(new MataKuliah("IF003","Struktur Diskrit", 3),2);
        list4.displayElement();
    }
}
