package pl.jkanclerz.voucherstore.sales.productd;

public interface ProductDetailsProvider {
    ProductDetails getByProductId(String productId);
}
