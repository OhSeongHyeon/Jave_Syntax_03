package org.example;

public class Main {

    public static void main(String[] args) throws Exception {
        System.out.println(ggdResult());
    }

    public static String ggdResult() {
        StringBuilder sb = new StringBuilder();
        appendGooGooDan(sb, 2, 9, 1, 9, 1);
        return sb.toString();
    }

    public static void appendGooGooDan(StringBuilder sb, int sd, int ed, int sm, int em, int danPrintAxis) {
        if(sd > ed) {
            return;
        }
        
        if(sm <= em) {
            if(sd <= em && sm == danPrintAxis) {
                sb.append(String.format("%d 단 출력\n", sd));
            }

            sb.append(String.format("%d * %d = %d\n", sd, sm, sd*sm));
            appendGooGooDan(sb, sd, ed, ++sm, em, danPrintAxis);

            if(sm == 9) {
                appendGooGooDan(sb, ++sd, ed, danPrintAxis, em, danPrintAxis);
            }
        }
    }

}