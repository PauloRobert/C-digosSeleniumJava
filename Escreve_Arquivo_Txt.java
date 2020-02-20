//Lugar onde será gravado o arquivo
File arquivo = new File("C:/cvc/pacotescvc.txt");

			FileWriter fw = new FileWriter(arquivo.getAbsoluteFile(), true);
			BufferedWriter bw = new BufferedWriter(fw);

			//Começa a escrever no arquivo
			bw.write("######################" + " \n");
			
			//Pula uma linha
			bw.write("\n");
			bw.write(destino_ferias
					+ ","
					+ pega_valor
					+ ","
					+ hotel.replaceAll("Pontos", "Estrelas")
					+ ","
					+ aeroporto.replaceAll("GRU", "Guarulhos").replace("CGH",
							"Congonhas") + "," + hora_da_pesquisa);
			bw.write("\n");
			bw.write("\n");
			bw.close();
