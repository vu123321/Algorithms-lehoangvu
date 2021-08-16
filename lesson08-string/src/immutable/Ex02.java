package immutable;

/**
 * kiễm tra kí tự bắt đầu , kết thúc trong chuổi s có phải s1 hay không ? .
 * Thay thế chuổi s1 bằng chuỗi s2 trong s .
 * Loại bỏ các khoảng trắng thừa của chuổi s3 .
 * Tạo chuổi con s4 từ chuỗi s bắt đầu từ vị trí số 2 .
 */
public class Ex02 {
    public static void main(String[] args) {
        // SGK123, SGK234, STK345,STK456 .
        String[] books = {"SGK123", "SGK234-KM", "STK345","STK456"};
        for (String book:books
             ) {
            System.out.println(book+" isTextBook: "+book.startsWith("SGK"));

            System.out.println(book+" is SaleOff: "+book.endsWith("KM"));
        }

        // Replace :thay the.
        String s = "Hello nam ";
        String replaced = s.replace("Hello","Hi");// Hi nam .
        System.out.println("s: "+s);
        System.out.println("replaced:"+replaced);

        String redundantSpace = " Cheers                         from   Viet      Nam  ";// redundantSpace : thừa .

        // regex: replace 1 or n white spaces to 1 white space .
//        String removed = redundantSpace.trim().replaceAll("\\s{1,10}"," ");

//        String removed = redundantSpace.trim().replaceAll("\\s{1,}"," ");

        // +: 1 || n == {1,}
        String removed = redundantSpace.trim().replaceAll("\\s+"," ");
        System.out.println("redundantSpace: "+redundantSpace);
        System.out.println(removed);

        // tao chuoi s bat dau tu vi tri so 2 .
        String parent = "abcdefgh";// lay cdefgh
        String generation = "xyzv";
        String child = parent.substring(2 ,3);
        String childs = parent.substring(3);

        System.out.println("child :"+child);
        System.out.println("childs: "+childs);

        System.out.println("contains01 :"+parent.contains(child));
        System.out.println("contains02 :"+(parent.indexOf(child) != -1));
        System.out.println("======================");

        System.out.println("contains03 :"+parent.contains(generation));
        System.out.println("contains04 :"+(parent.indexOf(generation) != -1));


    }
}
