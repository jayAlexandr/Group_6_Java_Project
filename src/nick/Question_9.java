package nick;

public class Question_9 {
    public static void main(String[] args) {

        System.out.println(isValidPassword("Password123!")); // true
        System.out.println(isValidPassword("pass123!"));     // false (no uppercase)
        System.out.println(isValidPassword("PASS123!"));     // false (no lowercase)
        System.out.println(isValidPassword("Password!"));    // false (no digit)
        System.out.println(isValidPassword("Password123"));  // false (no special char)
        System.out.println(isValidPassword("Pass 123!"));    // false (contains space)
        System.out.println(isValidPassword("Pas1!"));        // false (less than 6 chars)

    }

    public static boolean isValidPassword(String password) {

        if (password.length() < 6 || password.contains(" ")) {
            return false;
        }

        boolean hasUpper = false;
        boolean hasLower = false;
        boolean hasDigit = false;
        boolean hasSpecial = false;

        for (char ch : password.toCharArray()) {
            if (Character.isUpperCase(ch)) {
                hasUpper = true;
            } else if (Character.isLowerCase(ch)) {
                hasLower = true;
            } else if (Character.isDigit(ch)) {
                hasDigit = true;
            } else if (!Character.isLetterOrDigit(ch)) {
                hasSpecial = true;
            }
        }
        return hasUpper && hasLower && hasDigit && hasSpecial;
    }
}

/*
String -- Password Validation Task
Write a return method that can verify if a password is valid or not.
Requirements:
1.    Password MUST be at least have 6 characters and should not contain space
2.    PassWord should at least contain one upper case letter
3.    PassWord should at least contain one lowercase letter
4.    Password should at least contain one special characters
5.    Password should at least contain a digit
if all requirements above are met, the method returns true, otherwise returns false
*/