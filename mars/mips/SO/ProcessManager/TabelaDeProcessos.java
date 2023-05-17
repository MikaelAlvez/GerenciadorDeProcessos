package mars.mips.SO.ProcessManager;

public class TabelaDeProcessos {
	private List<PCB> processos;

	public TabelaDeProcessos() {
    	processos = new ArrayList<>();
	}

	public void adicionarProcesso(int pid, String estado) {
    	PCB pcb = new PCB(pid, estado);
    	processos.add(pcb);
	}

	public void removerProcesso(int pid) {
    	for (PCB processo : processos) {
        	if (processo.getPid() == pid) {
            	processos.remove(processo);
            	break;
        	}
    	}
	}

	public PCB obterProcessoPorPid(int pid) {
    	for (PCB processo : processos) {
        	if (processo.getPid() == pid) {
            	return processo;
        	}
    	}
    	return null;
	}

	public void listarProcessos() {
    	for (PCB processo : processos) {
        	System.out.println("PID: " + processo.getPid() + ", Estado: " + processo.getEstado());
    	}
	}
}
