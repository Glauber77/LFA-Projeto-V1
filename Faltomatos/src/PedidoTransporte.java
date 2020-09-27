
public class PedidoTransporte implements PedidosState{

	//Possiveis Respostas de chamadas do Pedido,de acordo com o Diagrama.
	public PedidosState IrPedidoNovo() {
		System.out.print("Pedido ja em andamento!\n");  
		return null;
	}
	public PedidosState IrPedidoAguardandoBoleto() {
		System.out.print("Cliente pago boleto, continue!\n");  
		return null;
	}
	public PedidosState IrPedidoAprovado() {
		System.out.print("Pedido foi aprovado, continue!\n");  
		return null;
	}
	public PedidosState IrPedidoTransporte() {
		System.out.print("Pedido Esta Em Transporte!\n");  
		return null;
	}
	public PedidosState IrPedidoEntregue() {
		System.out.print("Pedido Chego no Cliente!\n");  
		return new PedidoEntregue();
	}
	public PedidosState IrPedidoCancelado() {
		System.out.print("Pedido nao pode ser Cancelado!\n");  
		return null;
	}
	public PedidosState IrPedidoFinalizado() {
		System.out.print("Pedido Ainda nao chego no cliente!\n");  
		return null;
	}
	
	
	
}
