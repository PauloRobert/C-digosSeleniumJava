       //Método 1
	    System.setProperty("webdriver.ie.driver", "path_driver/IEDriverServer.exe");
		DesiredCapabilities caps = DesiredCapabilities.internetExplorer();
		caps.setCapability(InternetExplorerDriver.INTRODUCE_FLAKINESS_BY_IGNORING_SECURITY_DOMAINS, true);
		WebDriver driver = new InternetExplorerDriver(caps);


		//Método 2


	static String driverPath = "C:\\eclipse\\Selenium\\";
	public static WebDriver driver;

	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws InterruptedException {

		DesiredCapabilities capabilities = DesiredCapabilities
				.internetExplorer();
		capabilities.setCapability(InternetExplorerDriver.INTRODUCE_FLAKINESS_BY_IGNORING_SECURITY_DOMAINS,true);
		capabilities.setJavascriptEnabled(true);
		capabilities.setPlatform(Platform.WINDOWS);
		capabilities.setVersion("5");

		System.out.println("*******************");
		System.out.println("launching IE browser");
		System.out.println("*******************");

		System.setProperty("webdriver.ie.driver", driverPath + "IEDriverServer.exe");
		driver = new InternetExplorerDriver(capabilities);

		driver.get("");
		driver.manage().window().maximize();