package boardgame;

public class Piece {
	
	protected Position position;
	private Board board;
	
	public Piece(Board board) {
		this.board = board;
		position = null;
	}

	protected Board getBoard() { //protected no tabuleiro é pra ser acessado apenas pelo tabuleiro ou subclasses de peça
		return board;
	}
}
