package com.in28minutes.exceptionhandling;

class Amount1 {
    private String currency;
    private int amount;

    public Amount1(String currency, int amount) {
        this.currency = currency;
        this.amount = amount;
    }

    public void add(Amount1 that) {
        if(!this.currency.equals(that.currency)) {
            //throw new Exception("Currencies Don't Match " + this.currency + " & " + that.currency);
            throw new CurrenciesDoNotMatchException("Currencies Don't Match " + this.currency + " & " + that.currency);
        }
            this.amount = this.amount + that.amount;
    }

    public String toString() {
        return amount + " " + currency;
    }
}

class CurrenciesDoNotMatchException extends RuntimeException {
    public CurrenciesDoNotMatchException(String message) {
        super(message);
    }
}

public class CustomExceptionCurrenciesDoNotMatch {
    public static void main(String[] args)  {
        Amount1 amount1 = new Amount1("USD", 10);
        Amount1 amount2 = new Amount1("EUR", 20);
        amount1.add(amount2);
        System.out.println(amount1);
    }
}
