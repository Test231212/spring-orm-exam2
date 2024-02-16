package ex01v2;

import ex01v2.model.User;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class ViewDataV2 {
    private int boardId;
    private String title;
    private String content;
    private User user;

    public ViewDataV2(DBDataV2 dbData) {
        this.boardId = dbData.getBoardId();
        this.title = dbData.getTitle();
        this.content = dbData.getContent();
        this.user = new User(dbData.getUserId(), dbData.getUsername(), dbData.getEmail());
    }
}
