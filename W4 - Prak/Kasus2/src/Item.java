public class Item {
    private String name;

    private Item(){
        name = "Ipin";
    }

    public Item(String name) {
        this();
        System.out.println(this.name);

    }
}

/*
Var name merupakan variable yang dienkapsulasi pada class item.
Dengan menambahkan statement this() pada kelas Item di bagian
constructor kelas, maka akan memanggil constructor yang lain
didalam kelas item.
*/

