/**
 *
 */
package com.oito.client;

import lombok.Getter;

public interface Constants {
	String ADDRESS_UPDATE = "ADDRESS_UPDATE";
	String URL_SEPARATOR = "/";
	String POST_LOGIN_URL = "postLoginUrl";
	String CHAT_ENABLED = "chatEnabled";
	String SUPPORT_CHAT_ENABLED = "supportChatEnabled";
	String CHECK_COOOKIE_CONSENT = "checkCoookieConsent";
	String TRACK_BA = "trackBA";
	String ALLOW_USER_DELETE = "allowUserDelete";
	String SOCIAL_LOGIN_ENABLED = "socialLoginEnabled";
	String IPP_ORDER_VALUE_THRESHOLD = "iPPOrderValueThreshold";
	String IPP_MIN_INTEREST_RATE = "iPPMinInterestRate";
	String CHEAPEST_PRICE_MIN_THRESHOLD = "cheapestPriceMinThreshold";
	String CHEAPEST_PRICE_SHOW_PERIOD = "cheapestPriceShowPeriod";
	String IPP_PROMOTIONAL_PERIOD = "iPPPromotionalPeriod";
	String IPP_BANKS_COMMON_LOGO = "iPPBanksCommonLogo";
	String IPP_ENABLED = "iPPEnabled";
	String IPP_TRIAL_MODE = "iPPTrialMode";
	String IPP_PAYMENT_MODES = "ipp";
	String PAYMENT_MODES = "paymentModes";
	String SUPPORT_USER_FOR_CHAT = "supportUserForChat";
	String RECORD_TYPE = "recordType";
	String USER_TYPE_BUYER = "BUYER";
	String USER_TYPE = "userType";
	String USER_ID = "userId";
	String STATIC_CONTENT_BUCKET = "staticContentBucket";
	String IMAGE_TYPE = "imageType";
	String DELETABLE = "deletable";
	String FIELDS = "fields";
	String LOCALE = "locale";
	String LANG = "lang";
	String EMAIL = "email";
	String OFFER = "offer";
	String PER_DISCOUNT = "perDiscount";
	String FILTER_PARAM_KEY = "f";
	String FILTER_KEYS = "filterKeys";
	String FILTER_OPTIONS = "filterOptions";
	String AGGR_BY_SPECIFIC_FIELDS = "aggregationBySpecificFields";
	String CUSTOM_FILTER_CATEGORIES = "customFilterCategories";
	String SEARCH_PARAM_KEY = "q";
	String SEARCH_TERM = "term";
	String QUERY_TERM = "queryValue";
	String COLUMN_GROUP = "columnGroup";
	String COLUMNS = "columns";
	String SEARCH_FIELDS = "fields";
	String FILTER_FIELD = "field";
	String CATEGORY_LEVEL = "categoryLevel";
	String FILTER_CODES = "codes";
	String PAGE = "page";
	String LIST_PAGE = "listPage";
	String LIMIT = "limit";
	String OFFSET = "offset";
	String ITEMS = "items";
	String TOTAL_ITEMS = "totalItems";
	String DEFAULT = "default";
	String COMMON = "common";
	Integer DEFAULT_LIMIT = 50;
	Integer DEFAULT_REGULAR_LIMIT = 24;
	Integer DEFAULT_COMING_SOON_LIMIT = 8;
	Integer DEFAULT_PAGE = 1;
	String IS_SEARCH_LISTING_KEY = "isSearchListing";
	String SEARCH_LIST_META_INFO_KEY = "searchListMetaInfo";
	String DATE_TIME_FORMAT_STR = "yyyy-MM-dd HH:mm:ss";
	String DATE_TIME_FORMAT_ISO = "yyyy-MM-ddTHH:mm:ssZ";
	String DATE_TIME_FORMAT_ISO2 = "yyyy-MM-dd'T'HH:mm:ss.SSSXXX";
	String SORT = "sort";
	String ORG_IDFIER = "orgIdfier";
	String DEFAULT_ORG_IDFIER = "scg";
	String COLLAPSED_VIEW = "collapsedView";
	String ID = "id";
	String TRUE = "true";
	String FALSE = "false";
	String STATUS = "status";
	String CREATED = "created";
	String SUCCESS = "SUCCESS";
	String PRODUCT_TAGS = "productTags";
	String SHOP_ID = "shopId";
	String UPDATED = "updated";
	String ORDER_NO = "orderNo";
	String CATEGORY_CODE = "categoryCode";
	String DATE_FORMAT = "dd MMMMM yyyy";
	String TRANSFORM_DATA = "transformData";
	String RANDOM_ORDER = "randomOrder";
	String SHOW_QUERY_METADATA = "showQueryMetadata";
	String PRODUCT_IMAGE_TYPE = "productImageType";
	String CODE = "code";
	String VALUE = "value";
	String OPERATOR = "operator";
	String PRODUCT_UN_AVAILABLE = "productUnAvailable";
	String SIMILARITY_SCORE = "similarityScore";
	String COMPARE_SIMILAR_PRODUCTS = "compareSimilarProducts";
	String EXCLUDE_SHOP_INFO = "excludeShopInfo";
	String SELECTED_LOCALE = "selectedLocale";
	String PORTAL_SETTINS = "portal-settings";
	String PORTAL_KEY = "portalKey";
	String JSON_EXTN = ".json";
	String UNDERSCROE = "_";
	String FETCH_DRAFT_VERSION = "fetchDraftVersion";
	String DRAFT_VERSION = "draftVersion";
	String TABS = "tabs";
	String TYPE = "type";
	String REVIEW = "review";
	String HIDDEN = "hidden";
	String DISABLED = "disabled";
	String HIDE_COUNT = "hideCount";
	String SOURCE_SKU_NUMBER = "sourceSkuNumber";
	// ES fields
	String SKU_NUMBER_ES_FIELD = "skuNumber";
	String _ID_ES_FIELD = "_id";
	String DIMENSIONS_WGT_UNIT = "productDimensions_weightUnit";
	String DIMENSIONS_LWH_UNIT = "productDimensions_lwhUnit";
	String DIMENSIONS_HEIGHT = "productDimensions_height";
	String DIMENSIONS_LENGTH = "productDimensions_length";
	String DIMENSIONS_WIDTH = "productDimensions_width";
	String DIMENSIONS_WEIGHT = "productDimensions_weight";
	String NUMBER_OF_UNITS_PER_SELL_UNIT = "sellUnitDetails_numberOfUnitsperSellUnit";
	String SELL_UNIT = "sellUnitDetails_sellUnit";
	String PRODUCT_DIMENSIONS = "productDimensions";
	String INSTALLATION_RATE_PARAMS = "installationRateParams";
	String CATEGORY_PREFIX = "category";
	String Y = "Y";
	String N = "N";
	String ENGLISH_LOCALE = "en";
	String NAME = "name";
	String ES_NAME = "webname";
	String PRICE = "price";
	String ORIGINAL_PRICE = "originalPrice";
	String QUANTITY = "quantity";
	String UNIT_DISCOUNT = "unitDiscount";
	String MIN_QUANTITY = "minQuantity";
	String BULK_QUANTITY = "bulkQuantity";
	String BULK_PRICE = "bulkPrice";
	String BULK_PRICE_APPLIED = "bulkPriceApplied";
	String ITEM_TOTAL_PRICE = "itemTotalPrice";
	String ITEM_TOTAL_ORG_PRICE = "itemTotalOrgPrice";
	String UNIT = "unit";
	String DISCONT = "discount";
	String USER_BLOCKED = "userBlocked";
	String PRICE_PER_UNIT = "pricePerUnit";
	String ES_PRICE = "comparablePrice";
	String PRICE_UNIT = "priceUnit";
	String PRIMARY_IMAGE = "image";
	String BRAND_LOGO = "smallLogo";
	String IMG_URL = "imgUrl";
	String ES_PRIMARY_IMAGE = "primaryScene";
	String SKU_NUMBER = "skuNumber";
	String SKU_NUMBERS = "skuNumbers";
	String SKU_ID = "skuId";
	String SKU_NAME = "skuName";
	String SELLER_ID = "sellerId";
	String COLLECTION_ID = "collectionId";
	String CATEGORY_ID = "categoryId";
	String SELLUNIT_LENGTH = "sellunitLength";
	String SELLUNIT_WIDTH = "sellunitWidth";
	String SELLUNIT_HEIGHT = "sellunitHeight";
	String SELLUNIT_WEIGHT = "sellunitWeight";
	String DIMENSION_UNIT = "dimensionUnit";
	String WEIGHT_UNIT = "weightUnit";
	String ES_IMAGE = "primaryImage";
	String STOCK_STATUS = "stockStatus";
	String START_DATE = "startDate";
	String ACTUAL_START_DATE = "actualStartDate";
	String ACTIVE_ON = "activeOn";
	String END_DATE = "endDate";
	String SHIPPING_PROMOTION_ENABLED = "shippingPromotionEnabled";
	String COMING_SOON = "comingSoon";
	String SESSION_KEY = "sessionKey";
	String OBJECT_IDFIER = "OBJECT_IDFIER";
	String LINK = "link";
	String GUEST_CHECKOUT_ENABLED = "guestCheckoutEnabled";
	String PHONE_COUNTRY_CODES = "phoneCountryCodes";
	String PHONE_MANDATORY = "phoneMandatory";
	String COUNTRY_CODE = "countryCode";
	String LIFF_ID = "liffId";
	String PHONE_MAX_DIGIT = "phoneMaxDigit";
	String PHONE_MIN_DIGIT = "phoneMinDigit";
	String SESSION_TIMEOUT = "sessionTimeout";
	String BEARER = "Bearer ";
	String BASIC = "Basic ";
	String JOIN_CONDITION = "joinCondition";
	String AND = "AND";
	String OR = "OR";
	String AB_TYPE = "abType";
	String TARGET = "target";
	String EXTRA_PARAMS = "extraParams";
	String MIN_ITEMS_LIMIT = "minItemsLimit";
	String SKU_LIST = "skuList";
	String VISUAL = "visual";
	String COMMA = ",";
	String IMAGE_URL = "imageUrl";
	String DISPLAY_PROPS = "displayProps";
	// AddressVo field
	String PROVINCE_NAME = "province_name";
	String DISTRICT_CODE = "district_code";
	String DISTRICT_NAME = "district_name";
	String SUBDISTRICT_CODE = "subdistrict_code";
	String SUBDISTRICT_NAME = "subdistrict_name";
	String POST_CODE = "postcode";

	String VARIANTS = "variants";
	String FREE_SAMPLE_VARIANT = "freeSampleVariant";
	String TITLE = "title";
	String FILTER_PARAM_OBJECT_KEY = "filters";
	String FREE_SHIPPING = "freeshipping";
	String DISCOUNT_INFO = "DISCOUNT_INFO";
	String TAG_CODES = "tagCodes";
	String ASSET = "asset";
	String SKU_NUM = "sku_number";
	String EQUAL_SIGN = "=";
	String EXCLUDE_SAME_COLLECTION = "excludeSameCollection";
	long USER_90 = -90;
	String DEFAULT_LANGUAGE = "th";
	String GROUP = "group";
	String BUYER = "buyer";
	String COUPON_DISCOUNT = "couponDiscount";
	String EXTRA_INFO = "extraInfo";
	String USER_REVIEWS = "userReviews";
	String ASSET_REQUEST = "assetRequest";
	String PENDING_REVIEW_DETAILS = "pendingReviewDetails";
	String QUESTIONS = "questions";
	String COMMENT_TAG = "commentTag";
	String QUESTION_IDFIER = "questionIdfier";
	String OPTIONS = "options";
	String MESSAGE = "message";
	String OVERALL_RATING = "overallRating";
	String USER_REVIEW = "userReview";

	@Getter
	public enum DbOperator {
		EQUAL("=", false), NOT_EQUAL("!=", false), LESS_THAN("<", false), GREATER_THAN(">", false), IN("in", true),
		NOT_IN("not in", true);

		private String code;
		private boolean multivalueSupport;

		DbOperator(final String code, final boolean mvs) {
			this.code = code;
			this.multivalueSupport = mvs;
		}

		public static DbOperator geOperator(String code) {
			var opr = EQUAL;
			if (code == null) {
				return opr;
			}
			code = code.toLowerCase();
			for (final var copr : values()) {
				if (copr.getCode().equals(code)) {
					opr = copr;
					break;
				}
			}
			return opr;
		}
	}

	public enum CAROUSEL_TYPE {
		BANNER, PRODUCT, PRODUCT_LIST, PRODUCT_GROUP, CAROUSEL_GROUP, INSTALLER_LIST, SELLER_LIST, REVIEW, STATIC,
		STATIC_HTML, STATIC_WITH_BANNER, NOTIFICATION, CAMPAIGN_CONFIG;

		public static boolean hasBanner(final CAROUSEL_TYPE ctype) {
			return BANNER == ctype || STATIC_WITH_BANNER == ctype;
		}
	}

	public enum FiterTarget {
		all, carousel, list;

		public static boolean isCarouselFilter(final FiterTarget fiterTarget) {
			return all == fiterTarget || carousel == fiterTarget;
		}
	}

	String OBJECT_TYPE = "OBJECT_TYPE";
	String EXCLUDE_DFAULT_FILTER = "excludeDefaultFilter";

	public enum ImageType {
		TINY, SMALL, MEDIUM, STANDARD, LARGE, EXTRA_LARGE;
	}

	public enum SEARCH_QUERY_TYPE {
		DEFAULT, REGULAR, COMING_SOON, NOCNOC_CHOICE;
	}

	public enum FBEvents {
		ADD_TO_WISHLIST, VIEW_CONTENT, COMPLETE_REGISTRATION
	}

	String FACEBOOK = "Facebook";
	String EXTERNAL_EVENT = "EXTERNAL_EVENT";

}
