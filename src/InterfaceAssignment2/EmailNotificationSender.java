package InterfaceAssignment2;

public class EmailNotificationSender implements EmailNotification{
    private String[] recipients;
    @Override
    public void setRecipients(String[] recipients) {
        this.recipients =recipients;
    }

    @Override
    public void sendNotification(String message) {
        System.out.println("Email notification send to: " +String.join(",",recipients));
        System.out.println("Message : " +message);

    }
}
