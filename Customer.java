public class Customer {


    private String firstName;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public Account getAccount() {
        return account;
    }

    public void setAccount(Account account) {
        this.account = account;
    }

    private String lastname;
    private Account account;


    public Customer(String firstName, String lastname, Account account) {
        this.firstName = firstName;
        this.lastname = lastname;
        this.account = account;
    }




}
