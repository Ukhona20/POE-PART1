public class Login {

    private String UserName;
    private String Password;
    private String firstName;
    private String lastName;
    private boolean loggedIn=false;


    public Login(String UserName, String Password, String firstName, String lastName) {
        this.UserName = UserName;
        this.Password = Password;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public Login() {

    }

    public String loginUser(String enteredUserName, String enteredPassword) {
        if (enteredUserName.equals(this.UserName) && enteredPassword.equals(this.Password)) {
            this.loggedIn=true;
            QuickChat.startChat();
            return "Welcome" + " " + firstName + " " + "It is great to see you again and BYE BYE!" ;
        } else {
            return "UserName or Password incorrect. Please try again.";
        }
    }

    public boolean isLoggedIn() {
        return loggedIn;
    }
    public String getFirstName() { return firstName; }
    public String getLastName()  {  return lastName; }
    public String getUsername()  {  return UserName; }



}

