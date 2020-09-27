
public interface PedidosState {

	//Todos os Estados do Pedido!
	PedidosState IrPedidoNovo();
	PedidosState IrPedidoAguardandoBoleto();
	PedidosState IrPedidoAprovado();
	PedidosState IrPedidoTransporte();
	PedidosState IrPedidoEntregue();
	PedidosState IrPedidoCancelado();
	PedidosState IrPedidoFinalizado();
	
	
}
