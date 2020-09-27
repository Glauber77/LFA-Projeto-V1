public class PedidoCancelado implements PedidosState{

	//Possiveis Respostas de chamadas do Pedido,de acordo com o Diagrama.
	public PedidosState IrPedidoNovo() {
		System.out.print("Pedido Cancelado pelo cliente!\n");  
		return null;
		}
	public PedidosState IrPedidoAguardandoBoleto() {
		System.out.print("Pedido Cancelado pelo cliente!\n");  
		return null;
	}
	public PedidosState IrPedidoAprovado() {
		System.out.print("Pedido Cancelado pelo cliente!\n");  
		return null;
	}
	public PedidosState IrPedidoTransporte() {
		System.out.print("Pedido Cancelado pelo cliente!\n");  
		return null;
	}
	public PedidosState IrPedidoEntregue() {
		System.out.print("Pedido Cancelado pelo cliente!\n");  
		return null;
	}
	public PedidosState IrPedidoCancelado() {
		System.out.print("Pedido Cancelado pelo cliente!\n");  
		return null;
	}
	public PedidosState IrPedidoFinalizado() {
		System.out.print("Pedido Cancelado pelo cliente!\n");  
		return null;
	}
	
	
	
}