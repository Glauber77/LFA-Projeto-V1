
public class PedidoAguardandoBoleto implements PedidosState{

	//Possiveis Respostas de chamadas do Pedido,de acordo com o Diagrama.
		public PedidosState IrPedidoNovo() {
			System.out.print("Pedido ja em andamento!\n");  
			return null;
		}	
		public PedidosState IrPedidoAguardandoBoleto() {
			System.out.print("Pedido Aguardando Cliente pagar boleto!\n");  
			return null;
		}
		public PedidosState IrPedidoAprovado() {
			System.out.print("Pedido foi aprovado, boleto pago!\n");  
			return new PedidoAprovado();
		}
		public PedidosState IrPedidoTransporte() {
			System.out.print("Pedido nao foi aprovado, aguardando pagamento!\n");  
			return null;
		}
		public PedidosState IrPedidoEntregue() {
			System.out.print("Pedido nao foi aprovado, aguardando pagamento!\n");  
			return null;
		}
		public PedidosState IrPedidoCancelado() {
			System.out.print("Pedido Cancelado pelo cliente!\n");  
			return new PedidoCancelado();
		}
		public PedidosState IrPedidoFinalizado() {
			System.out.print("Pedido nao foi aprovado, aguardando pagamento!\n");  
			return null;
		}
		
		
}
