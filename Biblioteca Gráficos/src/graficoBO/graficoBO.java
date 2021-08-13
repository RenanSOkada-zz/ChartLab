package graficoBO;

import graficoDAO.gravarGrafico;
import graficoDTO.grafInf;
import interfacePersist.IGraficoPersist;

public class graficoBO implements IGraficoPersist{
	
	public void gravarGrafPizza(grafInf gi) {
		gravarGrafico g = new gravarGrafico();
		g.gravarGrafPizza(gi);
	}

	public void gravarGrafBarra(grafInf gi) {
		gravarGrafico g = new gravarGrafico();
		g.gravarGrafBarra(gi);;
	}
	
	public void gravarGrafLinha(grafInf gi) {
		gravarGrafico g = new gravarGrafico();
		g.gravarGrafLinha(gi);
	}

}
