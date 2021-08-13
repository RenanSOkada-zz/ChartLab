package Main;


import graficoDAO.gravarGrafico;
import graficoDTO.grafInf;
import graficoPersistDAO.graficoPersist;


public class Main {

	public static void main(String[] args){
		
				
		String[][] pie = {{"['Task',","'Hours per Day'],"},
						{"['Work',","  11],"},
						{"['Eat',","  2],"},
						{"['Commute',", "  2],"},
						{"['Watch TV',", "  2],"},
						{"['Sleep',", "  7]"}};
		
		String[][] bar = {{"['Year', 'Sales', 'Expenses', 'Profit'],"},
						{"['2014', 1000, 400, 200],"},
						{"['2015', 1170, 460, 250],"},
						{"['2016', 660, 1120, 300],"},
						{"['2017', 1030, 540, 350]"}};
		
		String[][] line = {{"['Year', 'Sales', 'Expenses', 'Gains'],"},
				{"['2004',  1000,      400, 	1500],"},
				{"['2005',  1170,      460, 	1200],"},
				{"['2006',  660,       1120, 	1300],"},
				{"['2007',  1030,      540, 	3000]"}};

		grafInf gr1 = new grafInf("'My Daily Activities'", pie, "900", "500");
		grafInf gr2 = new grafInf("'Sales, Expenses, and Profit: 2014-2017'", "'Company Performance'", bar, "900", "500");
		grafInf gr3 = new grafInf("'Company Performance'", line, "900", "500");
		
		
		gravarGrafico p = new gravarGrafico();
		graficoPersist pers = new graficoPersist(p);
		
		pers.gravarGrafPizza(gr1);
	
		pers.gravarGrafBarra(gr2);
	
		pers.gravarGrafLinha(gr3);
	}

}
