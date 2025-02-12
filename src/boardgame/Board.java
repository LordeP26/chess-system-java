package boardgame;

public class Board {
	
	private int rows; // tamanho das linhas do tabuleiro
	private int columns; //tamanho de colunas do tabuleiro	
	private Piece[][] pieces; //vect de pecas 
	
	public Board(int rows, int columns) {
		this.rows = rows;
		this.columns = columns;
		pieces = new Piece[rows][columns];
	}

	public int getRows() {
		return rows;
	}

	public void setRows(int rows) {
		this.rows = rows;
	}

	public int getColumns() {
		return columns;
	}

	public void setColumns(int columns) {
		this.columns = columns;
	}
	
	public Piece piece(int row, int column) { // posição da peça no vect
		return pieces[row][column];
	}
	
	public Piece piece(Position position) { // mudança da posição da peça
		return pieces[position.getRow()][position.getColumn()];
	}
	
	public void placePiece(Piece piece, Position position) {
		pieces[position.getRow()][position.getColumn()] = piece;
		piece.position = position;
	}
	
}
