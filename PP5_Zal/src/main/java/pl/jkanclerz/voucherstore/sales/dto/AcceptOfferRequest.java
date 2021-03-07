package pl.jkanclerz.voucherstore.sales.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import pl.jkanclerz.voucherstore.sales.ClientDetails;
import pl.jkanclerz.voucherstore.sales.offer.Offer;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class AcceptOfferRequest {
    @NotNull
    private Offer seenOffer;
    @NotNull
    private ClientDetails clientDetails;
}
