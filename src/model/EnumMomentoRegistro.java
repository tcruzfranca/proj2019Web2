package model;

public enum EnumMomentoRegistro {
	ANTES("antes"), DEPOIS("depois");

	private String momento;

	EnumMomentoRegistro(String momento) {
		this.momento = momento;
	}

	public String getMomento() {
		return momento;
	}

}
