package control;

/**
 * Created by cuan on 9/9/15.
 */
public class GameTimer extends Thread {


	private EnemyController enemyController;
	private ServerControl serverControl;

	public GameTimer(EnemyController enemyController, ServerControl serverControl) {

		this.serverControl = serverControl;
		this.enemyController = enemyController;
	}


	@Override
	public void run() {
		while (true) {
			try {
				Thread.sleep(33);

				enemyController.update();
				serverControl.updateClients();


			} catch (Exception e) {
				System.out.println("GameTimer Error");
				e.printStackTrace();
			}
		}
	}
}