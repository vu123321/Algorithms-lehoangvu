package immutable;

/**
 * tinh chieu dai cua chuoi
 * Noi chuoi
 * Lay mot ki tu tai vi tri index trong chuoi
 * Duyet tung phan tu , ki tu trong chuoi
 * Tìm vị trí xuất hiện đầu tiên , cuối cùng của chuổi s1 trong chuỗi s2
 */
public class AnotherEx01 {
    public static void main(String[] args) {

        String s = "welcome";
        System.out.println("s1: "+s);
        // tinh chieu dai chuoi
        System.out.println("length :"+s.length());

        // noi chuoi
       String  s1 = s + " to Java 12"; // cach 1
        System.out.println("s1 :"+s1);

        String s2 = s.concat("to Java 12"); // cach 2
        System.out.println("s2: "+s2);

        // Lấy 1 kí tự tại vị trí index trong chuỗi .
        System.out.println("index = 3 la :"+s.charAt(3));

        // duyệt từng phần tử trong chuõi .

        System.out.println("====  Iterating ====");
        for (int i = 0 ; i < s.length();i++) {
            System.out.print(s.charAt(i)+" ");
        }
        System.out.println();

        // Tim vi tri xuat hien dau tien cua s1 trong s2
        // s1: welcome
        // s: welcome to hello.
        System.out.println("------------------------------");
        System.out.println("s: "+s);
        System.out.println("s2:"+s1);
        System.out.println("start e : "+s.indexOf("e")); // 1
        System.out.println("start l : "+s.indexOf("l"));// 2
        System.out.println("last e :"+s.lastIndexOf("e")); // 6
        System.out.println("start j: "+s.indexOf("j"));// return -1. vi khong co
        System.out.println("start welcome :"+s2.indexOf("welcome"));// 0. ( welcome to hello)

        System.out.println("s1: "+s1);
        System.out.println("contains: "+s1.indexOf("to"));
    }
}
