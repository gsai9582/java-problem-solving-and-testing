public class LoginValidator {
    public boolean validate(String username, String password){
        if(username == null || password == null) return false;
        if(username.isEmpty() || password.isEmpty()) return false;
        return username.equals("admin") && password.equals("1234");
    }
}