package gov.cms.fqhc_pricer;

/**
 * This class was automatically generated by the data modeler tool.
 */

public class LineCalculationHelper implements java.io.Serializable {

	static final long serialVersionUID = 1L;

	@org.kie.api.definition.type.Description("This object holds parameters derived at the line level")
	private java.lang.Double baserate;
	private java.lang.Double addonfactor;
	private java.lang.Double gftbaserate;

	private java.lang.Double adjFactor;

	private java.lang.Integer line;

	private java.lang.Double roundPpsAmount;

	public LineCalculationHelper() {
	}

	public java.lang.Double getBaserate() {
		return this.baserate;
	}

	public void setBaserate(java.lang.Double baserate) {
		this.baserate = baserate;
	}

	public java.lang.Double getAddonfactor() {
		return this.addonfactor;
	}

	public void setAddonfactor(java.lang.Double addonfactor) {
		this.addonfactor = addonfactor;
	}

	public java.lang.Double getGftbaserate() {
		return this.gftbaserate;
	}

	public void setGftbaserate(java.lang.Double gftbaserate) {
		this.gftbaserate = gftbaserate;
	}

	public java.lang.Double getAdjFactor() {
		return this.adjFactor;
	}

	public void setAdjFactor(java.lang.Double adjFactor) {
		this.adjFactor = adjFactor;
	}

	public java.lang.Integer getLine() {
		return this.line;
	}

	public void setLine(java.lang.Integer line) {
		this.line = line;
	}

	public java.lang.Double getRoundPpsAmount() {
		return this.roundPpsAmount;
	}

	public void setRoundPpsAmount(java.lang.Double roundPpsAmount) {
		this.roundPpsAmount = roundPpsAmount;
	}

	public LineCalculationHelper(java.lang.Double baserate,
			java.lang.Double addonfactor, java.lang.Double gftbaserate,
			java.lang.Double adjFactor, java.lang.Integer line,
			java.lang.Double roundPpsAmount) {
		this.baserate = baserate;
		this.addonfactor = addonfactor;
		this.gftbaserate = gftbaserate;
		this.adjFactor = adjFactor;
		this.line = line;
		this.roundPpsAmount = roundPpsAmount;
	}

}