package InterfaceAssignment2;

public class PushNotificationSender implements PushNotification{
    @Override
    public void sendNotification(String message) {
        System.out.println("Message: " + message);
    }

    @Override
    public void pushNotification() {
        System.out.println("Sending push notification");

    }
}
