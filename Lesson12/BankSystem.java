package Lesson12;

public interface BankSystem {
    void withdraw(User user, int amount);
    void fund(User user, int amount);
    void transferMoney(User fromUser, User toUser);
    void paySalary(User user);
}
