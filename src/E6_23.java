public class E6_23 {
    static int max(int [] arr) {
        try {
            for (int i = 0; i < arr.length; i++) {
                if (arr[0] < arr[i]) {
                    arr[0] = arr[i];
                    return arr[0];
                }
            }
            return arr[0];
        }catch (Exception e){
            return -99999;
        }
    }
    public static void main(String[] args) {
        int[] data = {3,2,9,4,7};
        System.out.println(java.util.Arrays.toString(data));
        System.out.println(" 최대값:"+max(data));
        System.out.println(" 최대값:"+max(null));
        System.out.println(" 최대값:"+max(new int[]{})); // 0 최대값 크기가 인 배열
        System.out.println(java.util.Arrays.toString(data));

    }
}
