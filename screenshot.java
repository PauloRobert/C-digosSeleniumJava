//Esta classe depende da bibliotca ashot
//https://repo1.maven.org/maven2/ru/yandex/qatools/ashot/ashot/1.5.4/ashot-1.5.4.jar

Screenshot TirarPrint = new AShot().shootingStrategy(ShootingStrategies.viewportPasting(1000)).takeScreenshot(driver);             

        try {                 

        ImageIO.write(TirarPrint.getImage(),"PNG",new File("C://success//test_" + DataHora() + ".png"));             

      } catch (FileNotFoundException acesso_negado) {                       

        }                   



public static String DataHora() {
    return new SimpleDateFormat("dd-MM-yyyy_HH-mm-ss").format(new Date());
} 