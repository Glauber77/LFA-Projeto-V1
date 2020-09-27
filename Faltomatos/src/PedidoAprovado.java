
public class PedidoAprovado implements PedidosState{

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
			System.out.print("Pedido pago, continue!\n");  
			return null;
		}
		public PedidosState IrPedidoTransporte() {
			System.out.print("Pedido Esta Em Transporte!\n");  
			return new PedidoTransporte();
		}
		public PedidosState IrPedidoEntregue() {
			System.out.print("Pedido ainda vai para transporte!\n");  
			return null;
		}
		public PedidosState IrPedidoCancelado() {
			System.out.print("Pedido Cancelado pelo cliente!\n");  
			return new PedidoCancelado();
		}
		public PedidosState IrPedidoFinalizado() {
			System.out.print("Pedido ainda nao foi entregue!\n");  
			return null;
		}
		
	}
