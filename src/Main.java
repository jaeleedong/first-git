class Main {
    static boolean isNumber(String str) {
        boolean result = false;
        try {
            for (int i = 0; i < str.length(); i++) {
                if ((str.charAt(i) - 48 >= 0) && (str.charAt(i) - 48 <= 9)) {
                    result = true;
                } else {
                    result = false;
                    break;
                }
            }
            return result == true ? true : false;
        } catch (Exception e) {
            return false;
        }
    }
        public static void main (String[]args){
            String str = "123";
            System.out.println(str + "  는 숫자입니까? " + isNumber(str));
            str = "12o34";
            System.out.println(str + "  는 숫자입니까? " + isNumber(str));
            str = null;
            System.out.println(str + "  는 숫자입니까? " + isNumber(str));
            str = " ";
            System.out.println(str + "  는 숫자입니까? " + isNumber(str));
            MyTv2 t = new MyTv2();
            t.setChannel(10);
            System.out.println("CH:"+t.getChannel());
        }
    }
