public class test_complex {
    public static void main(String[] args) {
        Complex n1 = new Complex(2, 3);
        Complex n2 = new Complex(5, 8);
        n1.display();
        n2.display();
        Complex n3 = new Complex();
        n3 = n3.add(n1, n2);      //n3作为接收加法结果的对象
        n3.display();
        System.out.println(n1.toString());
    }
}
