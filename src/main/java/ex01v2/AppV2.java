package ex01v2;

import ex01v2.model.User;

public class App2 {
    public static void main(String[] args) {
        // 1. DB에서 가져온 데이터 - Flat(평평) 하게 가져올 수 밖에 없다
        DBData2 dbData = new DBData2(1, "제목1", "내용1", 3, "love", "love@nate.com");

        // 2. dbData1를 ViewData1에 옮기시오 - ORM
        User user = new User(dbData.getUserId(), dbData.getUsername(), dbData.getEmail());
        ViewData2 v1 = new ViewData2(dbData.getBoardId(), dbData.getTitle(), dbData.getContent(), user);

        System.out.println(v1);


    }
}
