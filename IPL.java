package practice.spring.beans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class IPL {
	
	
	@Value("Mumbai Indians")
	private String Team_Name;
	@Value("Nikhil Teli")
	private String Player_Name;
	@Value("181")
	private int Best_Score;
	@Value("104")
	private int Strike_Rate;
	
	public String getTeam_Name() {
		return Team_Name;
	}
	public void setTeam_Name(String team_Name) {
		Team_Name = team_Name;
	}
	public String getPlayer_Name() {
		return Player_Name;
	}
	public void setPlayer_Name(String player_Name) {
		Player_Name = player_Name;
	}
	public int getBest_Score() {
		return Best_Score;
	}
	public void setBest_Score(int best_Score) {
		Best_Score = best_Score;
	}
	public int getStrike_Rate() {
		return Strike_Rate;
	}
	public void setStrike_Rate(int strike_Rate) {
		Strike_Rate = strike_Rate;
	}
	public void Display()
	{
		System.out.println("Team_Name :" +Team_Name);
		System.out.println("Player_Name :" +Player_Name);
		System.out.println("Best_Score :" +Best_Score);
		System.out.println("Strike_Rate :" +Strike_Rate);
		
		
	}
	
	
}

