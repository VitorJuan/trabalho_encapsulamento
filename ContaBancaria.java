package faculdade.trabalho_encapsulamento;

import java.util.Random;

public class ContaBancaria {

	private static final int WITHDRAW_OPERATION = 0;
	private static final int DEPOSIT_OPERATION = 1;
	
	private static final int ACCOUNT_ID_MIN_RAND_GENERATOR = 1;
	private static final int ACCOUNT_ID_MAX_RAND_GENERATOR = 50;
	
	private int accountID;
	private double balance;
	
	Random rand = new Random();
	
	//TODO: Implementar um sistema de log para poder identificar operações feitas na conta
	public ContaBancaria (int accountID, double balance) {
		this.accountID = accountID;
		this.balance = balance;
	}
	
	public ContaBancaria () {
		//Gera um numero aleatorio para a conta entre 1 e 50 (incluso)
        accountID = rand.nextInt(ACCOUNT_ID_MAX_RAND_GENERATOR - ACCOUNT_ID_MIN_RAND_GENERATOR + 1) + ACCOUNT_ID_MIN_RAND_GENERATOR;
        balance = 0;
	}
	
	private void atualizeBalance(double value, int operation) {
		switch (operation) {
			case WITHDRAW_OPERATION:
				balance = balance - value;
			break;
			
			case DEPOSIT_OPERATION:
				balance = balance + value;
			break;
		}
	}
	
	public void withdrawMoney(double value) {
		if (balance <= 0) {
			System.out.println("Erro ao tentar sacar o valor, saldo da conta negativo");
			System.exit(1);
		}
		
		if (value <= 0) {
			System.out.println("Erro ao tentar sacar o valor, valor desejado a sacar negativo");
			System.exit(1);
		}
		
		atualizeBalance(value, WITHDRAW_OPERATION);
	}
	
	public void depositMoney(double value) {
		if (value <= 0) {
			System.out.println("Erro ao tentar depositar o valor, valor desejado a depositar negativo");
			System.exit(1);
		}
		
		atualizeBalance(value, DEPOSIT_OPERATION);
	}
	
	
	public int getAccountId() {
		return accountID;
	}
	
	public double getAccountBalance() {
		return balance;
	}
}
