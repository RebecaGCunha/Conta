public abstract class CriarConta {

	protected int numeroConta;
	private double saldo;
	protected String titular;
	
	public abstract void sacar(double valor);
	public abstract void depositar(double valor);
	public abstract boolean tranferencia(CriarConta destino, double valor);
	
		
	public int getNumeroConta() {
		return numeroConta;
	}
	
	public void setNumeroConta(int numeroConta) {
		this.numeroConta = numeroConta;
	}
	
	public double getSaldo() {
		return saldo;
	}
	
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	@Override
	public String toString() {
		return "Conta [numeroConta=" + numeroConta + ", saldo=" + saldo + "]";
	}
}
