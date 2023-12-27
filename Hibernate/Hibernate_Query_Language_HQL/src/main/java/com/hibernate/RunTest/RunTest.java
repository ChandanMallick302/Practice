package com.hibernate.RunTest;

import com.hibernate.dao.CRUD.Player_CRUD;

public class RunTest {

	public static void main(String[] args) throws Exception {
		
		//Select All Player
//		Player_CRUD.selectAllPlayer();
		
		//select a player with condition
//		Player_CRUD.selectPlayerById(1);
		
		//select player list in descending with condition
//		Player_CRUD.selectPlayersNameListByAge(25,30);
		
		//select player in order by name in descending 
//		Player_CRUD.selectPlayerNameInAscending();
		
		//delete a specficPlayer by name
//		Player_CRUD.deletePlayerSpecific("Rajesh");
		
		//delete a AllPlayer by name
//		Player_CRUD.deleteAllPlayer();
		
		//update a specficPlayer by name
//		Player_CRUD.updatePlayerSpecific("Chandan","Peter");
		
		//update a AllPlayer by name
//		Player_CRUD.updateAllPlayer("Chandan");
		
		//select Two table by join key
//		Player_CRUD.selectTwotableData();
		
		//Implementing_Pagination
		Player_CRUD.Implementing_Pagination();
}
}