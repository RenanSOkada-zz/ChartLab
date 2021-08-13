package graficoPersistDAO;
import graficoDTO.grafInf;
import interfacePersist.IGraficoPersist;

public class graficoPersist {
	
	private IGraficoPersist persist;

	public graficoPersist(IGraficoPersist persist) {
		this.persist = persist;
	}
	
	public void gravarGrafPizza(grafInf gi) {
		persist.gravarGrafPizza(gi);
	}
	
	public void gravarGrafBarra(grafInf gi) {
		persist.gravarGrafBarra(gi);
	}
	public void gravarGrafLinha(grafInf gi){
		persist.gravarGrafLinha(gi);
	}

}
