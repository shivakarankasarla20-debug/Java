class Multiplecatch {
    public static void main(String args[]) {
        try {
            int a = 10, b = 0;
            int c = a / b;
        } catch (ArithmeticException e) {
            System.out.println("arithmetic error");
        } catch (Exception e) {   
            System.out.println("general error");
        }
    }
}