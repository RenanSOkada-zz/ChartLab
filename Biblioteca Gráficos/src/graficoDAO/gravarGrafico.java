package graficoDAO;
import Util.matrizUtil;
import graficoDTO.grafInf;

import java.io.FileWriter;
import java.io.PrintWriter;

import interfacePersist.IGraficoPersist;

public class gravarGrafico implements IGraficoPersist{
	
	public void gravarGrafPizza(grafInf gi) {
		try {
			FileWriter arq = new FileWriter("GraficoPizza.html");
		    PrintWriter gravarArq = new PrintWriter(arq);
		    StringBuilder builder = new StringBuilder();
		    		builder.append("<html>\r\n"
		    		+ "  <head>\r\n"
		    		+ "    <script type=\"text/javascript\" src=\"https://www.gstatic.com/charts/loader.js\"></script>\r\n"
		    		+ "    <script type=\"text/javascript\">\r\n"
		    		+ "      google.charts.load('current', {'packages':['corechart']});\r\n"
		    		+ "      google.charts.setOnLoadCallback(drawChart);\r\n"
		    		+ "\r\n"
		    		+ "      function drawChart() {\r\n"
		    		+ "\r\n"
		    		+ "        var data = google.visualization.arrayToDataTable([\r\n");
		    		builder.append(matrizUtil.getMatriz(gi));
		    		builder.append("]); \r\n"
		    		+ "    var options = {\r\n title: ");
		    		builder.append(gi.getTitle());
		    		builder.append("\r\n"
		    		+ "        };\r\n"
		    		+ "\r\n"
		    		+ "        var chart = new google.visualization.PieChart(document.getElementById('piechart'));\r\n"
		    		+ "\r\n"
		    		+ "        chart.draw(data, options);\r\n"
		    		+ "      }\r\n"
		    		+ "    </script>\r\n"
		    		+ "  </head>\r\n"
		    		+ "  <body>\r\n"
		    		+ "    <div id=\"piechart\" style=\"width: ");
		    		builder.append(gi.getWidth());
		    		builder.append("px; height: ");
		    		builder.append(gi.getHeight());
		    		builder.append("px;\"></div>\r\n"
		    		+ "  </body>\r\n"
		    		+ "</html>");
		    		gravarArq.printf(builder.toString());
		    		arq.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void gravarGrafBarra(grafInf gi) {
		try {
			FileWriter arq = new FileWriter("GraficoBarra.html");
		    PrintWriter gravarArq = new PrintWriter(arq);
		    StringBuilder builder = new StringBuilder();
		    		builder.append("<html>\r\n"
		    		+ "  <head>\r\n"
		    		+ "    <script type=\"text/javascript\" src=\"https://www.gstatic.com/charts/loader.js\"></script>\r\n"
		    		+ "    <script type=\"text/javascript\">\r\n"
		    		+ "      google.charts.load('current', {'packages':['bar']});\r\n"
		    		+ "      google.charts.setOnLoadCallback(drawChart);\r\n"
		    		+ "\r\n"
		    		+ "      function drawChart() {\r\n"
		    		+ "        var data = google.visualization.arrayToDataTable([\r\n");
		    		builder.append(matrizUtil.getMatriz(gi));
		    		builder.append("        ]);"
		    		+ "\r\n"
		    		+ "        var options = {\r\n"
		    		+ "          chart: {\r\n"
		    		+ "            title:");
		    		builder.append(gi.getTitle());
		    		builder.append(", \r\n subtitle:");
		    		builder.append(gi.getSubtitle());
		    		builder.append(", } ,\r\n"
		    		+ "          bars: 'horizontal' // Required for Material Bar Charts.\r\n"
		    		+ "        };\r\n"
		    		+ "\r\n"
		    		+ "        var chart = new google.charts.Bar(document.getElementById('barchart_material'));\r\n"
		    		+ "\r\n"
		    		+ "        chart.draw(data, google.charts.Bar.convertOptions(options));\r\n"
		    		+ "      }\r\n"
		    		+ "    </script>\r\n"
		    		+ "  </head>\r\n"
		    		+ "  <body>\r\n"
		    		+ "    <div id=\"barchart_material\" style=\"width: ");
		    		builder.append(gi.getWidth());
		    		builder.append("px; height: ");
		    		builder.append(gi.getHeight());
		    		builder.append("px;\"></div>\r\n"
		    		+ "  </body>\r\n"
		    		+ "</html>");
		    		gravarArq.printf(builder.toString());
		    		arq.close();
		    
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void gravarGrafLinha(grafInf gi) {
		try {
			FileWriter arq = new FileWriter("GraficoLinha.html");
		    PrintWriter gravarArq = new PrintWriter(arq);
		    StringBuilder builder = new StringBuilder();
		    		builder.append("<html>\r\n"
		    		+ "  <head>\r\n"
		    		+ "    <script type=\"text/javascript\" src=\"https://www.gstatic.com/charts/loader.js\"></script>\r\n"
		    		+ "    <script type=\"text/javascript\">\r\n"
		    		+ "      google.charts.load('current', {'packages':['corechart']});\r\n"
		    		+ "      google.charts.setOnLoadCallback(drawChart);\r\n"
		    		+ "\r\n"
		    		+ "      function drawChart() {\r\n"
		    		+ "        var data = google.visualization.arrayToDataTable([\r\n");
		    		builder.append(matrizUtil.getMatriz(gi));
		    		builder.append("        ]);\r\n"
		    		+ "\r\n"
		    		+ "        var options = {\r\n"
		    		+ "          title: ");
		    		builder.append(gi.getTitle());
		    		builder.append(", curveType: 'none',\r\n"
		    		+ "          legend: { position: 'bottom' }\r\n"
		    		+ "        };\r\n"
		    		+ "\r\n"
		    		+ "        var chart = new google.visualization.LineChart(document.getElementById('curve_chart'));\r\n"
		    		+ "\r\n"
		    		+ "        chart.draw(data, options);\r\n"
		    		+ "      }\r\n"
		    		+ "    </script>\r\n"
		    		+ "  </head>\r\n"
		    		+ "  <body>\r\n"
		    		+ "    <div id=\"curve_chart\" style=\"width: ");
		    		builder.append(gi.getWidth());
		    		builder.append("px; height: ");
		    		builder.append(gi.getHeight());
		    		builder.append("px\"></div>\r\n"
		    		+ "  </body>\r\n"
		    		+ "</html>\r\n"
		    		+ "");
		    		gravarArq.printf(builder.toString());
		    		arq.close();
		    
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
