package model;

public enum EnumTipoOpcao {

	NORMAL("normal"), DE_LADO("de_lado"), SENTADO("sentado"), CORRENDO("correndo"), FELIZ("feliz"), TRISTE("triste");

	private String descricao;

	EnumTipoOpcao(String descricao) {
		this.descricao = descricao;
	}

	public String getDescricao() {
		return descricao;
	}

}
