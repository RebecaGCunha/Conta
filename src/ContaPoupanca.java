public class ContaPoupanca extends CriarConta{
	private double limite= 500.0;  
	private double adicionar;
	 private double saldo;
	private double adicional;
	private double valorSaque;
	private double valorDeposito;
	  
	  
	  public ContaPoupanca(double valorDeposito, double valorSaque, String titular, int numeroConta, double saldo, double adicional, double limite){
			this.titular = titular;
			this.adicional = adicional;
			this.numeroConta = numeroConta;
			this.saldo = saldo;
		    this.valorSaque = valorSaque;  
		    this.valorDeposito = valorDeposito;
	   }
	   
	  public void adiconar(double adicional){
	      this.saldo= saldo + adicional;
	   }

	@Override
	public void sacar(double valor) {
		 if (valorSaque <= saldo)
       	  saldo = saldo - valorSaque;
     else 
	System.out.println("Saldo insuficiente!");
     }
		
	

	@Override
	public void depositar(double valor) {
		saldo = saldo + valorDeposito;
		
	}

	@Override
	public boolean tranferencia(CriarConta destino, double valor) {
		return false;
	}
	}
