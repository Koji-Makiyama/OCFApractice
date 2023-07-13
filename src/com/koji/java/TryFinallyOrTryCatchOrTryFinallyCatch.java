package com.koji.java;

public class TryFinallyOrTryCatchOrTryFinallyCatch {

    public static void main(String[] args) {

        // try-catch can run without a try-catch if it's try-finally
        try {
            System.out.println("TRY WITHOUT CATCH");
            //throw new Exception();
        } finally {
            System.out.println("FINALLY");
        }
    }
}
