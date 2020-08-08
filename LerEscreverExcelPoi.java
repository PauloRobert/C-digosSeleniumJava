package lendoXlsx.xlsx;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Calendar;
import java.util.Date;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.CreationHelper;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcel {

	public static void main(String[] args) {

		File ArquivoFisico = new File("tools\\cnpj.xlsx");
		Calendar dataHora = Calendar.getInstance();
		Date dataAtual = new Date();

		if (ArquivoFisico.exists() == true) {

			System.out.println("Arquivo encontrado, bora entrar no Try Catch!");

			try {

				FileInputStream CaminhoArquivo = new FileInputStream(ArquivoFisico);

				XSSFWorkbook Planilha = new XSSFWorkbook(CaminhoArquivo);

				XSSFSheet sheet = Planilha.getSheetAt(0);

				int QuantidadeDeLinhas = sheet.getLastRowNum();
				System.out.println("Quant. de LInhas: " + QuantidadeDeLinhas);

				for (int i = 1; i <= QuantidadeDeLinhas; i++) {

					Row coluna = sheet.getRow(i);
					// Cria a coluna B (que no caso é a 1, pois o excel começa em 0)
					coluna.createCell(1);
					coluna.createCell(2);
					Cell resultado = coluna.getCell(1);
					Cell Data = coluna.getCell(2);

					// Formatando a data e hora para registrar quando foi gravado - Uso Opcional

					CellStyle cellStyle = Planilha.createCellStyle();
					CreationHelper createHelper = Planilha.getCreationHelper();
					cellStyle.setDataFormat(createHelper.createDataFormat().getFormat("dd/mm/yyyy h:mm:ss"));

					// Esta linha escreve no arquivo, esta com valor fixo de 10, porém você pode
					// pegar o valor que quer, guardar em uma variavel e passar a variavel para esta
					// linha
					System.out.println("Escrevendo na linha: " + i);
					resultado.setCellValue("Linha: " + i);
					
					//Aplicando a formatação á Célula
					Data.setCellStyle(cellStyle);
					Data.setCellValue(dataAtual);

				}

				FileOutputStream outFile = new FileOutputStream(new File("tools\\cnpj.xlsx"));
				Planilha.write(outFile);
				outFile.close();
				Planilha.close();
				System.out.println("Dados gravados com sucesso!");

			} catch (Exception e) {
				System.out.println(e.getMessage() + " Não foi possivel ler e escrever no arquivo!");
			}

		} else {

			System.out.println("###### ERRO ###### \n");
			System.out.println("Arquivo não encontrado, verifique o caminho e a extensão do mesmo!");

		}

	}

}
