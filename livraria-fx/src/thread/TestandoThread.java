package thread;

public class TestandoThread {

	public static void main(String[] args) {
		/*
		ExportadorDeCSV exportador = new ExportadorDeCSV();
		Thread thread = new Thread(exportador);
		thread.start();
		System.out.println("Terminei de rodar o main");
		*/
		new Thread(new Runnable() {
			
			@Override
			public void run() {
				System.out.println("Rodando em paralelo!");				
			}
		}).start();
		System.out.println("Terminei de rodar o main");
	}
}
