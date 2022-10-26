package src.main.java.mappers;

import src.main.java.dao.models.Payment;

import java.util.List;

public interface PaymentMapper {
    Payment selectPayment(int id);
    List<String> selectPaymentByName(String Name);
}
