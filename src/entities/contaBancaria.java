package entities;

public class contaBancaria {
		private int numero;
		private String titular;
		private double valorDeposito;
		private double depositoInicial;
		
		
		/**
		 * @param numero
		 * @param titular
		 */
		public contaBancaria(int numero, String titular) {
			this.numero = numero;
			this.titular = titular;
		}
		/**
		 * @param numero
		 * @param titular
		 * @param valorDeposito
		 */
		public contaBancaria(int numero, String titular, double depositoInicial) {
			this.numero = numero;
			this.titular = titular;
			this.depositoInicial = depositoInicial;
		}
		/**
		 * @return apenas retorna o número da conta
		 */
		public int getNumero() {
			return numero;
		}
//		/**
//		 * @param numero the numero to set
//		 */
//		public void setNumero(int numero) {
//			this.numero = numero;
//		}
		

		/**
		 * @return Informa o nome do titular
		 */
		public String getTitular() {
			return titular;
		}
		/**
		 * @return the depositoInicial
		 */
		public double getDepositoInicial() {
			return depositoInicial;
		}
		/**
		 * @param depositoInicial the depositoInicial to set
		 */
		public void setDepositoInicial(double depositoInicial) {
			this.depositoInicial = depositoInicial;
		}
		/**
		 * @param Informe o nome do titular para entrar como parâmetro.
		 */
		public void setTitular(String titular) {
			this.titular = titular;
		}
		/**
		 * @return the valorDeposito
		 */
		public double getValorDeposito() {
			return valorDeposito;
		}
		public void addDinheiro(double valor) {
			this.valorDeposito += valor;
		}
		public void saqueDinheiro(double valor) {
			this.valorDeposito -= valor;
		}
		
		
		

}
