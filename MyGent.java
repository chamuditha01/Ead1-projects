public class MyGent<T> {
    T abj;

    void add(T abj) {
        this.abj = abj;
    }

    T get() {
        return abj;
    }

    public static class GenEX {
        public static void main(String args[]) {
            MyGent<Integer> m = new MyGent<>();
            m.add(2);
            System.out.println(m.get());
        }
    }
}