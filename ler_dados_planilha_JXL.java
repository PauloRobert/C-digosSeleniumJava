package demoautomacao;

import java.io.File;
import java.io.IOException;

import jxl.*;
import jxl.read.biff.BiffException;

public class LerPlanilhas {

	public static void main(String[] args) throws BiffException, IOException {
		//Dados da planilha com a biblioteca JXL
		Workbook workbook = Workbook.getWorkbook(new File("tools/planilha.xls"));
			
			//Em qual sheet começara a ler a planilha
			Sheet sheet = workbook.getSheet(0);  
			
			//Conte o número de linhas
			int NumeroLinhas = sheet.getRows();
			int NumeroColunas = sheet.getColumns();

			//Imprima no console a quantidade de linhas
			System.out.println("Existem " + NumeroLinhas + " linhas e " + NumeroColunas + " colunas com dados na " + sheet.getName() + " porém a primeira linha é o cabeçalho.");

			
			//indica em qual linha deve começar a ler os dados
			int comece_ler_nesta_linha = 1;
			
			//comece o loop
			for(int i =  comece_ler_nesta_linha; i < NumeroLinhas; i++)
			{
				
				//Pegue o texto da célula e converta em um String
			    String pegartextocelula = sheet.getCell(0, i).getContents();
		    
				System.out.println(pegartextocelula);
			    
			   }
			
			//Fecha a planilha
			workbook.close();

	}

}
