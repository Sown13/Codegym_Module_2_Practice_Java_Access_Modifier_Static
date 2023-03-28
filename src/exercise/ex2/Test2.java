package exercise.ex2;

public class Test2 {

        private int[] arr = {1,2,3};
        private static int a = 0;
    private  int b = 0;

        public static void main(String[] args) {
            modify(a);
            Test2 b = new Test2();
            modify(b.b);
            System.out.println(a);
            System.out.println(b.b);
        }
        static void modify(int num){
            num++;
        }

}
