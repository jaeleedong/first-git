public class Person {
    private String name;
    private int high;
    private String phoneNumber;

    Person( String n, int h, String p) {
        //매개변수로 받은 값을 필드에 저장
        name = n;
        high = h;
        phoneNumber = p;
    }

    Person() {
        System.out.println(" = ");
    }
    void walk() {
        String sound = "뚜벅뚜벅";
        System.out.println(sound);
    }
    void walk(String sound){
        System.out.println(sound);
    }
    public void eat(String foodName) {
        System.out.println(foodName + "냠냠");
    }
    //public은 중괄호에 대한 설명
    //void, 소괄호 안에 적어둔 것도 중괄호 안에 대한 설명
    //매개변수는 메소드 밖에서 쓸 수 없다. = lv
}
/*
필드 : 생성자에서 매개변수로 받을값 을 담아줄 공간
private String name;
private int tall;
*/