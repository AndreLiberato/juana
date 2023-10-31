package br.com.api.juana.enums;

public enum UnidadeFederativa implements EntidadeEnum {
	AMAZONAS("Amazonas", "AM", "Manaus"), ALAGOAS("Alagoas", "AL", "Maceió"), ACRE("Acre", "AC", "Rio Branco"),
	AMAPA("Amapá", "AP", "Macapá"), BAHIA("Bahia", "BA", "Salvador"), PARA("Pará", "PA", "Belém"),
	MATO_GROSSO("Mato Grosso", "MT", "Cuiabá"), MINAS_GERAIS("Minas Gerais", "MG", "Belo Horizonte"),
	MATO_GROSSO_DO_SUL("Mato Grosso do Sul", "MS", "Campo Grande"), GOIAS("Goiás", "GO", "Goiânia"),
	MARANHAO("Maranhão", "MA", "São Luís"), RIO_GRANDE_DO_SUL("Rio Grande do Sul", "RS", "Porto Alegre"),
	TOCANTINS("Tocantins", "TO", "Palmas"), PIAUI("Piauí", "PI", "Teresina"), SAO_PAULO("São Paulo", "SP", "São Paulo"),
	RONDONIA("Rondônia", "RO", "Porto Velho"), RORAIMA("Roraima", "RR", "Boa Vista"),
	PARANA("Paraná", "PR", "Curitiba"), CEARA("Ceará", "CE", "Fortaleza"), PERNAMBUCO("Pernambuco", "PE", "Recife"),
	SANTA_CATARINA("Santa Catarina", "SC", "Florianópolis"), PARAIBA("Paraíba", "PB", "João Pessoa"),
	RIO_GRANDE_DO_NORTE("Rio Grande do Norte", "RN", "Natal"), ESPIRITO_SANTO("Espírito Santo", "ES", "Vitória"),
	RIO_DE_JANEIRO("Rio de Janeiro", "RJ", "Rio de Janeiro"), SERGIPE("Sergipe", "SE", "Aracaju"),
	DISTRITO_FEDERAL("Distrito Federal", "DF", "Brasília");

	private String nome;
	private String sigla;
	private String capital;

	/**
	 * Construtor do enum
	 *
	 * @param nome    nome da unidade da federação completo
	 * @param sigla   sigla da unidade da federação
	 * @param capital nome da capital da unidade da federação
	 */
	UnidadeFederativa(String nome, String sigla, String capital) {
		this.nome = nome;
		this.sigla = sigla;
		this.capital = capital;
	}

	/**
	 * Nome completo da UF
	 *
	 * @return nome completo da UF
	 */
	public String getNome() {
		return this.nome;
	}

	/**
	 * Obtém a sigla da UF
	 *
	 * @return a sigla da UF
	 */
	public String getSigla() {
		return this.sigla;
	}
	
	/**
	 * Nome da capital da UF
	 *
	 * @return nome da capital da UF
	 */
	public String getCapital() {
		return this.capital;
	}
}
