/**
MIT License

Copyright (c) 2019 haseenaR

Permission is hereby granted, free of charge, to any person obtaining a copy
of this software and associated documentation files (the "Software"), to deal
in the Software without restriction, including without limitation the rights
to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
copies of the Software, and to permit persons to whom the Software is
furnished to do so, subject to the following conditions:

The above copyright notice and this permission notice shall be included in all
copies or substantial portions of the Software.
**/
/**
 * IndividualBean
 * version 1.0
 * Created by Haseena Rajeevan.
 */
package bean;

/**
 *
 * @author hr65
 */
public class IndividualBean implements Comparable {
    protected String individual;
    protected int sampleId;
    protected String sampleName;
    protected int rankOrder;
    protected Double likelihood;
    public IndividualBean() {
	super();
    }
    public IndividualBean(String cellLine, int sampleId, String sampleName) {
		super();
		this.individual = cellLine;
		this.sampleId = sampleId;
		this.sampleName = sampleName;
	}
	
	public IndividualBean(String cellLine, String sampleName) {
		super();
		this.individual = cellLine;
		this.sampleName = sampleName;
	}

	public IndividualBean(String sampleName,double likelihood) {
		super();
		this.likelihood = new Double(likelihood);
		this.sampleName = sampleName;
	}
	
	public IndividualBean(String sampleName, int rankOrder) {
		super();
		this.sampleName = sampleName;
		this.rankOrder = rankOrder;
	}
    public String getIndividual() {
        return individual;
    }
    public void setIndividual(String individual) {
        this.individual = individual;
    }
    public int getSampleId() {
        return sampleId;
    }
    public void setSampleId(int sampleId) {
        this.sampleId = sampleId;
    }
    public String getSampleName() {
        return sampleName;
    }
    public void setSampleName(String sampleName) {
        this.sampleName = sampleName;
    }
    public int getRankOrder() {
        return rankOrder;
    }
    public void setRankOrder(int rankOrder) {
        this.rankOrder = rankOrder;
    }
    public Double getLikelihood() {
        return likelihood;
    }
    public void setLikelihood(Double likelihood) {
        this.likelihood = likelihood;
    }

    @Override
	 public int compareTo(Object obj) {  
        if (! (obj instanceof IndividualBean)) {  
            throw new ClassCastException(  
                            "compared object must be instance of CellLineBean");  
        }  
        return this.getLikelihood().compareTo(((IndividualBean) obj).getLikelihood());  
    }  
	public String toString() {  
        StringBuffer sb = new StringBuffer();  
        sb.append(getLikelihood());  
        sb.append("\t");  
        sb.append(getSampleName());  
        return sb.toString();  
    } 
    
}
