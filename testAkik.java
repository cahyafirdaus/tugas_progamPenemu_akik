/**
 * Created by Yolland on 6/10/2015.
 */
public class testAkik {
    public static void main(String[] args) {
        penemu_akik yolland = new penemu_akik("Yoland","Lumajang","kunir",'p',"islam");
        System.out.println(yolland.toString());
        batu_akik ruby = new batu_akik("Ruby","Merah",5000000.0,"Lumajang",yolland);
        System.out.println(ruby.toString());
    }
}
