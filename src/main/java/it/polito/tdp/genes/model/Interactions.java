package it.polito.tdp.genes.model;

public class Interactions {
	
	private Genes gene1; 	
	private Genes gene2; 
	private String type; 
	private Double expressioneCorr;
	
	public Interactions(Genes gene1, Genes gene2, String type, Double expressioneCorr) {
		super();
		this.gene1 = gene1;
		this.gene2 = gene2;
		this.type = type;
		this.expressioneCorr = expressioneCorr;
	}

	public Genes getGene1() {
		return gene1;
	}

	public Genes getGene2() {
		return gene2;
	}

	public String getType() {
		return type;
	}

	public Double getExpressioneCorr() {
		return expressioneCorr;
	}

	public void setGene1(Genes gene1) {
		this.gene1 = gene1;
	}

	public void setGene2(Genes gene2) {
		this.gene2 = gene2;
	}

	public void setType(String type) {
		this.type = type;
	}

	public void setExpressioneCorr(Double expressioneCorr) {
		this.expressioneCorr = expressioneCorr;
	} 
	
	

}
