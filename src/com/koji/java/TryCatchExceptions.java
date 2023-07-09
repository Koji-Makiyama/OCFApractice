package com.koji.java;

public class TryCatchExceptions {

    public static void main(String[] args){
        try {
            System.out.println("Inside try");
            //throw new NullPointerException();
            //throw new IndexOutOfBoundsException();
            //throw new Exception();
        } catch (NullPointerException e){
            System.out.println(e);
        } catch (IndexOutOfBoundsException e) {
            System.out.println(e);
        } catch (Exception e) {
            System.out.println(e);
        } finally {
            System.out.println("Made it to the finally block!");
        }
    }
}
