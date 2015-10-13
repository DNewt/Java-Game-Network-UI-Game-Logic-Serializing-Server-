package tests;

import model.*;
import view.*;
import control.*;
import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

/**
 * These tests relate to actor creation and interaction.
 *
 *
 */
public class GameWorldTests {

	@Test
	public void test_player_move_no_collision() {
		GameState gameState =  makeStandardGameObjects();
		Player player = gameState.findPlayer(1);
		//System.out.println(player.getPosition().getxPos() );
		player.move(gameState, "RIGHT");
		//System.out.println(player.getPosition().getxPos() );
		assertTrue(player.getPosition().getxPos()==130);
	}

	@Test
	public void test_player_move_collision() {
		GameState gameState =  makeStandardGameObjects();
		Player player = gameState.findPlayer(1);
		//gameState.printGameObjectState();
		player.move(gameState, "LEFT");
		player.move(gameState, "LEFT");
		assertTrue(player.getPosition().getxPos()==120);
	}

	@Test
	public void test_player_move_locked_door() {
		GameState gameState =  makeStandardGameObjects();
		Player player = gameState.findPlayer(1);
		player.setPosition(new Position(385,350));
		player.move(gameState, "LEFT");
		player.move(gameState, "LEFT");
		player.move(gameState, "LEFT");
//		System.out.println(player.getPosition().getxPos());
		assertTrue(player.getPosition().getxPos()==380);
	}

	@Test
	public void test_player_move_key_door() {
		GameState gameState =  makeStandardGameObjects();
		Player player = gameState.findPlayer(1);

		player.setPosition(new Position(250,350, 45));
		gameState.printGameObjectState();
		System.out.println(player.hasKey());
		for(int i = 0; i<10;i++){
			player.move(gameState, "RIGHT");
		}
		gameState.printGameObjectState();
		assertTrue(player.getPosition().getxPos()==300);
	}

	@Test
	public void test_player_pickup_coin_no_coinbag() {
		GameState gameState =  makeStandardGameObjects();
		Player player = gameState.findPlayer(1);
		player.setPosition(new Position(1100,1100));
		for(int i = 0; i<5;i++){
			player.move(gameState, "RIGHT");
		}
		assertTrue(player.getInventory().getCoinCount()==1);
	}

	@Test
	public void test_correct_number_of_coins_inventory() {
		GameState gameState =  makeStandardGameObjects();
		Player player = gameState.findPlayer(1);
		player.setPosition(new Position(1100,1100));
		for(int i = 0; i<5;i++){
			player.move(gameState, "RIGHT");
		}
		assertTrue(player.getInventory().getCoinCount()==1);
	}

	@Test
	public void test_correct_number_items_inventory() {
		GameState gameState =  makeStandardGameObjects();
		Player player = gameState.findPlayer(1);
		player.setPosition(new Position(1100,1100));
		for(int i = 0; i<5;i++){
			player.move(gameState, "RIGHT");
		}
		assertTrue(player.getInventory().numItemsInContainer()==1);
	}

	@Test
	public void test_player_pickup_coin_with_coinbag() {
		GameState gameState =  makeStandardGameObjects();
		Player player = gameState.findPlayer(1);
		player.setPosition(new Position(1400,1100));
		for(int i = 0; i<50;i++){
			player.move(gameState, "RIGHT");
		}
		assertTrue(player.getInventory().getCoinBag().numItemsInContainer()==1);
	}

	@Test
	public void test_player_pickup__coinbag() {
		GameState gameState =  makeStandardGameObjects();
		Player player = gameState.findPlayer(1);
		player.setPosition(new Position(1400,1100));
		for(int i = 0; i<50;i++){
			player.move(gameState, "RIGHT");
		}
		assertTrue(player.getInventory().containsCoinBag());
	}


	@Test
	public void test_player_pickup_coin_full_inventory() {
		GameState gameState =  makeStandardGameObjects();
		Position pos = new Position(1,1);
		Inventory inv = new Inventory(pos,'a',false, false);
		// Position position, char imagePath, boolean collidable,boolean drawable
		for(int i = 0;i<100;i++){
			Coin coin = new Coin(pos,'a',false, false);
			inv.addItemToContainer(coin);
		}
		assertTrue(inv.numItemsInContainer()==9);
	}

	@Test
	public void test_player_drop_coin_no_longer_in_inventory() {
		GameState gameState =  makeStandardGameObjects();
		Position pos = new Position(1,1);
		Player player = gameState.findPlayer(1);
		Inventory inv = player.getInventory();
		Coin coin = new Coin(pos,'a',false, false);
		inv.addItemToContainer(coin);
		inv.removeItemFromContainer(coin);
		assertTrue(inv.numItemsInContainer()==0);
	}

	@Test
	public void test_player_drop_coin_now_drawable() {
		GameState gameState =  makeStandardGameObjects();
		Position pos = new Position(1,1);
		Player player = gameState.findPlayer(1);
		Inventory inv = player.getInventory();
		Coin coin = new Coin(pos,'a',false, false);
		inv.addItemToContainer(coin);
		inv.removeItemFromContainer(coin);
		assertTrue(coin.isDrawable());
	}

	@Test
	public void test_player_drop_coin_now_collidable() {
		GameState gameState =  makeStandardGameObjects();
		Position pos = new Position(1,1);
		Player player = gameState.findPlayer(1);
		Inventory inv = player.getInventory();
		Coin coin = new Coin(pos,'a',false, false);
		inv.addItemToContainer(coin);
		inv.removeItemFromContainer(coin);
		assertTrue(coin.isCollidable());
	}

	@Test
	public void test_player_full_inventory_pickup_coinbag() {
		GameState gameState =  makeStandardGameObjects();
		Position pos = new Position(1,1);
		Inventory inv = new Inventory(pos,'a',false, false);
		for(int i = 0;i<100;i++){
			Coin coin = new Coin(pos,'a',false, false);
			inv.addItemToContainer(coin);
		}
		CoinBag coinBag = new CoinBag(pos,'a',false, false);
		inv.addItemToContainer(coinBag);
		assertTrue(inv.numItemsInContainer()==1);
	}

	@Test
	public void test_player_full_inventory_pickup_key() {
		GameState gameState =  makeStandardGameObjects();
		Position pos = new Position(1,1);
		Inventory inv = new Inventory(pos,'a',false, false);
		for(int i = 0;i<100;i++){
			Coin coin = new Coin(pos,'a',false, false);
			inv.addItemToContainer(coin);
		}
		Key key = new Key(pos,'a',false, false);
		inv.addItemToContainer(key);
//		System.out.println(inv.numItemsInContainer());
		assertTrue(inv.numItemsInContainer()==9);
	}


	@Test
	public void test_player_collision_enemy_player_fear_increase() {
		GameState gameState =  makeStandardGameObjects();
		Player player = gameState.findPlayer(1);
		player.setPosition(new Position(750, 800));
		for(int i = 0;i<10;i++){
			player.move(gameState, "RIGHT");
		}
		assertTrue(player.getFear()==6);
	}

	@Test
	public void test_player_collision_enemy_enemy_health_decrease() {
		GameState gameState =  makeStandardGameObjects();
		Player player = gameState.findPlayer(1);
		player.setPosition(new Position(1700, 800));
		Enemy enemy = new Enemy(new Position(1750,800),'a',true, true);
//		System.out.println(enemy.getHealth());
		for(int i = 0;i<10;i++){
			player.move(gameState, "RIGHT");
		}
//		System.out.println(enemy.getHealth());
		assertTrue(player.getFear()==6);
	}


	///////////////////////////////////////////////////////////////////
	//																 //
	//						HELPER METHODS							 //
	//																 //
	///////////////////////////////////////////////////////////////////

	/**
	 * Helper method which sets up key objects for the tests.
	 *
	 */
	private GameState makeStandardGameObjects() {

		Factory factory = new Factory();
		List<Actor> actors = new ArrayList<>();
		Player player = factory.createPlayerActor(1);
		actors.add(player);
		Enemy enemy = factory.createEnemyActor(800, 800);
		actors.add(enemy);
		Coin coin = factory.createCoin(1150, 1100);
		actors.add(coin);
		Coin coin2 = factory.createCoin(1500, 1100);
		actors.add(coin2);
		CoinBag coinBag = factory.createCoinBag(1450, 1100);
		actors.add(coinBag);
		Door door = factory.createDoor(350, 350);
		actors.add(door);
		Key key = factory.createKey(300,350);
		actors.add(key);
		Wall wall = factory.createWall(90, 75);
		actors.add(wall);
		GameState gameState = new GameState(false);
		gameState.setActors(actors);
		return gameState;
	}

}