package br.edu.cs.poo.ac.ordem.entidades;

public enum PrecoBase {
	MANUTENCAO_NORMAL(TipoOrdem.MANUTENCAO, Dificuldade.NORMAL, 50.00),
	MANUTENCAO_DIFICIL(TipoOrdem.MANUTENCAO, Dificuldade.DIFICIL, 70.00),
	CONFIGURACAO_NORMAL(TipoOrdem.CONFIGURACAO, Dificuldade.NORMAL, 30.00),
	CONFIGURACAO_DIFICIL(TipoOrdem.CONFIGURACAO, Dificuldade.DIFICIL, 45.00),
	UPGRADE_NORMAL(TipoOrdem.UPGRADE, Dificuldade.NORMAL, 95.00),
	UPGRADE_DIFICIL(TipoOrdem.UPGRADE, Dificuldade.DIFICIL, 110.00);
	
	private TipoOrdem tipoOrdem;
	private Dificuldade tipoEquipamento;
	private double preco;
	
	

	private PrecoBase(TipoOrdem tipoOrdem, Dificuldade tipoEquipamento, double preco) {
		this.tipoOrdem = tipoOrdem;
		this.tipoEquipamento = tipoEquipamento;
		this.preco = preco;
	}

	public TipoOrdem getTipoOrdem() {
		return tipoOrdem;
	}

	public Dificuldade getTipoEquipamento() {
		return tipoEquipamento;
	}

	public double getPreco() {
		return preco;
	}
	
	public static PrecoBase getPrecoBase(TipoOrdem tipoOrdem, Dificuldade dificuldade) {
		PrecoBase precoBaseRetornar = null;
		for( PrecoBase precoBase: PrecoBase.values()) {
			if(precoBase.getTipoOrdem() == tipoOrdem && precoBase.getTipoEquipamento() == dificuldade) {
				precoBaseRetornar = precoBase;
				break;
			}
		}
		return precoBaseRetornar;
	}
	
}
