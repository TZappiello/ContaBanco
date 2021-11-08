package monetario;

public class ContaBanco {
	// Atributos
	public String banco;
	public int numConta;
	protected String tipo;
	private String dono;
	private double saldo;
	private boolean status;

	// Metodos
	public void banco() {
		System.out.println("Banco: " + this.getBanco());
	}

	public void estadoAtual() {
		System.out.println("****************");
		System.out.println("Conta " + this.getNumConta());
		System.out.println("Tipo " + this.getTipo());
		System.out.println("Dono " + this.getDono());
		System.out.println("Saldo " + this.getSaldo());
		System.out.println("Status " + this.getStatus());
	}

	public void abrirConta(String t) {
		this.setTipo(t);
		this.setStatus(true);
		if (t == "CC") {
			this.setSaldo(50);
		} else if (t == "CP")
			this.setSaldo(150);
		System.out.println("Conta Aberta Parabens");
		System.out.println("**********************");
	}

	public void fecharConta() {
		if (this.getSaldo() > 0) {
			System.out.println("Conta com Valor, não pode ser fechada!");
		} else if (this.getSaldo() < 0)
			System.out.println("Conta em debito, não pode ser fechada");
		else {
			this.setStatus(false);
			System.out.println("Conta fechada ");
		}

	}

	public void depositar(double v) {
		if (this.getStatus()) {
			this.setSaldo(saldo = saldo + v);
			System.out.println();
		} else
			System.out.println("Impossivel depositar");
	}

	public void sacar(double v) {
		if (this.getStatus()) {
			if (this.getSaldo() >= v) {
				this.setSaldo(saldo = saldo - v);
				System.out.println("Saque feito na conta: ");
			} else {
				System.out.println("Saldo insuficiente ");
			}
		} else {
			System.out.println("Conta fechada não pode sacar ");
		}
	}

	public void pagarMensal() {
		int v = 0;
		if (this.getTipo() == "CC") {
			v = 12;
		} else if (this.getTipo() == "CP")
			v = 20;
		if (this.getStatus()) {
			this.setSaldo(this.getSaldo() - v);
			System.out.println("Mensalidade paga com sucesso" + this.getDono());
		} else
			System.out.println("Impossivel pagar");
	}

	// Métodos Construtor
	public ContaBanco() {
		this.setSaldo(0);
		this.setStatus(false);
		;
	}

	// Metodos get e set
	public int getNumConta() {
		return numConta;
	}

	public void setNumConta(int n) {
		this.numConta = n;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String t) {
		this.tipo = t;
	}

	public String getDono() {
		return dono;
	}

	public void setDono(String d) {
		this.dono = d;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double s) {
		this.saldo = s;
	}

	public boolean getStatus() {
		return status;
	}

	public void setStatus(boolean s) {
		this.status = s;
	}

	public String getBanco() {
		return banco;
	}

	public void setBanco(String banco) {
		this.banco = banco;
	}

}
