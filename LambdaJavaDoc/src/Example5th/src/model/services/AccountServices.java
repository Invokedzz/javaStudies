package LambdaJavaDoc.src.Example5th.src.model.services;

import LambdaJavaDoc.src.Example5th.src.model.entities.Account;

public interface AccountServices {

    double withdraw ( Account acc, Double amount );

    double deposit ( Account acc, Double amount );

}
