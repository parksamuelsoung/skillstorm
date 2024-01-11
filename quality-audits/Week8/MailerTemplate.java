public class MailerTemplate {

    private String fullName;
    private String address;
    private String mailMessage;
    
    public MailerTemplate(String fullName, String address) {
        this.fullName = fullName;
        this.address = address;
        this.mailMessage = "";
    }

    public String getFullName() {
        return fullName;
    }
    
    public String getAddress() {
        return address;
    }

    public void setMailMessage(String mailMessage) {
        this.mailMessage = mailMessage;
    }

    @Override
    public String toString() {
        return String.format("%n%s%n%s%s%n", 
            fullName, address, mailMessage);
    }

    

}