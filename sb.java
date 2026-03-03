class SB {
    public static void main(String args[]) {

        StringBuffer sb = new StringBuffer("hello");

        sb.append("world");
        sb.insert(5, "java");
        sb.delete(5,9);

        System.out.println(sb);
    }
}