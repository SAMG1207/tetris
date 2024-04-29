package tetris;

public class Tetris {
    
    private static GameForm gf;
    private static StartupForm sf;
    private static LeaderBoardForm lf;
    
    public static void start(){
        gf.setVisible(true);
        gf.startGame();
    }
    
    public static void showLeaderboard(){
        
        lf.setVisible(true);
    }

    public static void main(String[] args) {
        // TODO code application logic here
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                
                gf = new GameForm();
                sf= new StartupForm();
                lf = new LeaderBoardForm();
        
                sf.setVisible(true);
            }
        });
        
    }
    
}
