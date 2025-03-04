package org.example;

import java.io.*;
import java.util.concurrent.atomic.AtomicInteger;

public class Main {

    static AtomicInteger age = new AtomicInteger();
    static int askCnt = 0;

    public static void main(String[] args) {
        try(
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out))
        ) {
            bw.write("당신의 나이를 입력해주세요.\n");
            bw.flush();
            askYourAge(br, bw);
            if(askCnt >= 3) {
                bw.write(String.format("올바른 나이를 %d회 입력하지 않아 프로그램을 종료함.", askCnt));
                bw.flush();
                return;
            }
            int iAge = age.get();
            if      (iAge >=  0 && iAge < 10) bw.write("유아/아동\n");
            else if (iAge >= 10 && iAge < 20) bw.write("10대\n");
            else if (iAge >= 20 && iAge < 30) bw.write("20대\n");
            else if (iAge >= 30 && iAge < 40) bw.write("30대\n");
            else if (iAge >= 40)              bw.write("40대 이상\n");
            bw.flush();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    private static void askYourAge(BufferedReader br, BufferedWriter bw) throws IOException {
        try {
            int inputAge = Integer.parseInt(br.readLine());
            age.set(inputAge);
            if(askCnt > 0) askCnt = 0;
        } catch(NumberFormatException nfe) {
            if(++askCnt >= 3) return;
            bw.write("올바른 나이를 입력하시오.\n");
            bw.flush();
            askYourAge(br, bw);
        }
    }
}