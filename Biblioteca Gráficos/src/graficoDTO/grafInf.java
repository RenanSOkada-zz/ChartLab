package graficoDTO;

import java.util.Arrays;

public class grafInf extends grafInfFull{
	
	private String title;
	private String[][] assunto;
	private String width;
	private String height;
	
	
	public grafInf() {
		super();
	}
	
	public grafInf(String subtitle, String title, String[][] assunto, String width, String height) {
		super(subtitle);
		this.title = title;
		this.assunto = assunto;
		this.width = width;
		this.height = height;
	}
	
	public grafInf(String title, String[][] assunto, String width, String height) {
		super();
		this.title = title;
		this.assunto = assunto;
		this.width = width;
		this.height = height;
	}

	public grafInf(String[][] assunto, String width, String height) {
		super();
		this.assunto = assunto;
		this.width = width;
		this.height = height;
	}
	
	public grafInf(String title, String width, String height) {
		super();
		this.title = title;
		this.width = width;
		this.height = height;
	}

	public grafInf(String width, String height) {
		super();
		this.width = width;
		this.height = height;
	}
	
	public grafInf(String height) {
		super();
		this.height = height;
	}

	public String getTitle() {
		return title;
	}
	public String[][] getAssunto() {
		return assunto;
	}
	public String getWidth() {
		return width;
	}
	public String getHeight() {
		return height;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public void setAssunto(String[][] assunto) {
		this.assunto = assunto;
	}
	public void setWidth(String width) {
		this.width = width;
	}
	public void setHeight(String height) {
		this.height = height;
	}
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("grafInf [title=");
		builder.append(title);
		builder.append(", assunto=");
		builder.append(Arrays.toString(assunto));
		builder.append(", width=");
		builder.append(width);
		builder.append(", height=");
		builder.append(height);
		builder.append(", toString()=");
		builder.append(super.toString());
		builder.append("]");
		return builder.toString();
	}
	
	
	
}
