package data;

public class DataTypes {
    public static void main(String[] args) {
        int a = 70;
        int b = 10;
        int d = a + b;
        System.out.println("The integer:" +d);

        long w=900000;
        long l=400000;
        long h=w/l;
        System.out.println("The Long:" +h);

        short o=68;
        short n=20;
        short k= (short) (o*n);
        System.out.println("The Short:" +k);

        boolean result = true;
        System.out.println(result);

       char c='G';
       char x='M';
       String wish;
       wish = " "+c+x;
       System.out.println(wish);

        byte p=79;
        byte q=3;
        byte remainder=(byte)(p/q);
        System.out.println("The Byte:" +remainder);

        float sum = 10.5f;
        float total = 30.5f;
        float average = sum + total;
        System.out.println("The floating point:" +average);

        double m=10.999999999;
        double s=20.666666666;
        double g=m-s;
        System.out.println("The Double:" +g);

        String subject="ABC";
        String hall="Class10";
        String school= subject + hall;
        System.out.println("The String is:" +school);

        StringBuffer vb = new StringBuffer("City");
        vb.append("Trick");
        System.out.println(vb);

        StringBuilder sb = new StringBuilder("Good");
        sb.append("Morning");
        System.out.println(sb);

    }
}












