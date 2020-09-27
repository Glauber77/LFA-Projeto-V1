
public class Estados {
	
	protected PedidosState stats;
	//Inicia no Pedido Novo!
	public Estados() { 
		stats = new PedidoNovo();
	}
	
	public void IrPedidoAguardandoBoleto() {
		stats = stats.IrPedidoAguardandoBoleto();
	}
	
	public void IrPedidoAprovado() {
		stats = stats.IrPedidoAprovado();
	}
	
	public void IrPedidoTransporte() {
		stats = stats.IrPedidoTransporte();
	}
	
	public void IrPedidoEntregue() {
		stats = stats.IrPedidoEntregue();
	}
	
	public void IrPedidoCancelado() {
		stats = stats.IrPedidoCancelado();
	}
	
	public void IrPedidoFinalizado() {
		stats = stats.IrPedidoFinalizado();
	}
}
