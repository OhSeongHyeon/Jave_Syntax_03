package org.example;

// 문제 : 실행되는 출력문에는 참 그렇지 않으면 거짓 이라고 적어주세요.

class Main {
    public static void main(String[] args) {
        if ( true ) {
            System.out.println("참");
        }

        if ( false ) {
            System.out.println("거짓");
        }

        int a = 10;

        // `==` => 같다.
        if ( a == 10 ) {
            System.out.println("t1");
        }

        // `!=` => 같지 않다.
        if ( a != 10 ) {
            System.out.println("f1");
        }

        if ( a > 10 ) {
            System.out.println("f2");
        }

        if ( a >= 10 ) {
            System.out.println("t2");
        }

        int b = 10;

        if ( a == b ) {
            System.out.println("t3");
        }

        // boolean c => c 에는 오직 true/false 만 담을 수 있다.
        boolean c = a != b;

        if ( c ) {
            System.out.println("f3");
        }

        if ( c == false ) {
            System.out.println("t4");
        }

        // `!` => 반전
        if ( !c ) {
            System.out.println("t5");
        }

        // `!` => 반전
        if ( !(!c) ) {
            System.out.println("f4");
        }

        boolean d = true;

        if ( c != d ) {
            System.out.println("t6");
        }

        if ( 20 > 2 && 10 > 3 && true != false && 10 != 10 ) {
            System.out.println("f5");
        }

        if ( 10 != 10 || 10 < 2 ) {
            System.out.println("f6");
        }
    }
}