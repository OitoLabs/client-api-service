package com.oito.client;

import com.oito.common.exception.errorcode.BaseCode;

import lombok.Getter;

@Getter
public enum ErrorCode implements BaseCode {
	EMAIL_UPDATE_AUTH_FAILURE("Email Update in Authentication Service Failed"),
	EMAIL_UPDATE_PROMOTION_FAILURE("Email Update in Promotion Service Failed"),
	EMAIL_UPDATE_ORDER_FAILURE("Email Update in Order Service Failed"), INSTALLER_FOUND("Installer Found"),
	SELLER_FOUND("Seller Found"), EMAIL_UPDATE_TALKJS_FAILURE("Email Update in TalkJs Failed"),
	SELLER_CALL_FAILURE("Seller API call Failed"), EMAIL_UPDATE_FAILURE("Email rollback attempt failed"),
	UN_AUTHORIZED("You are not authorized to access this method", 403),
	INVALID_LIMIT_RANGE("Limit Value Should be in Range of 1 to 100  "),
	INVALID_PAGE_RANGE("Page Value Should be in Range of 1 to 50"),
	ORDER_PENDING_WITH_USER("Order Pending with User", 200), IO_REACTOR_ERROR("IO Reactor Error Occured"),
	INVALID_PHONE("Please enter proper phone number"), SKU_DOES_NOT_EXIST("Product Doest Not Exist"),
	INVALID_USER_ID("Invalid User ID"), VALIDATION_FAILED("validation failed"),
	LATITUDE_AND_LONGITUDE_NOT_FOUND("Not able to find address with given latitude and longitude"),
	ADDRESS_NOT_FOUND("Address Not Found"), ADDRESS_IDENTIFIER_ERROR("Address Identifier Should not be empty or blank"),
	NOT_FOUND("Unable to locate any data"), INVALID_INPUT("Please enter valid input"),
	INVALID_BILLING_ADDRESS_ID("Please enter a valid billing address id"),
	BILLING_ADDRESS_ALREADY_PRESENT("Billing address already present"),
	BILLING_ADDRESS_NOT_PRESENT("Billing address not present"),
	NOT_FOUND_INSTALLMENT_OPTIONS("This product does not have any installment options"),
	INVALID_PRODUCT_ID("Invalid product id"),
	INVALID_SUGGEST_RANGE("Invalid size. The length of search string must be greater than or equal to 3"),
	OUT_OF_STOCK("Product is out of stock, can't move wishlist to cart");

	ErrorCode(final String message) {
		this.message = message;
		this.httpStatusCode = 500;
		this.messageKey = String.join(".", "buyer", null);
	}

	ErrorCode(final String message, final int httpStatusCode) {
		this(message);
		this.httpStatusCode = httpStatusCode;

	}

	@Override
	public String getCode() {
		return name();
	}

	private int httpStatusCode;
	private String message;
	private String messageKey;

}
