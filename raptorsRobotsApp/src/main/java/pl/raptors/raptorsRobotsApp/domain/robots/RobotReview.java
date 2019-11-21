package pl.raptors.raptorsRobotsApp.domain.robots;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import pl.raptors.raptorsRobotsApp.domain.enums.ReviewType;

import java.util.Date;

@Getter
@Setter
@Document(collection = "robot_reviews")
public class RobotReview {

    @Id
    private String id;
    private Robot robot;
//    private Date plannedDate;
    private String plannedDate; // na potrzeby przykładowych danych zmieniłem na string
//    private Date realizationDate;
    private String realizationDate; // na potrzeby przykładowych danych zmieniłem na string
    private ReviewType reviewType;

    public RobotReview(Robot robot, String plannedDate, String realizationDate, ReviewType reviewType)
    {
        this.robot = robot;
        this.plannedDate = plannedDate;
        this.realizationDate = realizationDate;
        this.reviewType = reviewType;
    }
}
