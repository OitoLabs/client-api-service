/**
 *
 */
package com.oito.client;

import java.util.List;
import java.util.Map;

import lombok.AccessLevel;
import lombok.NoArgsConstructor;

/**
 * @author krishna
 *
 */
@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class MobileConstants {
	public static final String IMAGE = "IMAGE";
	public static final String VIDEO = "VIDEO";
	public static final String PERCENT = "percent";
	public static final String IS_EXTRA_TAG = "isExtraTag";
	public static final String HOT_CHOICE = "hotchoice";
	public static final String AUTO_HOT_CHOICE = "autohotchoice";

	public static final String NOC_CHOICE = "nocchoice";
	public static final String NN_CHOICE = "NN_CHOICE";

	public static final String BEST_PRICE = "BEST_PRICE";
	public static final String BEST_PRICE_IMG = "best-price.svg";

	public static final String FREE_INSTALLATION = "FREE_INSTALLATION";
	public static final String FREE_INSTALLATION_IMG = "free-installation.svg";
	public static final String FREE_INSTALLATION_IMG1 = "FreeInstallation.svg";
	public static final String FREE_INSTALLATION_TITLE = "ฟรี ! บริการติดตั้งจากผู้ขาย";
	public static final String FREE_INSTALLATION_DESC = "เมื่อคุณเลือกการจัดส่งโดยผู้ขายในขั้นตอนการชำระเงินเท่านั้น";

	public static final String INSTALLMENT = "INSTALLMENT";
	public static final String INSTALLMENT_IMG = "Payment.svg";
	public static final String INSTALLMENT_TITLE = "ผ่อนชำระ 0% นาน 4 เดือน จาก NocNoc";
	public static final String INSTALLMENT_DESC = "สำหรับการสั่งซื้อขั้นต่ำ";

	public static final String FREE_SHIPPING = "FREE_SHIPPING";
	public static final String FREE_SHIPPING_IMG = "free-shipping.svg";

	public static final String YES = "yes";
	public static final String SELLER = "seller";
	public static final String PRODUCT_SERVICE = "productwithservice";
	public static final List<String> PROVIDER = List.of(SELLER, "platform");
	public static final List<String> SPECIAL_TAGS = List.of(NOC_CHOICE, SELLER, HOT_CHOICE, AUTO_HOT_CHOICE);
	public static final String TITLE = "title";
	public static final String COUPONS = "coupons";
	public static final String OBJECT_ID = "objectId";
	public static final String PERCENTAGE_SYMBOL = "%";

	public static final String ALL = "all";
	public static final String PDP = "pdp";
	public static final String ADS = "ads";
	public static final String SPECIAL = "special";
	public static final String GLOBAL = "global";
	public static final String SECTIONS = "sections";

	public static final String CP_MIN_THRESHOLD = "cheapestPriceMinThreshold";
	public static final String CP_SHOW_PERIOD = "cheapestPriceShowPeriod";
	public static final String SHOW_SIMILAR_PDCT_IN_PDP = "showSimilarProductsInPdp";
	public static final String CURRENCY = "currency";

	public static final String WEB_LINK = "webLink";
	public static final String SIMILAR_AVAILABLE = "similarAvailable";

	public static final String TAG_REGEX = "\\<.*?\\>";
	public static final String AMOUNT = "amount";
	public static final String DISCOUNT_VALUE = "discountValue";
	public static final String SHOP_NAME = "shopName";
	public static final String MIN_ORDER_VAL = "minimumOrderValue";
	public static final String SELLER_REGISTERED_TIME = "sellerRegisteredTime";
	public static final String MAX_ALLOWED_DISCOUNT = "maxDiscount";

	public static final String PROMO_FORMAT = "%s%s: %s";
	public static final String FQ = "fq";
	public static final String CT = "ct";
	public static final String TOTAL_ITEMS = "totalItems";
	public static final String FRAME = "frame";
	public static final String MORE_OPTION = "nMoreOption";
	public static final String VARIANT_OPTION = "variantNOption";
	public static final String TRANSFORM_DATA = "transformData";
	public static final String OVERALL_RATING = "overallRating";
	public static final String ITEMS = "items";
	public static final String DISCOUNT_INFO = "DISCOUNT_INFO";
	public static final String PROMOTIONS_BOOKLET = "/promotions/booklet-";
	public static final String ASSET = "ASSET";
	public static final String FILTER_ASSET = "asset";
	public static final String SCORE = "SCORE";
	public static final String SCORE_ONE = "score1";
	public static final String SCORE_TWO = "score2";
	public static final String SCORE_THREE = "score3";
	public static final String SCORE_FOUR = "score4";
	public static final String SCORE_FIVE = "score5";
	public static final String EQUAL_SIGN = "=";
	public static final String TOP_RATED = "topRated";
	public static final String MONTH = "month";
	public static final String DATE = "date";
	public static final String TYPE = "type";
	public static final String BUYER = "buyer";
	public static final String IMAGE_URL = "imageUrl";
	public static final String UNIT = "unit";

	public static final Map<String, String> DELIVERY_TYPES = Map.of("economyDelivery",
			"buyer.ordersummary.economy_delivery", "expressDelivery", "buyer.ordersummary.express_delivery",
			"standardDelivery", "buyer.ordersummary.standard_delivery", "customExpressDelivery",
			"buyer.ordersummary.custome_express_delivery", "premiumDelivery", "buyer.ordersummary.premium_delivery",
			"sellerDelivery", "buyer.ordersummary.seller_delivery", "WAREHOUSE_PICK_UP",
			"buyer.ordersummary.warehouse_pickup", "warehousePickup", "buyer.ordersummary.warehouse_pickup");
}
