package pl.raptors.raptorsRobotsApp.domain.robots;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Getter
@Setter
@Document(collection = "robots")
public class Robot {

    @Id
    private String id;
    private String robotIp;
    private Boolean available;
    private ExtraRobotElement extraRobotElement;
    private RobotModel model;

    public Robot(String robotIp, Boolean available, ExtraRobotElement extraRobotElement, RobotModel model)
    {
        this.robotIp = robotIp;
        this.available = available;
        this.extraRobotElement = extraRobotElement;
        this.model = model;
    }
}
