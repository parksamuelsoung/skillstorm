public class SubscriptionService {

    NotUsingAutoboxing notUsingAutoboxing = new NotUsingAutoboxing();
    UsingAutoboxing usingAutoboxing = new UsingAutoboxing();
    UsingAutoboxingInCollection usingAutoboxingInCollection = new UsingAutoboxingInCollection();

    public void saveId(int subscriptionMemberId) {
        notUsingAutoboxing.saveId(subscriptionMemberId);
        usingAutoboxing.saveId(subscriptionMemberId);
        usingAutoboxingInCollection.saveId(subscriptionMemberId);
    }

    public void getId(int currentIdToCall) {
        notUsingAutoboxing.getId(currentIdToCall);
        usingAutoboxing.getId(currentIdToCall);
        usingAutoboxingInCollection.getId(currentIdToCall);
    }

    public static void main(String[] args) {
        SubscriptionService subscriptionService = new SubscriptionService();
        subscriptionService.saveId(1);
        subscriptionService.getId(0);
    }

}
