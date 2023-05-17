package mars.mips.SO.ProcessManager;

public class Escalonador {

	public Escalonador() {
    	Processos = new LinkedList<>();
	}

	public void adicionarProcesso(PCB processo) {
    	filaProcessos.offer(processo);
	}

	public PCB escalonar() {
    	return filaProcessos.poll();
	}
}
