package lesson16;

/**
 * Created by UITS-Admin on 14.06.2017.
 */
public class TaskException1 {
    public static void main(String[] args) {

        validate("LoginTest1", "qaz123wsx", "qaz123wsx");
        System.out.println();
        validate("looooooooooooonglogin1", "1111", "1111");
        System.out.println();
        validate("diffpass", "Qaz123wsx", "qaz123wsx");
        System.out.println();
        validate("longpass", "loooooooooooooooooooongpassword", "loooooooooooooooooooongpassword");

    }

    public static boolean validate(String log1, String pass, String confPass) {
        try {
            if (log1.length() > 20) {
                System.out.println("Long login");
                throw new WrongLoginException(log1);
            }
            if (pass.length() > 20) {
                System.out.println("Long password");
                throw new WrongPasswordException(pass);
            }
            if (pass.equals(confPass)) {
                System.out.println("OK");
            } else {
                System.out.println("different passwords");
                throw new WrongPasswordException(pass);
            }
        } catch (WrongLoginException | WrongPasswordException e) {
            System.out.println(e.fillInStackTrace());
        } finally {
            System.out.println("Login: " + log1);
            System.out.println("Password: " + pass);
            System.out.println("Password confirmation: " + confPass);
        }
        boolean a = false;
        if (log1.length() < 20 & pass.length() < 20 & pass.equals(confPass)) {
            a = true;
        }
        return a;
    }
}
