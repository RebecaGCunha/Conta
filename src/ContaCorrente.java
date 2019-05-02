
	public class ContaCorrente extends CriarConta{
		
		 int nomeCorrentista;
		 double taxaOperacao;
		 int numeroConta;
		 double saldo;
		 String titular;
		
		public ContaCorrente(String titular, double taxaOperacao, int numeroConta, double saldo){
			this.titular = titular;
			this.taxaOperacao = taxaOperacao;
			this.numeroConta = numeroConta;
			this.saldo = saldo;
		      
		}
		public ContaCorrente() {
			
		}
		 public void depositar(double valorDeposito){
		      saldo = saldo + valorDeposito;
		   }
		   
		 public void sacar(double valorSaque){
	              if (valorSaque <= saldo)
	            	  saldo = saldo - valorSaque;
		      else 
			System.out.println("Saldo insuficiente!");
		      }
		 
		 public void mostrarStatus(){
		      System.out.println("nomeCorrentista: ");
		      System.out.println("numeroConta: ");
		      System.out.println("taxaOperacao " + saldo);
		   }
		@Override
		public boolean tranferencia(CriarConta destino, double valor) {
			return false;
		}
		
		}

