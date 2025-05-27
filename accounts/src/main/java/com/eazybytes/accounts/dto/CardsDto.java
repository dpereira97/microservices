package com.eazybytes.accounts.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Positive;
import jakarta.validation.constraints.PositiveOrZero;
import lombok.AllArgsConstructor;
import lombok.Data;

@Schema(name = "Cards",
        description = "Schema to hold Card information"
)
@Data
@AllArgsConstructor
public class CardsDto {

    @NotEmpty(message = "Mobile Number can not be a null or empty")
    @Pattern(regexp = "(^$|[0-9]{10})", message = "Mobile Number must be 10 digits")
    @Schema(
            description = "Mobile Number of Customer", example = "4354437687"
    )
    private String mobileNumber;

    @NotEmpty(message = "Card Number can not be a null or empty")
    @Pattern(regexp = "(^$|[0-9]{12})", message = "CardNumber must be 12 digits")
    @Schema(
            description = "Card Number of the customer", example = "100646930341"
    )
    private String cardNumber;

    @NotEmpty(message = "CardType can not be a null or empty")
    @Schema(
            description = "Type of the card", example = "Credit Card"
    )
    private String cardType;

    @Positive(message = "Total card limit should be greater than zero")
    @Schema(
            description = "Total amount limit available against a card", example = "100000"
    )
    private int totalLimit;

    @PositiveOrZero(message = "Total amount used should be equal or greater than zero")
    @Schema(
            description = "Total amount used by a Customer", example = "1000"
    )
    private int amountUsed;

    @PositiveOrZero(message = "Total available amount should be equal or greater than zero")
    @Schema(
            description = "Total available amount against a card", example = "90000"
    )
    private int availableAmount;

    public CardsDto() {
    }

    public @NotEmpty(message = "Mobile Number can not be a null or empty") @Pattern(regexp = "(^$|[0-9]{10})", message = "Mobile Number must be 10 digits") String getMobileNumber() {
        return this.mobileNumber;
    }

    public @NotEmpty(message = "Card Number can not be a null or empty") @Pattern(regexp = "(^$|[0-9]{12})", message = "CardNumber must be 12 digits") String getCardNumber() {
        return this.cardNumber;
    }

    public @NotEmpty(message = "CardType can not be a null or empty") String getCardType() {
        return this.cardType;
    }

    public @Positive(message = "Total card limit should be greater than zero") int getTotalLimit() {
        return this.totalLimit;
    }

    public @PositiveOrZero(message = "Total amount used should be equal or greater than zero") int getAmountUsed() {
        return this.amountUsed;
    }

    public @PositiveOrZero(message = "Total available amount should be equal or greater than zero") int getAvailableAmount() {
        return this.availableAmount;
    }

    public void setMobileNumber(@NotEmpty(message = "Mobile Number can not be a null or empty") @Pattern(regexp = "(^$|[0-9]{10})", message = "Mobile Number must be 10 digits") String mobileNumber) {
        this.mobileNumber = mobileNumber;
    }

    public void setCardNumber(@NotEmpty(message = "Card Number can not be a null or empty") @Pattern(regexp = "(^$|[0-9]{12})", message = "CardNumber must be 12 digits") String cardNumber) {
        this.cardNumber = cardNumber;
    }

    public void setCardType(@NotEmpty(message = "CardType can not be a null or empty") String cardType) {
        this.cardType = cardType;
    }

    public void setTotalLimit(@Positive(message = "Total card limit should be greater than zero") int totalLimit) {
        this.totalLimit = totalLimit;
    }

    public void setAmountUsed(@PositiveOrZero(message = "Total amount used should be equal or greater than zero") int amountUsed) {
        this.amountUsed = amountUsed;
    }

    public void setAvailableAmount(@PositiveOrZero(message = "Total available amount should be equal or greater than zero") int availableAmount) {
        this.availableAmount = availableAmount;
    }

    public boolean equals(final Object o) {
        if (o == this) return true;
        if (!(o instanceof CardsDto)) return false;
        final CardsDto other = (CardsDto) o;
        if (!other.canEqual((Object) this)) return false;
        final Object this$mobileNumber = this.getMobileNumber();
        final Object other$mobileNumber = other.getMobileNumber();
        if (this$mobileNumber == null ? other$mobileNumber != null : !this$mobileNumber.equals(other$mobileNumber))
            return false;
        final Object this$cardNumber = this.getCardNumber();
        final Object other$cardNumber = other.getCardNumber();
        if (this$cardNumber == null ? other$cardNumber != null : !this$cardNumber.equals(other$cardNumber))
            return false;
        final Object this$cardType = this.getCardType();
        final Object other$cardType = other.getCardType();
        if (this$cardType == null ? other$cardType != null : !this$cardType.equals(other$cardType)) return false;
        if (this.getTotalLimit() != other.getTotalLimit()) return false;
        if (this.getAmountUsed() != other.getAmountUsed()) return false;
        if (this.getAvailableAmount() != other.getAvailableAmount()) return false;
        return true;
    }

    protected boolean canEqual(final Object other) {
        return other instanceof CardsDto;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final Object $mobileNumber = this.getMobileNumber();
        result = result * PRIME + ($mobileNumber == null ? 43 : $mobileNumber.hashCode());
        final Object $cardNumber = this.getCardNumber();
        result = result * PRIME + ($cardNumber == null ? 43 : $cardNumber.hashCode());
        final Object $cardType = this.getCardType();
        result = result * PRIME + ($cardType == null ? 43 : $cardType.hashCode());
        result = result * PRIME + this.getTotalLimit();
        result = result * PRIME + this.getAmountUsed();
        result = result * PRIME + this.getAvailableAmount();
        return result;
    }

    public String toString() {
        return "CardsDto(mobileNumber=" + this.getMobileNumber() + ", cardNumber=" + this.getCardNumber() + ", cardType=" + this.getCardType() + ", totalLimit=" + this.getTotalLimit() + ", amountUsed=" + this.getAmountUsed() + ", availableAmount=" + this.getAvailableAmount() + ")";
    }
}
