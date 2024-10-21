package versus.service.interfaces;

import versus.model.Team;
import java.util.List;

public interface TeamService {
    Team getTeamById(int id);
    List<Team> getAllTeams();
    Team addTeam(Team team);
    Team updateTeam(Team team);
    void deleteTeam(int id);
}
