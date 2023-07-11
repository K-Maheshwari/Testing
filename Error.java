package error;

import java.lang.AbstractMethodError;

public class Error {

    public static int setAge(int age) throws LowAgeException, AbstractMethodError {
        if (age < 18) {
            throw new LowAgeException("Error : Age Very low");
        } else if (age == 18) {
            throw new AbstractMethodError();
        } else {
            return age;
        }
    }

    public static String getPhno(String phno) throws NumberMismatchException {
        for (char c : phno.toCharArray()) {
            if (!((int) c >= 48 && (int) c <= 57)) {//ASCII values 48->0 and 57->9
                throw new NumberMismatchException(c);
            }

        }
        return phno;
    }

    public static void main(String[] args) {
//        try {
//            System.out.println(setAge(18));
//        } catch (LowAgeException ex) {
//            System.out.println(ex);
//        } catch (AbstractMethodError ex) {
//            System.out.println(ex);
//        }
        try {
            System.out.println(getPhno("908O765655"));
        } catch (NumberMismatchException ex) {
            System.out.println(ex);
        }
    }

}
