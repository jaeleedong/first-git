public class E6_5 {
    public static void main(String[] args) {
        Student s = new Student("홍길동", 1, 1, 100, 60, 76);
        System.out.println(s.info());
    }
}
    class Student {
        String name;
        int ban;
        int no;
        int kor;
        int eng;
        int math;

        int getTotal() {
            return kor + eng + math;
        }

        float getAverage() {
            return (float) Math.round((float) (kor + eng + math) / 3 * 10) / 10;
        }

        Student(String na, int b, int n, int k, int e, int m) {
            name = na;
            ban = b;
            no = n;
            kor = k;
            eng = e;
            math = m;
        }

        String info() {
            return name + "," + ban + "," + no + "," + kor + "," + eng + "," + math + "," + getTotal() + "," + getAverage();
        }
    }


