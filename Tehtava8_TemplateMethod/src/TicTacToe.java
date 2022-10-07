import java.util.Arrays;
import java.util.HashMap;

public class TicTacToe extends Game{
	private String[][] gameBoard;
	private HashMap<Integer, String> playerMarks;
	private boolean makingPlay;
	private int turns;
	private String winner;

	@Override
	void initializeGame() {
		winner = null;
		turns = 0;
		
		gameBoard = new String[3][3];
		for (String[] row: gameBoard) {
			Arrays.fill(row, " ");
		}
		
		playerMarks = new HashMap<Integer, String>();
		playerMarks.put(0, "X");
		playerMarks.put(1, "O");
	}

	@Override
	void makePlay(int player) {
		placeMark(player);
		printBoard();
		turns++;
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	@Override
	boolean endOfGame() {
		if (findLine()) {
			return true;
		} else if (turns == 9) {
			return true;
		}
		return false;
	}

	@Override
	void printWinner() {
		if (winner != null) {
			System.out.println(winner + " wins!");
		} else {
			System.out.println("Draw!");
		}
	}
	
	private void placeMark(int player) {
		makingPlay = true;
		
		while (makingPlay) {
			int xPos = (int) (Math.random() * (4 - 1));
			int yPos = (int) (Math.random() * (4 - 1));
			
			if (gameBoard[yPos][xPos].equals(" ")) {
				gameBoard[yPos][xPos] = playerMarks.get(player);
				makingPlay = false;
			}
		}
	}
	
	private void printBoard() {
		System.out.println("-----");
		for (String[] row : gameBoard) {
			for (String x : row) {
				System.out.printf(x + " ");
			}
			System.out.println();
		}
		System.out.println("-----\n");
	}
	
	private boolean findLine() {
		for (int i = 0; i < 3; i++) {
			if (gameBoard[0][i].equals(gameBoard[1][i]) &&
				gameBoard[0][i].equals(gameBoard[2][i]) &&
				!gameBoard[0][i].equals(" ")) {
				winner = gameBoard[0][i];
				return true;
			}
		}
		
		for (int i = 0; i < 3; i++) {
			if (gameBoard[i][0].equals(gameBoard[i][1]) &&
				gameBoard[i][0].equals(gameBoard[i][2]) &&
				!gameBoard[i][0].equals(" ")) {
				winner = gameBoard[i][0];
				return true;
			}
		}
		
		if (gameBoard[0][0].equals(gameBoard[1][1]) &&
			gameBoard[0][0].equals(gameBoard[2][2]) &&
			!gameBoard[0][0].equals(" ")) {
			winner = gameBoard[0][0];
			return true;
		}
		
		if (gameBoard[0][2].equals(gameBoard[1][1]) &&
			gameBoard[0][2].equals(gameBoard[2][0]) &&
			!gameBoard[0][2].equals(" ")) {
			winner = gameBoard[0][2];
			return true;
		}
		
		return false;
	}
}