package com.epam.amorozov.module.ten.soap.utils;

import com.epam.amorozov.module.ten.soap.models.PaymentEntity;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.ResultSetExtractor;
import org.springframework.stereotype.Component;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

@Component
public class PaymentExtractor implements ResultSetExtractor<List<PaymentEntity>> {
    private static final String ID_PAYMENT_IN_DB_COLUMN = "id";
    private static final String PAYMENT_ID_COLUMN = "payment_id";
    private static final String PAYMENT_AMOUNT_COLUMN = "payment_amount";
    private static final String DATE_OF_PAYMENT_COLUMN = "date_of_payment";

    @Override
    public List<PaymentEntity> extractData(ResultSet rs) throws SQLException, DataAccessException {
        while (rs.next()) {

        }
        return null;
    }
}
