package graficoDTO;

public class grafInfFull {
	
	private String subtitle;
	
	public grafInfFull() {
	}

	public grafInfFull(String subtitle) {
		super();
		this.subtitle = subtitle;
	}

	public String getSubtitle() {
		return subtitle;
	}

	public void setSubtitle(String subtitle) {
		this.subtitle = subtitle;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("grafInfFull [subtitle=");
		builder.append(subtitle);
		builder.append("]");
		return builder.toString();
	}

	

	
	
	
}
