package mars.mips.SO.ProcessManager;

public class Escalonador {
	private Queue<PCB> filaProcessos;

	public Escalonador() {
    	filaProcessos = new LinkedList<>();
	}

	public void adicionarProcesso(PCB processo) {
    	filaProcessos.offer(processo);
	}

	public PCB escalonar() {
    	return filaProcessos.poll();
	}
}
