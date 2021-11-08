package home_work_2.txt.loops.runners;

import home_work_2.txt.loops.Loops12;

public class Loops12Main {
    public static void main(String[] args) {
        Loops12 loops12 = new Loops12();
        String str1 = "181232375";
        String str2 = "99,2";
        String str3 = "Привет";

        int tmp1 = loops12.validationAndParseNumber(str1);
        int[] tmp2 = loops12.separateNumber(tmp1);
        System.out.println(loops12.multiply(tmp2));

        int tmp3 = loops12.validationAndParseNumber(str2);
        int[] tmp4 = loops12.separateNumber(tmp3);
        System.out.println(loops12.multiply(tmp4));

        int tmp5 = loops12.validationAndParseNumber(str3);
        int[] tmp6 = loops12.separateNumber(tmp5);
        System.out.println(loops12.multiply(tmp6));
    }
}
