package com.hibernate.RunTest;

import com.hibernate.dao.CRUD.Player_CRUD;

public class RunTest {

	public static void main(String[] args) throws Exception {
		
		//Select All Player
//		Player_CRUD.selectAllPlayer();
		
		//select a player with condition
//		Player_CRUD.selectPlayerById(1);
		
		// insert a player
		Player_CRUD.insertPlayer(5,28,"Ramesh");
}
}
