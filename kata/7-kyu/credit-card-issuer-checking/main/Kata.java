interface Kata {
    static String getIssuer(String cardNumber) {
        return cardNumber.matches("^3[4|7].{13}$") ? "AMEX"
             : cardNumber.matches("^6011.{12}$") ? "Discover"
             : cardNumber.matches("^5[1-5].{14}$") ? "Mastercard"
             : cardNumber.matches("^4.{12}(...)?$") ? "VISA" : "Unknown";
    }
}