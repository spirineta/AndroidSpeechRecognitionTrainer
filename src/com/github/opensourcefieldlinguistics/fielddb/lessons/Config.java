package com.github.opensourcefieldlinguistics.fielddb.lessons;

public class Config extends ca.ilanguage.oprime.Config {
	public static final String ACRA_PASS = PrivateConstants.ACRA_PASS;
	public static final String ACRA_SERVER_URL = PrivateConstants.ACRA_SERVER_URL;
	public static final String ACRA_USER = PrivateConstants.ACRA_USER;
	public static final String DATA_IS_ABOUT_LANGUAGE_ISO = "ka";
	public static final String DATA_IS_ABOUT_LANGUAGE_NAME = "ქართული";

	public static final String DEFAULT_CORPUS = "community-georgian";
	public static final String DEFAULT_OUTPUT_DIRECTORY = "/sdcard/FieldDB";
	public static final String DEFAULT_SERVER_URL = PrivateConstants.DEFAULT_SERVER_URL;
	public static final String DEFAULT_SAMPLE_DATA_URL = PrivateConstants.DEFAULT_SERVER_URL
			+ "/" + DEFAULT_CORPUS + "/_design/learnx/views/byTag?key=";

	public static final String KEYSTORE_PASS = PrivateConstants.KEYSTORE_PASS;
	public static final String USER_FRIENDLY_DATA_NAME = "ფრაზა";
}
