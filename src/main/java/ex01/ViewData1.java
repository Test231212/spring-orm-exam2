package ex01;

import ex01.model.User;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class ViewData1 {
    private int boardId;
    private String title;
    private String content;
    private User user;

    public ViewData1(DBData1 dbData) {
        this.boardId = dbData.getBoardId();
        this.title = dbData.getTitle();
        this.content = dbData.getContent();
        this.user = new User(dbData.getUserId(), dbData.getUsername(), dbData.getEmail());
    }
}
