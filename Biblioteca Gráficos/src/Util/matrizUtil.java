package Util;

import graficoDTO.grafInf;

public class matrizUtil {

	public static int colunaMatriz(String[][] matriz) {
		int colunas = 0;
		
		if (matriz.length > 0){
		    colunas = matriz[0].length;            
		}
		return colunas;
	}
	
	public static int linhaMatriz(String[][] matriz) {
		int linhas = 0;
		
		if (matriz.length > 0){
			linhas = matriz.length;           
		}
		return linhas;
	}
	
	public static String getMatriz(grafInf ginf) {
		 StringBuilder builder = new StringBuilder();
		for(int x = 0; x < matrizUtil.linhaMatriz(ginf.getAssunto()); x++){
           for(int y = 0; y< matrizUtil.colunaMatriz(ginf.getAssunto()); y++)
           	builder.append(ginf.getAssunto()[x][y]+" ");
           	builder.append("\n");
		}
		return builder.toString();
	}
}
