package ladder123;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class App {
	public static Game[] games = new Game[10];

	public static void main(String[] args) {
		Project[] projects = new Project[10];
		Project proj = new Project();
		proj.name = "A";
		proj.desc = "A1";
		projects[0] = proj;
		
		proj = new Project();
		proj.name = "B";
		proj.desc = "B1";
		projects[1] = proj;
		
		proj = new Project();
		proj.name = "C";
		proj.desc = "C1";
		projects[2] = proj;
		
		proj = new Project();
		proj.name = "D";
		proj.desc = "D1";
		projects[3] = proj;
		
	
		for (int x = 0; x < projects.length; x++) {
			if (projects[x] != null) {
				System.out.println(projects[x].name);
			}
		}
		
		
		User[] users = new User[10];
		User user = new User();
		user.name = "超级管理员";
		user.loginName = "228228";
		user.passwd = "225225";
		users[0] = user;
		user = new User();
		user.name = "ChaoHe";
		user.loginName = "ChaoHe";
		user.passwd = "ChaoHe225";
		users[1] = user;
		user = new User();
		user.name = "Jenny";
		user.loginName = "Jenny";
		user.passwd = "Jenny225";
		users[2] = user;
		user = new User();
		user.name = "Lucy";
		user.loginName = "Lucy";
		user.passwd = "Lucy225";
		users[3] = user;
		user = new User();
		user.name = "Adam";
		user.loginName = "Adam";
		user.passwd = "Adam225";
		users[4] = user;
	

		Game game = new Game();
		game.user = user;
		game.project = projects[2];
		game.point = 1300;
		games[0] = game;
	
		game = new Game();
		game.user = user;
		game.project = projects[1];
		game.point = 1300;
		games[1] = game;	
		
		game = new Game();
		game.user = user;
		game.project = projects[1];
		game.point = 1300;
		games[2] = game;	
		
		
		game = new Game();
		game.user = user;
		game.project = projects[3];
		game.point = 1300;
		games[3] = game;	
		
		game = new Game();
		game.user = user;
		game.project = projects[4];	
		game.point = 1300;
		games[4] = game;	

		
		game = new Game();
		game.user = user;
		game.project = projects[5];
		game.point = 1600;
		games[5] = game;	
		
		
		game = new Game();
		game.user = user;
		game.project = projects[6];	
		game.point = 1700;
		games[6] = game;	

		
		game = new Game();
		game.user = user;
		game.project = projects[5];		
		game.point = 1600;
		games[7] = game;	
		
		game = new Game();
		game.user = user;
		game.project = projects[5];	
		game.point = 1100;
		games[8] = game;	
	
		game = new Game();
		game.user = user;
		game.project = projects[6];	
		game.point = 1700;
		games[9] = game;	
		
		
		
		
		for (int j = 0; j < users.length; j++) {
			  for (int x = 0; x < games.length; x++) {
				  if (games[x].user == users[j]) {
					    users[j].point += games[x].point ;
					   }
					  }
					 }
					 String[] array1 = {"入门","青铜","白银","黄金","白金","钻石","大师","王者"};
					 for (int x = 0; x < users.length; x++) {
					   users[x].rank = array1[users[x].point/300-1];
					   
					 }
	}
}
	

