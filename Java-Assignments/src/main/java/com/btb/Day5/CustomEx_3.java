package com.btb.Day5;
import lombok.*;

public class CustomEx_3 {
    public static void main(String[] args) {
        CurrMonthChecker m = new CurrMonthChecker();
        m.currMonCheck("jUlY");

    }
}

class CurrMonthChecker{
    Months currMon = new Months("July");

    public void currMonCheck(String month) throws RuntimeException{
        if (month.equalsIgnoreCase("july")){
            System.out.println(currMon.getMonth());
        }
        else {
            throw new InvalidMonthException("Invalid month entered.");
        }
    }
}

@Getter
@Setter
@AllArgsConstructor
@ToString
@NoArgsConstructor
class Months{
    private String month;
}

class InvalidMonthException extends RuntimeException{
    InvalidMonthException(String message){
        super(message);
    }
}