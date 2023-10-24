package InterfaceAssignment2;

public class SMSNotificationSender implements SMSNotification{
    private String[] phoneNumbers;
    @Override
    public void sendNotification(String message) {
        System.out.println("Email notification send to: " +String.join(",",phoneNumbers));
        System.out.println("Message : " +message);
    }

    @Override
    public void setPhoneNumbers(String[] phoneNumbers) {
        this.phoneNumbers = phoneNumbers;

    }
}
