package pl.jkanclerz.voucherstore.sales.exceptions;

public class NotEnoughQuantityException extends IllegalStateException {
    public NotEnoughQuantityException() {
        super("Not enough products");
    }
}
