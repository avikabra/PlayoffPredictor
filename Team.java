/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package playoff.predictor;

/**
 *
 * @author home
 */
public class Team implements Comparable {
    private String team_name;
    private Double[] data;
    private boolean conf; // east = true, west = false
    
    public Team(String team_name, Double[] data) {
        this.team_name = team_name;
        this.data = data;
    }

    public String getTeam_name() {
        return team_name;
    }

    public void setTeam_name(String team_name) {
        this.team_name = team_name;
    }

    public Double[] getData() {
        return data;
    }

    public void setData(Double[] data) {
        this.data = data;
    }

    public boolean isConf() {
        return conf;
    }

    public void setConf(boolean conf) {
        this.conf = conf;
    }
    
    public int compareTo(Object o) {
        return (team_name.compareTo(((Team)o).getTeam_name()));
    }
    
    public String toString() {
        return team_name;// + ", RS Win%: " + (double)data[0]/(data[0] + data[1]);
    }
    
    public boolean equals(Object o) {
        return team_name.equals(((Team)o).getTeam_name());
    }
    
}
