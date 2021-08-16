package immutable;

public class Ex06 {
    public static void main(String[] args) {
        String[] ids = {"102", "190","789","228"};
        // Print: 102-190-789-228

        for (int i = 0; i < ids.length; i++
             ) {
            System.out.print(ids[i]);
            if ( i != ids.length - 1){
                System.out.print("-");
            }
        }
        System.out.println("\n------------------------");
        String value = String.join("-",ids);
        System.out.print(value);

        String a = "";
        String b = "";
        System.out.println("\n===================");
        printf();
        System.out.println("===================");
        printf(a,b);
        printf(ids);
        printf("11","333","6666","ffff","8888");
        // String[] ==  String ...
        // co the giup minh truyen 1 luc nhieu phan tu , khong phan tu , hoac khong phan tu

    }

    // chu y:
    // ... variables
    private static void printf(String ... ids){
        for (String id: ids
             ) {
            System.out.println(id);
        }
    }
}
