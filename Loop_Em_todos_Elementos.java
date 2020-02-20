@org.junit.Test
	public void Fazerbusca() {
		
		//termo a ser buscado
		String TermoBusca = "panela";
		
		
		driver.findElement(By.id("strBusca")).sendKeys(TermoBusca.toLowerCase());
		driver.findElement(By.id("btnOK")).click();
		
		//Coloco todos os Web elements em uma lista
		List<WebElement> resultados = driver.findElements(By.cssSelector(".nm-product-name>a>span"));
		//Imprimo a quantidade de lista
		System.out.println("Itens encontrados: " + resultados.size());
		
		//Faço um for para pegar todos os elementos e ver o que posso e quero utilizar
		for(int i = 0; i < resultados.size(); i++){
			System.out.println(i + " : " + resultados.get(i).getText());
		}
		
	}
